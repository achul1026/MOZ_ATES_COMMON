package com.moz.ates.traffic.common.repository.administrative;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.administrative.MozCourtDcsn;

@Mapper
public interface MozCourtDcsnRepository {
	
	/**
     * @brief : 재판 결과 정보 조회
     * @details : 재판 결과 정보 조회
     * @author : NK.KIM
     * @date : 2024.02.20
     * @param : administDipId
     * @return : MozCourtDcsn
     */
	MozCourtDcsn findOneByAdministDipId(String administDipId);
	/**
	 * @brief : 재판 결과 정보 조회
	 * @details : 재판 결과 정보 조회
	 * @author : NK.KIM
	 * @date : 2024.02.20
	 * @param : administDipId
	 * @return : MozCourtDcsn
	 */
	MozCourtDcsn findOneByCourtDcsnId(String courtDcsnId);
	
	/**
     * @brief : 최종 판결 정보 저장
     * @details : 최종 판결 정보 저장
     * @author : NK.KIM
     * @date : 2024.02.20
     * @param : mozCourtDcsn
     * @return : 
     */
	void save(MozCourtDcsn mozCourtDcsn);
	
	/**
	 * @brief : 최종 판결 정보 수정
	 * @details : 최종 판결 정보 수정
	 * @author : NK.KIM
	 * @date : 2024.02.20
	 * @param : mozCourtDcsn
	 * @return : 
	 */
	void update(MozCourtDcsn mozCourtDcsn);
}
