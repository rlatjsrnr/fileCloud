package com.bitc.file.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public void upload(MultipartFile image, HttpServletRequest request);
	
}
