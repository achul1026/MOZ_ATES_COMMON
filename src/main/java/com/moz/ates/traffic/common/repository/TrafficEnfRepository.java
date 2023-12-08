package com.moz.ates.traffic.common.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;

@Mapper
public interface TrafficEnfRepository {
	
	public List<MozTfcLwInfo> selectLawList(MozTfcLwInfo tfcLwInfo);

	public int selectLawListCnt(MozTfcLwInfo tfcLwInfo);
	
}
