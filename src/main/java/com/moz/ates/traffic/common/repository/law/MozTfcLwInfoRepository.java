package com.moz.ates.traffic.common.repository.law;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;

@Mapper
public interface MozTfcLwInfoRepository {
	public List<MozTfcLwInfo> findAllLawListsByTfcLwInfo(MozTfcLwInfo tfcLwInfo);
	
	public int countLawListsByTfcLwInfo(MozTfcLwInfo tfcLwInfo);
	
	public MozTfcLwInfo findOneLawDetail(String tfcLawId);
	
	public List<MozTfcLwInfo> selectTrafficLawsList(MozTfcLwInfo tfcLwInfo);
	
	public void insertMozTfcLwInfo(MozTfcLwInfo tfcLwInfo);
	
	public void updateMozTfcLwInfoByTfcLawId(MozTfcLwInfo tfcLwInfo);
	
	public void deleteMozTfcLwInfoByTfcLawId(String tfcLawId);
}
