package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntChgHst;

@Mapper
public interface MozTfcAcdntChgHstRepository {
	public List<MozTfcAcdntChgHst> selectLogList(MozTfcAcdntChgHst tfcAcdntChgHst);
	
	public int selectLogListCnt(MozTfcAcdntChgHst tfcAcdntChgHst);
	
	public void insertTfcAcdntHstInfo(MozTfcAcdntChgHst tfcAcdntChgHst);

    /**
     * @brief : 교통사고 로그 리스트 조회
     * @details : 교통사고 로그 리스트 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcAcdntChgHst
     * @return : 
     */
	public List<MozTfcAcdntChgHst> findAllMozTfcAcdntChgHst(MozTfcAcdntChgHst tfcAcdntChgHst);

    /**
     * @brief : 교통사고 로그 리스트 개수 조회
     * @details : 교통사고 로그 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcAcdntChgHst
     * @return : 
     */
	public int countMozTfcAcdntChgHst(MozTfcAcdntChgHst tfcAcdntChgHst);
}
