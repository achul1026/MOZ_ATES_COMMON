package com.moz.ates.traffic.common.entity.accident;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcAcdntMaster extends SearchOption{
	private String tfcAcdntId;					// 교통사고 정보 고유번호
	private String acdntVhGrpId;				// 교통사고 차량 그룹 아이디
	private String vhRegNo;						// 차량번호
	private String vhTy;						// 차량타입
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date acdntDt;						// 사고날짜
	private String lastAcdntPrcCd;				// 교통사고 최종 프로세스 코드
	private String lat;							// 위도
	private String lng;							// 경도
	private String roadAddr;					// 사고지역(도로)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;						// 생성일
	private String crtr;						// 생성자
	
	// 조인 테이블
	private MozVioInfo vioInfo;
	private MozCmCd cmCd;
	//TODO polInfo 테이블로 교체 필요
	private String polId;	
}
