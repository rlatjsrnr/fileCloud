package com.bitc.file.service;

import javax.servlet.http.HttpServletRequest;

import com.bitc.file.vo.MemberVO;

public interface MemberService {
	
	public int join(MemberVO vo, HttpServletRequest request); 
	
	public MemberVO login(MemberVO vo);
	
}
