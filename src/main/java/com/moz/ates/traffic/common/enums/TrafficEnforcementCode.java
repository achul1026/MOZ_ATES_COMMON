package com.moz.ates.traffic.common.enums;

import lombok.Getter;

@Getter
public enum TrafficEnforcementCode {
	
	SPEED(0,"Speed"),
	BUS(1,"bus"),
	SIGNAL(2,"Signal")
	;
	
	private Integer code;
	private String name;
	
	private TrafficEnforcementCode(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static TrafficEnforcementCode getCNameForCode(Integer code) {
		for(TrafficEnforcementCode r : TrafficEnforcementCode.values()) {
			if(r.code.equals(code)) {
				return r;
			}
		}
		return null;
	}
}
