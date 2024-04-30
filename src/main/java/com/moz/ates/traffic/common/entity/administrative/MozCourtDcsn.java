package com.moz.ates.traffic.common.entity.administrative;

import java.util.Date;

import lombok.Data;


@Data
public class MozCourtDcsn{
	private String courtDcsnId;			// 법원 판결 아이디
	private String administDipId;		// 행정처분 아이디
	private String courtMngr;			// 판결 담당자
	private String courtNm;				// 법원명
	private String dcsnStts;			// 판결 상태
	private long   finePrice;			// 벌금
	private String lawsuitType;			// 소송 유형
	private String lawViolatedNm;		// 위반 법률명
	private String dscnContent;			// 판결 내용
	private Date   crDt;						//생성일
	private String crtr;						//생성자
}
