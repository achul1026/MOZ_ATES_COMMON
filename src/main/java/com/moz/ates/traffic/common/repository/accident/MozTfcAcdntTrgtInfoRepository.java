package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntTrgtInfo;

@Mapper
public interface MozTfcAcdntTrgtInfoRepository {

	/**
     * @brief : 교통사고 - 타겟 정보 조회
     * @details : 교통사고 - 타겟 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.13
     * @param : tfcAcdntId
     * @return : 
     */
	public List<MozTfcAcdntTrgtInfo> findAllTfcAcdntTrgtByTfcAcdntId(String tfcAcdntId);

	/**
     * @brief : 교통사고 - 타겟 정보 등록
     * @details : 교통사고 - 타겟 정보 등록
     * @author : KY.LEE
     * @date : 2024.03.17
     * @param : MozTfcAcdntTrgtInfo
     */
	public void saveMozTfcAcdntTrgtInfo(MozTfcAcdntTrgtInfo mozTfcAcdntTrgtInfo);

	/**
     * @brief : 교통사고 - 타겟 정보 수정
     * @details : 교통사고 - 타겟 정보 수정
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : trgtInfo
     * @return : 
     */
	public void updateMozTfcAcdntTrgtInfo(MozTfcAcdntTrgtInfo trgtInfo);

	/**
     * @brief : 교통사고 - 타겟 정보 삭제
     * @details : 교통사고 - 타겟 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : trgtInfo
     * @return : 
     */
	public void deleteMozTfcAcdntTrgtInfoByAcdntTrgtId(String acdntTrgtId);
	
	/**
	  * @Method Name : findAllTfcAcdntTrgtByTfcAcdntId
	  * @Date : 2024. 3. 21.
	  * @Author : IK.MOON
	  * @Method Brief : 교통사고 타겟 정보 조회
	  * @param tfcAcdntMaster
	  * @return
	  */
	public List<MozTfcAcdntTrgtInfo> findAllTfcAcdntTrgtByTfcAcdntIdOrderByAcdntTrgtSortNo(String tfcAcdntId);

	/**
	 * @brief 사고타겟 이력 조회
	 * @details : 사고타겟 이력 조회
	 * @author KY.LEE
	 * @date 2024. 4. 11.
	 * @method findAllTfcAcdntTrgtByDvrLcenId
	 */
	public List<MozTfcAcdntTrgtInfo> findAllTfcAcdntTrgtByDvrLcenId(String dvrLcenId);	
}
