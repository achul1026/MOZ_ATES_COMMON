package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozCameraEnfOrg;

@Mapper
public interface MozCameraEnfOrgRepository {

	/**
     * @brief : countBySearchOption
     * @details : 단속카메라 단속대상 목록 카운트 
     * @author : KY.LEE
     * @date : 2024.04.06
     * @param : mozCameraEnfOrg
     */
	int countBySearchOption(MozCameraEnfOrg mozCameraEnfOrg);

	/**
	 * @brief : getViolatorList
	 * @details : 단속 카메라 단속대상 목록
	 * @author : KY.LEE
	 * @date : 2024.04.06
	 * @param : mozCameraEnfOrg
	 */
	List<MozCameraEnfOrg> findAllBySearchOption(MozCameraEnfOrg mozCameraEnfOrg);

	/**
	 * @brief : fineOneByIdx
	 * @details : 단속 카메라 단속대상 상세
	 * @author : KY.LEE
	 * @date : 2024.04.06
	 * @param : mozCameraEnfOrg
	 */
	MozCameraEnfOrg fineOneByIdx(Long idx);

}
