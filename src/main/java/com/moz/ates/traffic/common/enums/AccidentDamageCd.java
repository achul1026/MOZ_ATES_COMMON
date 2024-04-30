package com.moz.ates.traffic.common.enums;

public enum AccidentDamageCd {
	FATAL_INJURY("ADC000", "Fatal Injury"),
	MINOR_INJURY("ADC001", "Minor Injury"),
	MATERIAL_DAMAGE("ADC002", "Material Damage"),
	NONE_INJURY("ADC003", "None Injury")
	;
	
	private String code;
	private String name;
	
	private AccidentDamageCd(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static String getAcdntDamageCdNameForCode(String code) {
		for(AccidentDamageCd r : AccidentDamageCd.values()) {
			if(r.code.equals(code)) {
				return r.name;
			}
		}
		return null;
	}
}
