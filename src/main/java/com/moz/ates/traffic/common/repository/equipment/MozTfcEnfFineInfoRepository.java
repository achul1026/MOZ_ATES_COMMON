package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFineInfo;

@Mapper
public interface MozTfcEnfFineInfoRepository {
	
	/**
	 * @brief 단속 범칙금 등록
	 * @author KY.LEE
	 * @date 2024. 3. 6.
	 * @method insertTfcEnfFineInfo
	 */
	public void insertTfcEnfFineInfo(MozTfcEnfFineInfo mozTfcEnfFineInfo);

	/**
     * @brief : 교통단속 - 고지 관리 정보 삭제
     * @details : 교통단속 - 고지 관리 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : tfcEnfId
     * @return : 
     */
	public void deleteFineNtcInfoByTfcEnfId(String tfcEnfId);

	/**
	  * @Method Name : findAllTfcEnfFineInfoJoinTfcLwFineInfoAndTfcLwInfoByTfcEnfId
	  * @Date : 2024. 3. 19.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 정보 위반 법률, 범칙금 조회
	  * @param tfcEnfId
	  * @return
	  */
	public List<MozTfcEnfFineInfo> findAllTfcEnfFineInfoJoinTfcLwFineInfoAndTfcLwInfoByTfcEnfId(String tfcEnfId);

}
