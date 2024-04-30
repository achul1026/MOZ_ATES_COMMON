package com.moz.ates.traffic.common.entity.law;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcLwFineInfo {
	private String tfcLawId;					//법률아이디
	private String tfcLawFineId;				//법률 범칙금 아이디
	private String fineTitle;					//범칙금 제목
	private Float finePrice;						//범칙금 금액
	private Long fineSortLv;					//범칙금 정렬 레벨
	private String fineDesc;					//범칙금 설명
	private Date   crDt;						//생성일
	private Date   lastUpdDt;					//최신 수정일
}
