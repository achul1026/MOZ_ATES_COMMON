package com.moz.ates.traffic.common.repository.driver;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.driver.MozVioInfo;

@Mapper
public interface MozVioInfoRepository { 
	
	public List<Map<String, Object>> searchTrafficList(Map<String,Object>paramMap);
	
	public void insertVioInfo(MozVioInfo vioInfo);
}
