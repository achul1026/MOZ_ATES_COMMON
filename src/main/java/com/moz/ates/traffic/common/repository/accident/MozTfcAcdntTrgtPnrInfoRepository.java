package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntTrgtPnrInfo;

@Mapper
public interface MozTfcAcdntTrgtPnrInfoRepository {
	
	 /**
     * @brief : 교통사고 - 탑승자 정보 저장
     * @details : 교통사고 - 탑승자 정보 저장
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : tfcAcdntPnrInfo
     * @return : 
     */
	public void insertTrgtPnrAcdntInfo(MozTfcAcdntTrgtPnrInfo tfcAcdntPnrInfo);

	 /**
     * @brief : 교통사고 - 탑승자 정보 조회
     * @details : 교통사고 - 탑승자 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : tfcAcdntId
     * @return : 
     */
	public List<MozTfcAcdntTrgtPnrInfo> findAllTfcAcdntPnrInfoByTfcAcdntId(String tfcAcdntId);

	/**
     * @brief : 교통사고 - 탑승자 정보 수정
     * @details : 교통사고 - 탑승자 정보 수정
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : pnrInfo
     * @return : 
     */
	public void updateMozTfcAcdntTrgtPnrInfo(MozTfcAcdntTrgtPnrInfo pnrInfo);

	/**
     * @brief : 교통사고 - 탑승자 정보 등록
     * @details : 교통사고 - 탑승자 정보 등록
     * @author : KY.LEE
     * @date : 2024.03.17
     * @param : MozTfcAcdntTrgtPnrInfo
     */
	public void saveMozTfcAcdntTrgtPnrInfo(MozTfcAcdntTrgtPnrInfo mozTfcAcdntTrgtPnrInfo);

	/**
     * @brief : 교통사고 - 탑승자 정보 삭제
     * @details : 교통사고 - 탑승자 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : acdntTrgtPnrId
     * @return : 
     */
	public void deleteMozTfcAcdntPnrInfoByAcdntTrgtPnrId(String acdntTrgtPnrId);
	
	/**
	  * @Method Name : findAllTfcAcdntTrgtInfoByTfcAcdntId
	  * @Date : 2024. 3. 21.
	  * @Author : IK.MOON
	  * @Method Brief : 탑승자 정보 조회
	  * @param mozTfcAcdntMaster
	  * @return
	  */
	public List<MozTfcAcdntTrgtPnrInfo> findAllTfcAcdntTrgtInfoByTfcAcdntIdOrderByPnrSortNo(String tfcAcdntId);
	
}
