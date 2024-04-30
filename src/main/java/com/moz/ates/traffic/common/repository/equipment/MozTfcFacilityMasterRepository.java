package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcFacilityMaster;

@Mapper
public interface MozTfcFacilityMasterRepository {

	/**
     * @brief : 교통시설물 리스트 개수 조회
     * @details : 교통시설물 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.01.25
     * @param : tfcFacilityMaster
     * @return : 
     */
	int countMozTfcFacility(MozTfcFacilityMaster tfcFacilityMaster);

	/**
     * @brief : 교통시설물 리스트 조회
     * @details : 교통시설물 리스트 조회
     * @author : KC.KIM
     * @date : 2024.01.25
     * @param : tfcFacilityMaster
     * @return : 
     */
	List<MozTfcFacilityMaster> findAllMozFacility(MozTfcFacilityMaster tfcFacilityMaster);

	/**
     * @brief : 교통시설물 상세 조회
     * @details : 교통시설물 상세
     * @author : KC.KIM
     * @date : 2024.03.04
     * @param : tfcFacilityId
     * @return : 
     */
	MozTfcFacilityMaster findOneMozTfcFacilityBytfcFacilityId(String tfcFacilityId);

	/**
     * @brief : 교통시설물 등록
     * @details : 교통시설물 등록
     * @author : KC.KIM
     * @date : 2024.03.04
     * @param : tfcFacilityMaster
     * @return : 
     */
	public void insertTfcFacilityMaster(MozTfcFacilityMaster tfcFacilityMaster);
	
	/**
     * @brief : 교통시설물 삭제
     * @details : 교통시설물 삭제
     * @author : KC.KIM
     * @date : 2024.03.04
     * @param : tfcFacilityId
     * @return : 
     */
	public void deleteTfcFacilityMasterByTfcFacilityId(String tfcFacilityId);

	/**
     * @brief : 교통시설물 수정
     * @details : 교통시설물 수정
     * @author : KC.KIM
     * @date : 2024.03.04
     * @param : tfcFacilityMaster
     * @return : 
     */
	public void updateMozTfcFacilityMaster(MozTfcFacilityMaster tfcFacilityMaster);

	/**
     * @brief : 교통시설물 이미지 삭제
     * @details : 교통시설물 이미지 삭제
     * @author : KC.KIM
     * @date : 2024.03.04
     * @param : tfcFacilityMaster
     * @return : 
     */
	public void deleteFacilityImage(MozTfcFacilityMaster tfcFacilityMaster);

}
