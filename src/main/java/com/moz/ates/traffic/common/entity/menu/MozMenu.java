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
	private Date crDt;
	private String crtr;
	private String menuAbv;			//메뉴 줄임말
}
