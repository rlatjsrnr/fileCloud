package com.bitc.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bitc.file.service.FileService;

@Controller
public class FileController {
	
	@Autowired
	FileService fs;
	
	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile image, HttpServletRequest request) {
		fs.upload(image, request);
		return "main";
	}
	
}
