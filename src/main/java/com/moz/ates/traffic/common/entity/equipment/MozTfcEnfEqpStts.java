package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozTfcEnfEqpStts {
	private String logId;				//로그Id
	private String tfcEnfEqpId;			//단속장비 고유번호
	private String sysStts;				//시스템상태(정상/이상)
	private String eqpDoorStts;			//함체문상태
	private String eqpTemp;				//함체온도
	private String eqpPanStts;			//함체 팬상태
	private String eqpHeaterStts;		//함체 히터상태
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;				//생성일
}
