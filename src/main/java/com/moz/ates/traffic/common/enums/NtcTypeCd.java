package com.moz.ates.traffic.common.enums;

public enum NtcTypeCd {
	
	ADMINISTRATIVE_ACTION("NTT000", "행정 처분"),
	FIRST_NOTICE("NTT001", "1차 고지"),
	SECOND_NOTICE("NTT002", "2차 고지"),
	DELETE_NOTICE("NTT003", "고지삭제")
	;
	
	private String code;
	private String name;
	
	private NtcTypeCd(String code, String name) {
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
