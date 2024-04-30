package com.moz.ates.traffic.common.enums;

public enum PymntMethod {
	
	CASH("PYM000", "CASH"),
	CHECK_CARD("PYM001", "Check Card"),
	CREDIT_CARD("PYM002", "Credit Card"),
	ACCOUNT_TRANSFER("PYM003", "Account Transfer")
	;
	
	private String code;
	private String name;
	
	private PymntMethod(String code, String name) {
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
