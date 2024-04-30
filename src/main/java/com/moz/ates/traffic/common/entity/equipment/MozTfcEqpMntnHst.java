package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MozTfcEqpMntnHst {
	private String mntnHstId;				//이력PK
	private String tfcEnfEqpId;				//단속장비 ID
	private String oprtrId;					//담당자Id
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date crDt;						//생성일
	private String crtr;					//생성자
	private String mntnType;				//관리 타입
	private String mntnStts;				//관리 상태
	private String mntnDetail;				//관리 상세 내용
	
	//none Col
	private String oprtrNm;					//관리자
}
