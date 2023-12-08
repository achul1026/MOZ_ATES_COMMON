package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpLog;

@Mapper
public interface MozTfcEnfEqpLogRepository {
    /**
     * @brief : 단속장비 로그 리스트 조회
     * @details : 단속장비 로그 리스트 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcEnfEqpLog
     * @return : 
     */
	public List<MozTfcEnfEqpLog> findAllMozTfcEnfEqpLog(MozTfcEnfEqpLog tfcEnfEqpLog);

    /**
     * @brief : 단속장비 리스트 개수 조회
     * @details : 단속장비 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcEnfEqpLog
     * @return : 
     */
	public int countMozTfcEnfEqpLog(MozTfcEnfEqpLog tfcEnfEqpLog);
}
