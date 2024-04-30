package com.moz.ates.traffic.common.repository.equipment;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpFileInfo;

@Mapper
public interface MozTfcEnfEqpFileInfoRepository {
	/**
     * @brief : 단속장비 파일 정보 저장
     * @details : 단속장비 파일 정보 저장
     * @author : KC.KIM
     * @date : 2024.04.02
     * @param : fileInfo
     * @return : 
     */
	void insertMozTfcEnfEqpFileInfo(MozTfcEnfEqpFileInfo fileInfo);
	
	/**
     * @brief : 단속장비 파일 정보 조회
     * @details : 단속장비 파일 정보 조회
     * @author : KC.KIM
     * @date : 2024.04.02
     * @param : eqpFileNo
     * @return : 
     */
	MozTfcEnfEqpFileInfo findOneMozMozTfcEnfEqpFileInfoByEqpFileNo(String eqpFileNo);

	/**
     * @brief : 단속장비 파일 정보 삭제
     * @details : 단속장비 파일 정보 삭제
     * @author : KC.KIM
     * @date : 2024.04.02
     * @param : eqpFileNo
     * @return : 
     */
	void deleteMozTfcEnfEqpFileInfooByEqpFileNo(String eqpFileNo);

	/**
     * @brief : 단속장비 파일 정보 삭제
     * @details : 단속장비 파일 정보 삭제
     * @author : KC.KIM
     * @date : 2024.04.02
     * @param : tfcEnfEqpId
     * @return : 
     */
	void deleteMozTfcEnfEqpFileInfooByTfcEnfEqpId(String tfcEnfEqpId);

}
