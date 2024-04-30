package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEqpMntnHst;

@Mapper
public interface MozTfcEqpMntnHstRepository {

	/**
     * @brief : 교통시설물 유지보수 이력 조회
     * @details : 교통시설물 유지보수 이력 조회
     * @author : KY.LEE
     * @date : 2024.04.24
     * @param : getEqpMntnHstList
     */
	List<MozTfcEqpMntnHst> findAllEqpMntnHstList(String tfcEnfEqpId);
	
	/**
     * @brief : 교통시설물 유지보수 이력 삭제
     * @details : 교통시설물 유지보수 이력 삭제
     * @author : KY.LEE
     * @date : 2024.04.24
     * @param : deleteMozTfcEqpMntnHstByMntnHstId
     */
	void deleteMozTfcEqpMntnHstByMntnHstId(String mntnHstId);

	/**
     * @brief : 교통시설물 유지보수 이력 삭제
     * @details : 교통시설물 유지보수 이력 삭제
     * @author : KY.LEE
     * @date : 2024.04.24
     * @param : deleteMozTfcEqpMntnHstByTfcEnfEqpId
     */
	void deleteMozTfcEqpMntnHstByTfcEnfEqpId(String tfcEnfEqpId);

	/**
     * @brief : 교통시설물 유지보수 이력 등록
     * @details : 교통시설물 유지보수 이력 등록
     * @author : KC.KIM
     * @date : 2024.04.29
     * @param : saveTfcEqpMntnHst
     */
	void saveTfcEqpMntnHst(MozTfcEqpMntnHst item);
}
