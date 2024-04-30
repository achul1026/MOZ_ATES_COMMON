package com.moz.ates.traffic.common.repository.common;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.MozMsgQueue;

@Mapper
public interface MozMsgQueueRepository {

	/**
     * @brief : SMS 발송 등록
     * @details : SMS 발송 등록
     * @author : KY.LEE
     * @date : 2024.04.03
     * @param : MozMsgQueue
     */
	public void saveMozMsgQueue(MozMsgQueue mozMsgQueue);

}
