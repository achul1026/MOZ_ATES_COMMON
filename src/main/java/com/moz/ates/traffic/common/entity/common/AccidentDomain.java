package com.moz.ates.traffic.common.entity.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AccidentDomain {

	private String tfcAcdntId;
	
	private String roadAddr;
	
	private String lat;
	
	private String lng;
	
	public Double getLatDouble() {
		return Double.parseDouble(this.lat);
	}
	
	public Double getLngDouble() {
		return Double.parseDouble(this.lng);
	}
}
