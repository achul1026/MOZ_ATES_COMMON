package com.moz.ates.traffic.common.enums;

import lombok.Getter;

@Getter
public enum SignalInfo {
	
	RED_SIGNAL(0,"Red Signal"),
	YELLOW_SIGNAL(1,"Yellow signal"),
	LEFT_TURN_SIGNAL(2,"Left turn signal"),
	GREEN_SIGNAL(3,"Green signal")
	;
	
	private Integer code;
	private String name;
	
	private SignalInfo(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static SignalInfo getCNameForCode(Integer code) {
		for(SignalInfo r : SignalInfo.values()) {
			if(r.code.equals(code)) {
				return r;
			}
		}
		return null;
	}
}
