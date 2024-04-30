package com.moz.ates.traffic.common.repository.log;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.log.MozTfcUserLog;

@Mapper
public interface MozTfcUserLogRepository {

	/**
     * @brief : 사용자 로그 리스트 개수 조회
     * @details : 사용자 로그 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcUserLog
     * @return : 
     */
	public int countMozTfcUserLog(MozTfcUserLog mozTfcUserLog);

	/**
     * @brief : 사용자 로그 리스트 조회
     * @details : 사용자 로그 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcUserLog
     * @return : 
     */
	public List<MozTfcUserLog> findAllMozTfcUserLogList(MozTfcUserLog mozTfcUserLog);

	/**
     * @brief : 사용자 로그 상세 조회
     * @details : 사용자 로그 상세 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : logId
     * @return : 
     */
	public Map<String, Object> findOneMozTfcUserLog(String logId);

	/**
     * @brief : 사용자 로그 등록
     * @details : 사용자 로그 등록
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : userLog
     * @return : 
     */
	public void insertTfcUserLog(MozTfcUserLog userLog);

}
