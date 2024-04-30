package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozCameraEnfOrgFile;

@Mapper
public interface MozCameraEnfOrgFileRepository {

	/**
	 * @brief : getViolationImageList
	 * @details : 단속 카메라 이미지 목록 조회
	 * @author : KY.LEE
	 * @date : 2024.04.06
	 * @param : MozCameraEnfOrgFile
	 */
	List<MozCameraEnfOrgFile> findAllByOrgIdx(Long orgIdx);

	/**
	 * @brief : getViolationImage
	 * @details : 단속 카메라 이미지 파일 경로 조회
	 * @author : KY.LEE
	 * @date : 2024.04.06
	 * @param : MozCameraEnfOrgFile
	 */
	String findOneByIdx(Long idx);
}
