package com.moz.ates.traffic.common.enums;

import lombok.Getter;

@Getter
public enum CurrencyType {
	DOLLAR("DOLLAR","$"),
	MOZAMBIQUE_METICAL("MOZAMBIQUE_METICAL"," MT"),
	KRW("KRW","원")
	;
	
	private String currency;
	private String name;
	
	CurrencyType(String currency ,String name){
		this.currency = currency;
		this.name = name;
	};
	
	public static CurrencyType getCurrency(String currency) {
		for(CurrencyType r : CurrencyType.values()) {
			if(r.currency.equals(currency)) {
				return r;
			}
		}
		return null;
	}
}
