package com.moz.ates.traffic.common.repository.enforcement;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfHst;

@Mapper
public interface MozTfcEnfHstRepository {
	public List<MozTfcEnfHst> findAllLogListsByTfcEnfHst(MozTfcEnfHst tfcEnfHst);
	
	public int countLogListsByTfcEnfHst(MozTfcEnfHst tfcEnfHst);
	
	public void insertTfcEnfHstInfo(MozTfcEnfHst tfcEnfHst);

	/**
     * @brief : 교통단속 로그 상세 조회
     * @details : 교통단속 로그 상세 조회
     * @author : KC.KIM
     * @date : 2024.01.31
     * @param : hstId
     * @return : MozTfcEnfHst
     */
	public MozTfcEnfHst findOneTfcEnfHst(String hstId);
}
