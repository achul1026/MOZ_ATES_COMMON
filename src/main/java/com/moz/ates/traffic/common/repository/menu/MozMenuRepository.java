package com.moz.ates.traffic.common.repository.menu;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.menu.MozMenu;

@Mapper
public interface MozMenuRepository {
	public List<MozMenu> selectList(MozMenu menu);
	
	public List<MozMenu> selectParentMenuList();
	
	public List<MozMenu> selectSubMenuListByMenuId(String menuId);
	
	public List<MozMenu> selectParentMenuListByMenuAuth(String authId);
	
	public List<MozMenu> selectSubMenuListByMenuAuthAndMenuId(Map<String,Object> paramMap);
}
