package com.moz.ates.traffic.common.repository.equipment;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcFacilityFileInfo;

@Mapper
public interface MozTfcFacilityFileInfoRepository {

	/**
     * @brief : 교통시설물 파일 정보 저장
     * @details : 교통시설물 파일 정보 저장
     * @author : KC.KIM
     * @date : 2024.03.29
     * @param : tfcFacilityFileInfo
     * @return : 
     */
	void insertMozTfcFacilityFileInfo(MozTfcFacilityFileInfo tfcFacilityFileInfo);

	/**
     * @brief : 교통시설물 파일 정보 조회
     * @details : 교통시설물 파일 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.29
     * @param : tfcFacilityFileNo
     * @return : 
     */
	MozTfcFacilityFileInfo findOneMozTfcFacilityFileInfoByTfcFacilityFileNo(String tfcFacilityFileNo);

	/**
     * @brief : 교통시설물 파일 정보 삭제
     * @details : 교통시설물 파일 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.29
     * @param : tfcFacilityFileNo
     * @return : 
     */
	void deleteMozTfcFacilityFileInfoByTfcFacilityFileNo(String tfcFacilityFileNo);

	/**
     * @brief : 교통시설물 파일 정보 삭제
     * @details : 교통시설물 파일 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.29
     * @param : tfcFacilityId
     * @return : 
     */
	void deleteMozTfcFacilityFileInfoByTfcFacilityId(String tfcFacilityId);

}
