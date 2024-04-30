package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcEqpEnfInfo {
	private String	tfcEnfId;						//단속 ID
	private String	tfcEnfEqpId;					//단속장비 ID
	private Long idx;								//단속번호 idx
	private Date	crDt;							//생성일
	private String crtr;							//생성자
}
