package com.moz.ates.traffic.common.entity.log;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.util.MozatesCommonUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcSystmErrLog extends SearchOption{
	private String systmErrLogId;		// 시스템 장애 로그 아이디
	private String logCateCd;			// 로그 카테고리
	private String logCntn;				// 로그 내용
	private String logRslt;				// 성공 여부
	private Date   crDt;				// 생성일시
	private String crtr;				// 생성자
	private String crtrIpAddr;			// 생성자 IP 주소
	
	// 조인 테이블
	private MozCmCd cmCd;

	public MozTfcSystmErrLog(String logCateCd, String logCntn, String logRslt) {
		this.systmErrLogId = MozatesCommonUtils.getUuid();
		this.logCateCd = logCateCd;
		this.logCntn = logCntn;
		this.logRslt = logRslt;
		this.crDt = new Date();
	}
	
	public MozTfcSystmErrLog() {
		super();
	}
	
	
}
