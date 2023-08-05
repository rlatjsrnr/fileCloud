package com.bitc.file.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		//String dirPath = "C:\\Users\\ksk42\\Desktop";
		String dirPath = request.getServletContext().getRealPath(request.getContextPath())+"\\"+loginMember.getId();
		String extension = null;
		 if (!image.isEmpty()) {
	            String contentType = image.getContentType();
	            if (contentType.contains("image/jpeg")) {
	                extension = ".jpg";
	            } else if (contentType.contains("image/png")) {
	                extension = ".png";
	            } else if (contentType.contains("image/gif")) {
	                extension = ".gif";
	       		}else {
	       			return;
	       		}
	       	}
		String newImageName = UUID.randomUUID().toString() + extension; 
		FileVO fileVO = new FileVO(
					null,
					image.getOriginalFilename(),
					newImageName,
					dirPath
				); 
		System.out.println(fileVO);
		fd.insertImg(fileVO);
		
		File file = new File(dirPath, image.getOriginalFilename());
		if (!file.exists()) {
			file.mkdirs();
		}
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(file,true),true);
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
