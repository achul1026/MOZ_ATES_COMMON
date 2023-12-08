package com.moz.ates.traffic.common.entity.equipment;

import lombok.Data;

@Data
public class MozTfcRoadLnCnrl {
	private String roadLnNo;					//차로번호
	private String tfcEnfEqpId;					//단속장비 고유번호
	private String useStts;						//단속여부
	private String tfcEnfMode;					//단속모드
}
