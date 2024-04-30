package com.moz.ates.traffic.common.entity.common;

import lombok.Data;

@Data
public class UploadFileInfo {
	String fileNm;
	String filePath;
	Long   fileSize = 0L;
	String originalFileNm;
	String uploadTime;
	byte[] atchFile;
	String fileExt;
}
