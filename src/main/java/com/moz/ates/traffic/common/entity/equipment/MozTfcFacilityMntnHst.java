package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;

@Data
public class MozTfcFacilityMntnHst {
	private String tfcFacilityLogId;		// 교통시설물 로그 아이디
	private String tfcFacilityId;		// 교통시설물 아이디
	private String mntnDetail;			// 관리 상세 내용
	private String mntnType;			// 관리유형
	private String mntnStts;			// 교통시설물 상태
	private Date   crDt;				//생성일
	private String crtr;				//생성자 아이디
	private String oprtrId;				//관리자 ID
	
	//조인 테이블
	private MozWebOprtr mozWebOprtr;
}
