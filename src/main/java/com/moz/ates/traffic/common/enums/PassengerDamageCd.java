package com.moz.ates.traffic.common.enums;

public enum PassengerDamageCd {
	NO_INJURIES("PDC000", "No Injuries"),
	INJURY("PDC001", "Injury"),
	MINOR_INJURY("PDC002", "Minor Injury"),
	MODERATE_INJURY("PDC003", "Moderate Injury"),
	FATALITY("PDC004", "Fatality"),
	;
	
	private String code;
	private String name;
	
	private PassengerDamageCd(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static String getPassengerDamageCdNameForCode(String code) {
		for(PassengerDamageCd r : PassengerDamageCd.values()) {
			if(r.code.equals(code)) {
				return r.name;
			}
		}
		return null;
	}
	
}
