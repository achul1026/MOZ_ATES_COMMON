package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntChgHst;

@Mapper
public interface MozTfcAcdntChgHstRepository {
//	public List<MozTfcAcdntChgHst> selectLogList(MozTfcAcdntChgHst tfcAcdntChgHst);
	
//	public int selectLogListCnt(MozTfcAcdntChgHst tfcAcdntChgHst);
	
	/**
	 * @brief : 교통사고 로그 등록
	 * @details : 교통사고 로그 등록
	 * @author : KY.LEE
	 * @date : 2024.03.17
	 * @param : MozTfcAcdntChgHst
	 */
	public void saveMozTfcAcdntChgHst(MozTfcAcdntChgHst tfcAcdntChgHst);

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

	/**
	 * @brief : 교통사고 로그 상세 화면
	 * @details : 교통사고 로그 상세 화면
	 * @author : KC.KIM
	 * @date : 2024.01.31
	 * @param : hstId
	 * @return :
	 */
	public MozTfcAcdntChgHst findOneTfcAcdntChgHst(String hstId);
	

}
