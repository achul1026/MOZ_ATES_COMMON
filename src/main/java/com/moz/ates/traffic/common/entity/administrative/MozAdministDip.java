package com.moz.ates.traffic.common.entity.administrative;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class MozAdministDip extends SearchOption{
	private String administDipId;		// 행정처분 아이디
	private String caseTy;				// 위반 유형
	private String count;				// 담당 법원
	private String proHoldYn;			// 영치 여부
	private String proholdAddr;			// 영치 주소
	private String penaltyPrice;		// 납부 금액
	private String dipDesc;				// 행정처분 상세 설명
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	
	// 조인 테이블
	private MozTfcEnfMaster tfcEnfMaster;
}
