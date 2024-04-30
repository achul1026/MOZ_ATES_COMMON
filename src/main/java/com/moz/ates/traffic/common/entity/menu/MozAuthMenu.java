package com.moz.ates.traffic.common.entity.menu;

import java.util.Date;

import lombok.Data;

@Data
public class MozAuthMenu {
	private String authMenuId;
	private String menuId;
	private String authId;
	private String createYn = "N";
	private String readYn = "N";
	private String updateYn = "N";
	private String deleteYn = "N";
	private Date crDt;
	private String crtr;
	
	//#MozMenu
	private String menuUrlPattrn;
	private String useYn;
	
	public MozAuthMenu() {
		super();
	}
	
	public MozAuthMenu(String authId, String createYn, String readYn, String updateYn, String deleteYn) {
		super();
		this.authId = authId;
		this.createYn = createYn;
		this.readYn = readYn;
		this.updateYn = updateYn;
		this.deleteYn = deleteYn;
	}
}
