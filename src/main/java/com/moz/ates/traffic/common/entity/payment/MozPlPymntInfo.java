package com.moz.ates.traffic.common.entity.payment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozPlPymntInfo extends SearchOption{
	private String placePymntId;				// 납부지 고유번호
	private String placePymntNm;				// 납부지 이름
	private String placePymntAddr;				// 납부지 주소
	private String placePymntRprsvNm;			// 납부 담당자 대표
	private String placePymntType;				// 납부처 유형
	private String placePymntCntc;				// 연락처
	private String operStrTm;					// 시작 시간
	private String operEndTm;					// 종료 시간
	private String clsdDt;						// 휴무일
	@DateTimeFormat(pattern = "yyyy-MM-dd")		
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						//생성일
	private String crtr;						// 생성자
}
