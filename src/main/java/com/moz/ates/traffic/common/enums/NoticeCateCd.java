package com.moz.ates.traffic.common.enums;

public enum NoticeCateCd {
	PORTAL("NCT000", "Portal"),
	POLICE_APPLICATION("NCT001", "Police Application")
	;
	
	private String code;
	private String name;
	
	private NoticeCateCd(String code, String name) {
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
