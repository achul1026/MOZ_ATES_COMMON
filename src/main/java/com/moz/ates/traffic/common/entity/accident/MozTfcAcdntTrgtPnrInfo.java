package com.moz.ates.traffic.common.entity.accident;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcAcdntTrgtPnrInfo {
	private String acdntTrgtPnrId;				//사고 승객정보 고유번호
	private String acdntTrgtId;					//사고 타겟 고유 번호
	private String tfcAcdntId;					//교통사고 정보 고유 번호
	private String pnrDvrLcenId;				//승객자 라이센스 정보
	private String dvrLcenTy;					//승객자 라이센스 타입
	private String pnrNm;						//승객자 명
	private String pnrAddr;						//승객자 주소
	private String pnrBrth;						//승객자 생년월일
	private String pnrPno;						//승객자 연락처
	private String pnrEmail;					//승객자 이메일 주소
	private String pnrDmgCd;					//승객자 부상 정도
	private String pnrDmgDesc;					//승객자 피해 상세
	private Long pnrSortNo;						//승객자 정렬 순서
	private Date crDt;							//생성일
	private String crtr;						//생성자
	private String pnrDrvrRltnCd;				//운전자와의 관계
	private String drvYn;						//운전여부
	private String pnrDeadYn;					//사망여부
	
	// NONE Column
	private String pnrDmgCdNm;
	private String pnrDrvrRltnCdNm;
}