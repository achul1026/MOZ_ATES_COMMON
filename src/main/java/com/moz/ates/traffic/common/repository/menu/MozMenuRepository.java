package com.moz.ates.traffic.common.repository.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.menu.MozMenu;
import com.moz.ates.traffic.common.entity.menu.MozMenuRouteDTO;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtrDTO;

@Mapper
public interface MozMenuRepository {
	public List<MozMenu> selectList(MozMenu menu);
	
	public List<MozMenu> selectParentMenuList();
	
	public List<MozMenu> selectSubMenuListByMenuId(String menuId);
	
	public List<MozMenu> selectParentMenuListByMenuAuth(String authId);
	
	public List<MozMenu> selectSubMenuListByMenuAuthAndMenuId(MozMenu menu);

	public List<MozMenu> selectSidebarAuthMenuList(MozWebOprtrDTO mozWebOprtrDTO);
	
	/**
	  * @Method Name : findAllParentMenu
	  * @Date : 2024. 1. 12.
	  * @Author : IK.MOON
	  * @Method Brief : parent menu 전체 조희
	  * @return
	  */
	public List<MozMenu> findAllParentMenu();
	
	/**
	  * @Method Name : findOneByMenuId
	  * @Date : 2024. 1. 12.
	  * @Author : IK.MOON
	  * @Method Brief : menu 단일 조회
	  * @param menuId
	  * @return
	  */
	public MozMenu findOneByMenuId(String menuId);
	
	/**
	  * @Method Name : findAllSubMenuByParentMenuId
	  * @Date : 2024. 1. 12.
	  * @Author : IK.MOON
	  * @Method Brief : sub menu 전체 조회
	  * @param parentmenuId
	  * @return
	  */
	public List<MozMenu> findAllSubMenuByParentMenuId(String parentmenuId);

	public MozMenuRouteDTO selectMenuRouteInfo(MozMenuRouteDTO mozMenuRouteDTO);
	
	/**
	  * @Method Name : saveMenu
	  * @Date : 2024. 1. 22.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 저장
	  * @param mozMenu
	  */
	public void saveMenu(MozMenu mozMenu);
	
	/**
	  * @Method Name : deleteMenu
	  * @Date : 2024. 1. 22.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 삭제
	  * @param mozMenu
	  */
	public void deleteMenu(MozMenu mozMenu);
	
	/**
	  * @Method Name : updateMenu
	  * @Date : 2024. 1. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 업데이트
	  * @param mozMenu
	  */
	public void updateMenu(MozMenu mozMenu);
	
}
