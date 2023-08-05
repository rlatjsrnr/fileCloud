package com.bitc.file.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bitc.file.dao.FileDAO;
import com.bitc.file.vo.FileVO;
import com.bitc.file.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
	
	@Autowired
	private final FileDAO fd;
	
	@Override
	public void upload(MultipartFile image, HttpServletRequest request) {
		
		MemberVO loginMember = (MemberVO) request.getSession().getAttribute("loginMember");
		String dirPath = request.getServletContext().getRealPath(request.getContextPath())+"\\"+loginMember.getId();
		System.out.println(dirPath);
		String extension = null;
		 if (!image.isEmpty()) {
			 // getContentType의 반환값이 MIME type - ex) image/jpg
			 extension = image.getContentType().split("/")[1];
	       	}
		String imageId = UUID.randomUUID().toString() +"."+extension; 
		System.out.println(imageId);
		FileVO fileVO = new FileVO(
					null,
					image.getOriginalFilename(),
					imageId,
					dirPath
				); 
		fd.insertImg(fileVO);
		
		File file = new File(dirPath, imageId);
				
		if (file.canRead()) {
            System.out.println("File is readable.");
        } else {
            System.out.println("File is not readable.");
        }

        // Check if the file is writable
        if (file.canWrite()) {
            System.out.println("File is writable.");
        } else {
            System.out.println("File is not writable.");
        }

        // Check if the file is executable
        if (file.canExecute()) {
            System.out.println("File is executable.");
        } else {
            System.out.println("File is not executable.");
        }
		
		System.out.println(file.getAbsolutePath());
		if (!file.exists()) {
			file.mkdirs();
		}
		try {
			image.transferTo(file);
		} catch (IllegalStateException e) {
			System.out.println("ille");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ioe");
			e.printStackTrace();
		}
		
	}
}
