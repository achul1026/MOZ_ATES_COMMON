package com.moz.ates.traffic.common.entity.accident;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.common.MozCmCd;

import lombok.Data;

@Data
public class MozTfcAcdntTrgtInfo {
	private String acdntTrgtId;					//사고 타겟 고유번호
	private String tfcAcdntId;					//교통사고 정보 고유번호
	private String dvrLcenId;					//라이센스 고유번호
	private String acdntTrgtCd;					//사고 타겟 유형
	private String vhTy;						//차량타입
	private String vhRegNo;						//차량번호
	private String dvYn;						//운행 여부
	private String acdntDmgCd;					//사고 심각도
	private String acdntTrgtPno;				//사고자 연락처
	private String acdntTrgtBrth;				//사고자 생년월일
	private String acdntTrgtNm;					//사고자 명
	private Long   acdntTrgtSortNo;				//사고자 정렬 순서
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	private String deadYn;						//사망자 여부
	
	private String tfcAcdntTrgtPnrInfoStr;
	
	// NONE Column
	private String acdntTrgtCdNm;
	private String acdntDmgCdNm;
	
	private String roadAddr;
	private Date acdntDt;

	// 조인 테이블
	private MozCmCd cmCd;
	private List<MozTfcAcdntTrgtPnrInfo> tfcAcdntTrgtPnrInfo;
}