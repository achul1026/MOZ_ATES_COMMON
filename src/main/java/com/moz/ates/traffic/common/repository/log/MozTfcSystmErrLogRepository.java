package com.moz.ates.traffic.common.repository.log;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.log.MozTfcSystmErrLog;

@Mapper
public interface MozTfcSystmErrLogRepository {

	/**
     * @brief : 시스템 장애 로그 리스트 개수 조회
     * @details : 시스템 장애 로그 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcSystmErrLog
     * @return : 
     */
	public int countMozTfcSystmErrLog(MozTfcSystmErrLog mozTfcSystmErrLog);

	/**
     * @brief : 시스템 장애 로그 리스트 조회
     * @details : 시스템 장애 로그 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcSystmErrLog
     * @return : 
     */
	public List<MozTfcSystmErrLog> findAllMozTfcSystmErrLogList(MozTfcSystmErrLog mozTfcSystmErrLog);

	/**
     * @brief : 시스템 장애 로그 상세 조회
     * @details : 시스템 장애 로그 상세 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : logId
     * @return : 
     */
	public Map<String, Object> findOneMozTfcSystmErrLog(String logId);
	
	
	/**
     * @brief : 시스템 장애 로그 등록
     * @details : 시스템 장애 로그 등록
     * @author : KY.LEE
     * @date : 2024.04.03
     */
	public void saveMozTfcSystmErrLog(MozTfcSystmErrLog mozTfcSystmErrLog);
	
	
}
