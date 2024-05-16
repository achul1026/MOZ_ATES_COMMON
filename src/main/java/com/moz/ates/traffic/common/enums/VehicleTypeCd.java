package com.moz.ates.traffic.common.enums;

import lombok.Getter;

@Getter
public enum VehicleTypeCd {
	;
	
	private String code;
	private String name;
	private String desc;
	
	private VehicleTypeCd(String code, String name,String desc) {
		this.code = code;
		this.name = name;
		this.desc = desc;
	}
	

	public static String getVehicleTypeCdNameForCode(String code) {
		for(VehicleTypeCd r : VehicleTypeCd.values()) {
			if(r.code.equals(code)) {
				return r.name;
			}
		}
		return null;
	}
}
