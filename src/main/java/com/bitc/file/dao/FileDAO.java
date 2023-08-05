package com.bitc.file.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bitc.file.vo.FileVO;

public interface FileDAO {
	
	@Insert("INSERT INTO image VALUES(null, #{originImageName}, #{newImageName}, #{imagePath})")
	int insertImg(FileVO file);
	
	@Select("SELECT path FROM img WHERE num=#{num}")
	String downloadImg(int num);
}
