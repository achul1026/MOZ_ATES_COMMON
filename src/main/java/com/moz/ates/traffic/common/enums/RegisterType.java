package com.moz.ates.traffic.common.enums;

public enum RegisterType {
	
	SUPER_ADMIN("RTC000", "Super Admin"),
	ADMIN_USER("RTC001", "Admin User"),
	OFFICE_OPERATOR("RTC002", "Office Operator"),
	POLICE_OPERATOR("RTC003", "Police Operator"),
	POLICE_OFFICER("RTC004","Police Officer")
	;
	
	private String code;
	private String name;
	
	private RegisterType(String code, String name) {
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
