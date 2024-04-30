package com.moz.ates.traffic.common.entity.menu;

import java.util.Date;

import lombok.Data;

@Data
public class MozMenu {
	private String menuId;
	private String parentMenuId;
	private int mainSortNo;
	private String menuNmEng;
	private String menuNmPor;
	private String useYn = "N";
	private int subSortNo;
	private String menuUrl;
	private String menuUrlPattrn;
	private Date crDt;
	private String crtr;
	private String menuAbv;			//메뉴 줄임말
	private String subMenuTotalCnt;
	
	//parameters #MozAuthMenu
	private String authId;
	private String authMenuId;
	
	private String createYn = "N";
	private String readYn = "N";
	private String updateYn = "N";
	private String deleteYn = "N";
	
	// none column
	private int menuLevel;
}
