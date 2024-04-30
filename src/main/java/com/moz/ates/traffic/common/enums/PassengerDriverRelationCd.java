package com.moz.ates.traffic.common.enums;

public enum PassengerDriverRelationCd {
	SELF("PDR000", "Self"),
	FAMILY("PDR001", "Family"),
	FREIND("PDR002", "Freind"),
	STRANGER("PDR003", "Stranger")
	;
	
	private String code;
	private String name;
	
	private PassengerDriverRelationCd(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static String getPassengerDriverRelationCdNameForCode(String code) {
		for(PassengerDriverRelationCd r : PassengerDriverRelationCd.values()) {
			if(r.code.equals(code)) {
				return r.name;
			}
		}
		return null;
	}
}
