package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import com.moz.ates.traffic.common.entity.law.MozTfcLwFineInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;

import lombok.Data;

@Data
public class MozTfcEnfFineInfo {
	private String tfcEnfId;					//단속정보 고유번호
	private String tfcLawFineId;				//법률 범칙금 고유 아이디
	private String tfcLawId;					//법률 아이디
	private Float  tfcEnfPrice;					//단속 금액
	private Date	tfcEnfDt;						//생성일
	
	// JOIN table
	private MozTfcLwFineInfo tfcLwFineInfo;
	private MozTfcLwInfo tfcLwInfo;
}
