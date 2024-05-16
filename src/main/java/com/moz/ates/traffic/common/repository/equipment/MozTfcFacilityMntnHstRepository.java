package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcFacilityMntnHst;

@Mapper
public interface MozTfcFacilityMntnHstRepository {

	/**
     * @brief : 교통시설물 유지보수 이력 조회
     * @details : findAllByTfcFacilityId
     * @author : KY.LEE
     * @date : 2024.04.24
     * @param : tfcFacilityId
     */
	List<MozTfcFacilityMntnHst> findAllByTfcFacilityId(String tfcFacilityId);

	/**
     * @brief : 교통시설물 유지보수 이력 등록
     * @details : 교통시설물 유지보수 이력 등록
     * @author : KY.LEE
     * @date : 2024.04.24
     * @param : saveMozTfcFacilityMntnHst
     */
	void saveMozTfcFacilityMntnHst(MozTfcFacilityMntnHst mozTfcFacilityMntnHst);

	 
   /**
   * @brief : 교통시설물 유지보수 삭제 (본인키 삭제)
   * @details : 교통시설물 유지보수 삭제 (본인키 삭제)
   * @author : KY.LEE
   * @date : 2024.04.24
   * @param : deleteMozTfcFacilityMntnHstByTfcFacilityLogId
   */
	void deleteMozTfcFacilityMntnHstByTfcFacilityLogId(String tfcFacilityLogId);

   /**
   * @brief : 교통시설물 유지보수 삭제 (부모키 삭제)
   * @details : 교통시설물 유지보수 삭제 (부모키 삭제)
   * @author : KY.LEE
   * @date : 2024.04.24
   * @param : deleteMozTfcFacilityMntnHstByTfcFacilityId
   */
	void deleteMozTfcFacilityMntnHstByTfcFacilityId(String tfcFacilityId);
}
