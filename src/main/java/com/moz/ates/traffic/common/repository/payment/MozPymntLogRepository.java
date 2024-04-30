package com.moz.ates.traffic.common.repository.payment;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.payment.MozPymntLog;

@Mapper
public interface MozPymntLogRepository {

    /**
     * @brief : 결제로그 삽입
     * @details : 결제로그 삽입
     * @author : KY.LEE
     * @date : 2024.03.28
     * @param : MozPymntLog
     */
	public void saveMozPymntLog(MozPymntLog mozPymntLog);

}
