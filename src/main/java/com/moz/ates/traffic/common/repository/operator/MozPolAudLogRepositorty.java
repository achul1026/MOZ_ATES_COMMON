package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozPolAudLog;

@Mapper
public interface MozPolAudLogRepositorty {

	/**
	  * @Method Name : countMozPolAudLog
	  * @작성일 : 2024. 2. 22.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 경찰 로그 목록 개수 조회
	  * @param polAudLog
	  * @return
	  */
	int countMozPolAudLog(MozPolAudLog polAudLog);

	/**
	  * @Method Name : findAllMozPolAudLogList
	  * @작성일 : 2024. 2. 22.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 경찰 로그 목록 조회
	  * @param polId
	 * @return 
	  */
	List<MozPolAudLog> findAllMozPolAudLogList(String polId);
	
}
