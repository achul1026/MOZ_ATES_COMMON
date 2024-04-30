package com.moz.ates.traffic.common.entity.menu;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * Side Menu Interceptor 반환 DTO
 * @author : KY.LEE
 * @fileName :  MozSideMenuDTO
 * @since : 2023-12-13
 */
@Data
public class MozSideMenuDTO {
	
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
	private String menuAbv;	
	List<MozMenu> subMenuInfoList;

	
	public MozSideMenuDTO(MozMenu mozMenu) {
		this.menuId = mozMenu.getMenuId();
		this.parentMenuId = mozMenu.getParentMenuId();
		this.mainSortNo = mozMenu.getMainSortNo();
		this.menuNmEng = mozMenu.getMenuNmEng();
		this.menuNmPor = mozMenu.getMenuNmPor();
		this.useYn = mozMenu.getUseYn();
		this.subSortNo = mozMenu.getSubSortNo();
		this.menuUrl = mozMenu.getMenuUrl();
		this.menuUrlPattrn = mozMenu.getMenuUrlPattrn();
		this.menuAbv = mozMenu.getMenuAbv();
		this.crDt = mozMenu.getCrDt();
		this.crtr = mozMenu.getCrtr();
	}
}
