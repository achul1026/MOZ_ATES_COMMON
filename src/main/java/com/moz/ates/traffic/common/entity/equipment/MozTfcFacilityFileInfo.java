package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcFacilityFileInfo {
	private String tfcFacilityFileNo;		//교통시설물 파일 번호
	private String tfcFacilityId;			//교통시설물 아이디
	private String filePath;				//파일 경로
	private String fileOrgNm;				//원본 파일명
	private String fileNm;					//저장 파일명
	private Long fileSize;					//파일 사이즈
	private String fileExt;					//파일 확장자
	private Date crDt;						//등록일시
	private String crtr;					//등록자
}
