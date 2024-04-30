package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcEnfEqpLog extends SearchOption {
	private String logId;					//로그 idx
	private String tfcEnfEqpId; 			//단속장비 고유 번호
	private String roadLn;					//차로번호
	private String cntrlReqTy;				//제어 요청 타입(PTZ, 시간동기화 등)
	private String cntrlResult;				//제어결과
	private Date crDt;						//생성일
	private String crtr;					//생성자
	
	// 조인 테이블
	private MozCmCd cmCd;
	private MozTfcEnfEqpMaster enfEqpMaster;
}