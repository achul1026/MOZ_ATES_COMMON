package com.moz.ates.traffic.common.entity.log;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcUserLog extends SearchOption{
	private String userLogId;			// 사용자 로그 아이디
	private String logCateCd;			// 로그 카테고리
	private String logCntn;				// 로그 내용
	private String logRslt;				// 성공여부
	private Date   crDt;				// 생성일시
	private String crtr;				// 생성자
	private String crtrIpAddr;			// 생성자 IP 주소
	
	// 조인 테이블
	private MozCmCd cmCd;
}
