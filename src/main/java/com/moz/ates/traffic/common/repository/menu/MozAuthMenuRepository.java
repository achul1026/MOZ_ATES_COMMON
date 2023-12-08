package com.moz.ates.traffic.common.repository.menu;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.menu.MozAuthMenu;

@Mapper
public interface MozAuthMenuRepository {
	public void saveMozAuthMenu(MozAuthMenu childMozAuthMenu);
}
