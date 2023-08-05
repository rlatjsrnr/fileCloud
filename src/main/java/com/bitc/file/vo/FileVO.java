package com.bitc.file.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileVO {
	private String imageId;
	private String originImageName;
	private String newImageName;
	private String ImagePath;
}
