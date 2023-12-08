package com.moz.ates.traffic.common.entity.equipment;

import lombok.Data;

@Data
public class MozTfcFacilityStts {
	private String idx;			// idx
	private String dt;			// 날짜
	private String ty;			// 교통 시설물 타입
	private String pymntAmt;	// 총 수
}
