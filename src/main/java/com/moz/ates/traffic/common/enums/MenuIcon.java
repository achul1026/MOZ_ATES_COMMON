package com.moz.ates.traffic.common.enums;

import lombok.Getter;

@Getter
public enum MenuIcon {
	MAIN("main","fas fa-car"),
	DASHBOARD("dashboard","fas fa-fw fa-tachometer-alt"),
	TRAFFIC_ENFORCEMENT("enf","fas fa-fw fa-camera"),
	TRAFFIC_ACCIDENT("acdnt","fas fa-fw fa-ambulance"),
	TRRAFIC_EQUIPMENT("eqp","fas fa-fw fa-wrench"),
	FINE_NTC("fineNtc","fas fa-fw fa-user"), //고지관리 아직없음
	PENALTY("penalty","fas fa-fw fa-user"),
	ADMINIST("administ","fas fa-fw fa-user"), //얘도업음
	USER("user","fas fa-fw fa-user"),
	PORTAL("portal","fas fa-fw fa-sitemap"),
	STAT("stat","fas fa-fw fa-chart-bar"),
	SITE_MNG("siteMng","fas fa-fw fa-chart-bar")	//사이트관리도없음
	;
	private String menuAbv;
	private String cName;
	
	MenuIcon(String menuAbv,String cName){
		this.menuAbv = menuAbv;
		this.cName = cName;
	};
	
	public static MenuIcon getCNameForMenuAbv(String menuAbv) {
		for(MenuIcon r : MenuIcon.values()) {
			if(r.menuAbv.equals(menuAbv)) {
				return r;
			}
		}
		return null;
	}
}
