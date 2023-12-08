package com.moz.ates.traffic.common.entity.payment;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozFinePymntInfo extends SearchOption{
	private String pymntId;					// 결제고유번호
	private String tfcEnfId;				// 단속정보 고유번호
	private String placePymntId;			// 납부지 고유번호
	private String totalPrice;				// 납부총금액
	private String pymntDt;					// 납부날짜
	private String pymntPrice;				// 납부금액
	private String pymntStts;				// 납부여부
	private String pymntMethod;				// 납부방법
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date pymntDdln;					// 납부기한
	private String payerNm;					// 납부자
	private String pymntOprtr;				// 납부 담당자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;						// 생성일
	private String crtr;					// 생성자
	private String penaltyname;				// 위반 내용
	private String polId;					// 경창 고유번호
	private String penaltydetail;			// 위반사항 상세내용
	
	// 조인 테이블
	private MozTfcEnfMaster tfcEnfMaster;
	private MozCmCd cmCd;
	private MozPolInfo polInfo;
}
