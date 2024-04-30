package com.moz.ates.traffic.common.repository.log;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.log.MozTfcClctnFlrLog;

@Mapper
public interface MozTfcClctnFlrLogRepository {

	/**
     * @brief : 수집실패 로그 리스트 개수 조회
     * @details : 수집실패 로그 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcClctnFlrLog
     * @return : 
     */
	public int countMozTfcClctnFlrLog(MozTfcClctnFlrLog mozTfcClctnFlrLog);

	/**
     * @brief : 수집실패 로그 리스트 조회
     * @details : 수집실패 로그 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : mozTfcClctnFlrLog
     * @return : 
     */
	public List<MozTfcClctnFlrLog> findAllMozTfcClctnFlrLogList(MozTfcClctnFlrLog mozTfcClctnFlrLog);

	/**
     * @brief : 수집실패 로그 상세 조회
     * @details : 수집실패 로그 상세 조회
     * @author : KC.KIM
     * @date : 2024.02.16
     * @param : logId
     * @return : 
     */
	public Map<String, Object> findOneMozTfcClctnFlrLog(String logId);
	
	
}
