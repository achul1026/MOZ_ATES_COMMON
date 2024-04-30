package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcEnfEqpFileInfo {
	private String eqpFileNo;			//단속장비 파일번호
	private String tfcEnfEqpId;			//단속장비 아이디
	private String filePath;			//파일 경로
	private String fileOrgNm;			//원본파일명
	private String fileNm;				//저장파일명
	private Long fileSize;				//파일사이즈
	private String fileExt;				//파일확장자
	private Date crDt;					//생성일시
	private String crtr;				//생성자
}
