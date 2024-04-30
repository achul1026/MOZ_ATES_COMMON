package com.moz.ates.traffic.common.entity.enforcement;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcEnfHst extends SearchOption{
	private String hstId;					//히스토리 고유번호
	private String tfcEnfId;				//단속정보 고유번호
	private String tfcEnfRegTy;					//등록자 타입 코드
	private String tfcEnfPrcCd;				//단속정보 프로세스 코드
	private Date   crDt;					//생성일
	private String crtr;					//생성자
	private String cmnt;					//코멘트
	private String crtrIpAddr;				//생성자 IP 주소
	
	// 조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private MozPolInfo polInfo;
}
