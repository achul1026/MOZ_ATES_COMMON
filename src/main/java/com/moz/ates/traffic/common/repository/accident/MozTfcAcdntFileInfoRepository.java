package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntFileInfo;

@Mapper
public interface MozTfcAcdntFileInfoRepository {
	/**
     * @brief : 교통사고 - 파일 정보 저장
     * @details : 교통사고 - 파일 정보 저장
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : atchFile
     * @return : 
     */
	void insertMozTfcAcdntFileInfo(MozTfcAcdntFileInfo atchFile);

	/**
     * @brief : 교통사고 - 파일 정보 조회
     * @details : 교통사고 - 파일 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : tfcAcdntId
     * @return : 
     */
	List<MozTfcAcdntFileInfo> findAllTfcAcdntFileInfoByTfcAcdntId(String tfcAcdntId);

	/**
     * @brief : 교통사고 - 파일 삭제
     * @details : 교통사고 - 파일 삭제
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : acdntFileNo
     * @return : 
     */
	void deleteMozTfcAcdntFileInfoByAcdntFileNo(String acdntFileNo);

	/**
     * @brief : 교통사고 - 파일 정보 조회
     * @details : 교통사고 - 파일 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.06
     * @param : acdntFileNo
     * @return : 
     */
	MozTfcAcdntFileInfo findOneMozTfcAcdntFileInfoByAcdntFileNo(String acdntFileNo);
	
}
