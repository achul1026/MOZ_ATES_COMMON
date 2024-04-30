package com.moz.ates.traffic.common.entity.administrative;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class MozAdministDip extends SearchOption{
	private String administDipId;		// 행정처분 아이디
	private String tfcEnfId;			// 단속 아이디
	private String vioId;				// 위반자 ID
	private String tfcLawId;			// 위반 법령 ID
	private String caseTy;				// 위반 유형
	private String court;				// 담당 법원
	private String proHoldYn;			// 영치 여부
	private String proHoldAddr;			// 영치 주소
	private String penaltyPrice;		// 납부 금액
	private Date proHoldDt;				// 영치 일시
	private String dipDesc;				// 행정처분 상세 설명
	private String processYn;			// 처리 여부
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	
	
	// 조인 테이블
	private MozTfcEnfMaster tfcEnfMaster;
	private MozVioInfo vioInfo;
	private MozCmCd cmCd;
}
