package com.bitc.file.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.file.dao.MemberDAO;
import com.bitc.file.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	@Override
	public int join(MemberVO vo, HttpServletRequest request) {
		int result = dao.join(vo);
		if(result > 0) {
			String path = request.getServletContext().getRealPath(request.getContextPath());
			File file = new File(path+"/"+vo.getId());
			if(!file.exists()) {
				file.mkdirs();
			}
		}
		return result;
	}

	@Override
	public MemberVO login(MemberVO vo) {
		return dao.login(vo);
	}

}
