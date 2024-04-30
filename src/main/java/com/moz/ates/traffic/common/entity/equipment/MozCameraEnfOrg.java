package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozCameraEnfOrg extends SearchOption {
	private Long idx;
	private String code; 
	private Integer enforceLane;
	private Integer avgSpeed;
	private Integer enforceSpeed;
	private Integer signalSystem;
	private Integer signalInfo;
	private Integer enforceMode;
	private Integer time;
	private String addr;
	private Date enforceTime;
	private String carPlate;
	private Integer enforceCode;
	private Integer speedLimit;
	private Date crDt;
	
	//Join table
	MozTfcEnfEqpMaster tfcEnfEqpMatser;
	
	//none col
	private String tfcEqpEnfYn;						//단속 여부
}
