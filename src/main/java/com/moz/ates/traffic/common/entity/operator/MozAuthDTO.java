package com.moz.ates.traffic.common.entity.operator;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.menu.MozMenu;

import lombok.Data;

@Data
public class MozAuthDTO {
	private String menuId;
	private String parentMenuId;
	
	private String menuNmEng;
	private String menuNmPor;
	private int mainSortNo;
	private int subSortNo;
	
	private String menuUrl;
	private String menuUrlPattrn;
	private Date crDt;
	private String crtr;
	
	private String authMenuId;
	private String createYn = "N";
	private String readYn = "N";
	private String updateYn = "N";
	private String deleteYn = "N";
	
	private String menuAbv;	
	private String useYn = "N";
	private int menuLevel;
	
	List<MozMenu> subMenuInfoList;
	
	public MozAuthDTO(MozMenu mozMenu) {
		this.menuId = mozMenu.getMenuId();
		this.parentMenuId = mozMenu.getParentMenuId();
		
		this.menuNmEng = mozMenu.getMenuNmEng();
		this.menuNmPor = mozMenu.getMenuNmPor();
		this.mainSortNo = mozMenu.getMainSortNo();
		this.subSortNo = mozMenu.getSubSortNo();
		
		this.menuUrl = mozMenu.getMenuUrl();
		this.menuUrlPattrn = mozMenu.getMenuUrlPattrn();
		this.crDt = mozMenu.getCrDt();
		this.crtr = mozMenu.getCrtr();
		
		this.authMenuId = mozMenu.getAuthMenuId();
		this.createYn = mozMenu.getCreateYn();
		this.readYn = mozMenu.getReadYn();
		this.updateYn = mozMenu.getUpdateYn();
		this.deleteYn = mozMenu.getDeleteYn();
		
		this.menuAbv = mozMenu.getMenuAbv();
		this.useYn = mozMenu.getUseYn();
		this.menuLevel = mozMenu.getMenuLevel();
	}
	
}
