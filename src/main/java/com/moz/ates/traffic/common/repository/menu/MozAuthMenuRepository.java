package com.moz.ates.traffic.common.repository.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.menu.MozAuthMenu;
import com.moz.ates.traffic.common.entity.menu.MozMenu;
import com.moz.ates.traffic.common.entity.operator.MozAuth;

@Mapper
public interface MozAuthMenuRepository {
	/**
	  * @Method Name : saveMozAuthMenu
	  * @Date : 2024. 1. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 권한 메뉴 저장
	  * @param mozAuthMenu
	  */
	public void saveMozAuthMenu(MozAuthMenu mozAuthMenu);
	
	/**
	  * @Method Name : findAllByMenuId
	  * @Date : 2024. 1. 22.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 권한 조회
	  * @param mozMenu
	  */
	public List<MozAuthMenu> findAllByMenuId(MozAuthMenu mozAuthMenu);
	
	/**
	  * @Method Name : deleteAuthMenu
	  * @Date : 2024. 1. 22.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 권한 삭제
	  * @param mozAuthMenu
	  */
	public void deleteAuthMenu(MozAuthMenu mozAuthMenu);

	/**
	  * @Method Name : findAllMenuAndAuth
	  * @Date : 2024. 1. 31.
	  * @Author : IK.MOON
	  * @Method Brief : 전체 메뉴 및 권한 조회
	  * @return
	  */
	public List<MozMenu> findAllMenuAndAuth(MozAuth mozAuth);
	
	/**
	  * @Method Name : updateMozAuthMenu
	  * @Date : 2024. 2. 1.
	  * @Author : IK.MOON
	  * @Method Brief : 메뉴 권한 수정
	  * @param mozAuth
	  */
	public void updateMozAuthMenu(MozAuthMenu mozAuthMenu);
	
	/**
	  * @Method Name : findMozAuthMenuAndUrlPatternBAnyYn
	  * @Date : 2024. 2. 16.
	  * @Author : KY.LEE
	  * @Method Brief : 사용 권한으로 MenuUrlPattern 조회
	  * @return
	  */
	public List<MozAuthMenu> findMozAuthMenuAndUrlPatternBAnyYn(MozAuthMenu mozAuthMenu);
	
}
