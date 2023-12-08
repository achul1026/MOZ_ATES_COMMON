package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcFacilityMaster extends SearchOption{
	private String tfcFacilityId;		// 교통시설물 아이디
	private String facilityTy;			// 교통시설물 종류 
	private String facilityStts;		// 교통시설물 상태
	private String facilityDesc;		// 교통시설물 상세 설명
	private String jur;					// 관할
	private String lat;					// 위도
	private String lng;					// 경도
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;				//생성일
	private String crtr;				//생성자 아이디
}
