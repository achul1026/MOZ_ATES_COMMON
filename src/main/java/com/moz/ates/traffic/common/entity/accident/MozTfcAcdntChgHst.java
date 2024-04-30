package com.moz.ates.traffic.common.entity.accident;

import java.sql.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcAcdntChgHst extends SearchOption{
	private String hstId;			// 히스토리 고유번호
	private String tfcAcdntId;		// 교통사고 정보 고유번호
	private String acdntRegTy;		// 사고 등록 타입
	private String acdntPrcCd;		// 교통사고 프로세스 코드
	private String cmnt;			// 코멘트
	private Date crDt;				// 생성일
	private String crtr;			// 생성자
	private String crtrIpAddr;		// 생성자 IP 주소
	
	// 조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private MozPolInfo polInfo;
	
}
