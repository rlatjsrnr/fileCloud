package com.bitc.file.controller;

import java.io.File;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bitc.file.service.MemberService;
import com.bitc.file.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService ms;
	
	String nextPage = null;
	
	@GetMapping("join")
	public void join() {
		System.out.println("회원가입 페이지 요청");
	}
	
	@PostMapping("login")
	public String login(MemberVO vo, HttpSession session) {
		MemberVO member = ms.login(vo);
		if(member != null) {
			session.setAttribute("loginMember", member);
			nextPage = "main";
		}
		return nextPage;
	}
	
	@PostMapping("joinSubmit")
	public String joinSubmit(MemberVO vo, Model model, HttpServletRequest request) {
		int result = ms.join(vo, request);
		if(result > 0) {
			String message = "회원가입 성공";
			model.addAttribute("messge", message);
			nextPage = "home";
		}		
		return nextPage;
	}
	
}
