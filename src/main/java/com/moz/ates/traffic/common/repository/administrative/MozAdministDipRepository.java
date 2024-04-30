package com.moz.ates.traffic.common.repository.administrative;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.administrative.MozAdministDip;

@Mapper
public interface MozAdministDipRepository {
	
    /**
     * @brief : 법원 이송 관리 리스트 개수 조회
     * @details : 법원 이송 관리 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.01.22
     * @param : administDip
     * @return : 
     */
	int countMozAdminstDip(MozAdministDip administDip);

    /**
     * @brief : 법원 이송 관리 리스트 조회
     * @details : 법원 이송 관리 리스트 조회
     * @author : KC.KIM
     * @date : 2024.01.22
     * @param : administDip
     * @return : 
     */
	List<MozAdministDip> findAllMozAdministList(MozAdministDip administDip);

	/**
     * @brief : 법원 이송 상세 정보 조회
     * @details : 법원 이송 상세 정보 조회
     * @author : NK.KIM
     * @date : 2024.02.20
     * @param : administDipId
     * @return : MozAdministDip
     */
	MozAdministDip findOneByAdministDipId(String administDipId);

	/**
     * @brief : 법원 이송 등록
     * @details : 법원 이송 등록
     * @author : KY.LEE
     * @date : 2024.04.05
     * @param : MozAdministDip
     */
	public void saveMozAdministDip(MozAdministDip mozAdministDip);
	
}
