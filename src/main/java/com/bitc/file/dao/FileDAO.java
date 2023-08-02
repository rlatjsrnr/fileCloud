package com.bitc.file.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface FileDAO {
	
	@Insert("INSERT INTO img VALUES(null, #{path}")
	int insertImg(String path);
	
	@Select("SELECT path FROM img WHERE num=#{num}")
	String downloadImg(int num);
}
