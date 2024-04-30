package com.moz.ates.traffic.common.entity.payment;


import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.finentc.MozFineNtcInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozFinePymntInfo extends SearchOption{
	private String pymntId;					// 결제고유번호
	private String fineNtcId;				// 고지관리 아이디
	private String placePymntId;			// 납부지 고유번호
	private Float totalPrice;				// 납부총금액
	private Date   pymntDt;					// 납부날짜
	private Float  pymntPrice;				// 납부금액
	private String pymntStts;				// 납부여부
	private String pymntMethod;				// 납부방법
	private String payerNm;					// 납부자
	private String pymntOprtr;				// 납부 담당자
	private Date crDt;						// 생성일
	private String crtr;					// 생성자
	private String penaltyname;				// 위반 내용
	private String polId;					// 경찰 고유번호
	private String penaltydetail;			// 위반사항 상세내용
	
	// 조인 테이블
	private MozTfcEnfMaster tfcEnfMaster;
	private MozCmCd cmCd;
	private MozPolInfo polInfo;
	private MozVioInfo vioInfo;
	private MozPlPymntInfo plPymntInfo;
	private MozTfcLwInfo tfcLwInfo;
	private MozFineNtcInfo fineNtcInfo;
	
	private String dateSearchType;
}
