package com.moz.ates.traffic.common.entity.accident;


import java.util.Date;

import lombok.Data;

@Data
public class MozTfcAcdntFileInfo {
	private String acdntFileNo;		// 교통사고 파일 번호
	private String filePath;		// 파일 경로
	private String fileOriginNm;	// 원본 파일명
	private String fileExt;			// 파일 확장자
	private String fileNm;			// 파일명
	private Long fileSize;			// 파일 사이즈
	private String crtr;			// 생성자
	private Date crDt;				// 생성일
	private String tfcAcdntId;		//교통사고 번호
}
