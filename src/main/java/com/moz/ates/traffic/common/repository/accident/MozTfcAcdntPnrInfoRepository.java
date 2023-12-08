package com.moz.ates.traffic.common.repository.accident;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntPnrInfo;

@Mapper
public interface MozTfcAcdntPnrInfoRepository {
	public void insertPnrAcdntInfo(MozTfcAcdntPnrInfo tfcAcdntPnrInfo);
}
