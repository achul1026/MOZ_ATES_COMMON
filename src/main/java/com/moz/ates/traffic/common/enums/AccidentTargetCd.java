package com.moz.ates.traffic.common.enums;

public enum AccidentTargetCd {
	
	VEHICLE("ATT000", "Vehicle"),
	PERSON("ATT001", "Person"),
	;
	
	private String code;
	private String name;
	
	private AccidentTargetCd(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
