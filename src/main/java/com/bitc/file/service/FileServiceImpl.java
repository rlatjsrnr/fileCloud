package com.bitc.file.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.file.dao.FileDAO;
import com.bitc.file.vo.MemberVO;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	FileDAO fd;
	
	@Override
	public void upload(HttpServletRequest request) {
		MemberVO loginMember = (MemberVO) request.getSession().getAttribute("loginMember");
		String imgPath = request.getParameter("upload");
		String dirPath = request.getServletContext().getRealPath(request.getContextPath())+"\\"+loginMember.getId();
		System.out.println(imgPath);
		System.out.println(dirPath);
		File file = new File(dirPath, imgPath);
		PrintStream ps = null;
		
		try {
			ps = new PrintStream(new FileOutputStream(file),true);
			System.out.println(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(ps != null) ps.close();
		}
	}
}
