package com.bitc.file.vo;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String password;
	private String name;
	
	public MemberVO() {}
	
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public MemberVO(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
}
