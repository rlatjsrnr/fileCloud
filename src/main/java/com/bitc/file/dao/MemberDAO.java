package com.bitc.file.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bitc.file.vo.MemberVO;

public interface MemberDAO {
	
	@Insert("INSERT INTO member VALUES(#{id}, #{password}, #{name})")
	int join(MemberVO vo);
	
	@Select("SELECT * FROM member WHERE id=#{id} AND password=#{password}")
	MemberVO login(MemberVO vo);
}
