package com.bitc.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.bitc.file.service.FileService;

@Controller
public class FileController {
	
	@Autowired
	FileService fs;
	
	@PostMapping("upload")
	public String upload(HttpServletRequest request) {
		fs.upload(request);
		return "main";
	}
	
}
