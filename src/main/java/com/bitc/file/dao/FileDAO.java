package com.bitc.file.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bitc.file.vo.FileVO;

public interface FileDAO {
	
	@Insert("INSERT INTO image VALUES(null, #{imageName}, #{imageId}, #{imagePath})")
	int insertImg(FileVO file);
	
	@Select("SELECT imagePath FROM image WHERE num=#{imageNum}")
	String downloadImg(int num);
}
