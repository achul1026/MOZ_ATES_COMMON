package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcFacilityLog extends SearchOption{
	private String tfcFacilityLogId;		// 교통시설물 로그 아이디
	private String tfcFacilityId;		// 교통시설물 아이디
	private String tfcFacilityStts;			// 교통시설물 상태
	private Date   crDt;				//생성일
	private String crtr;				//생성자 아이디
	
	// 조인테이블
	private MozTfcFacilityLog tfcFacilityLog;
}
