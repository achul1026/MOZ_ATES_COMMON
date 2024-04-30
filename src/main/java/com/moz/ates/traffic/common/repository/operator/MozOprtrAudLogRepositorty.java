package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozOprtrAudLog;

@Mapper
public interface MozOprtrAudLogRepositorty {

	/**
	  * @Method Name : findAllMozOprtrAudLogList
	  * @작성일 : 2024. 2. 19.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 관리자 로그 목록 조회
	  * @param oprtrId
	  * @return
	  */
	List<MozOprtrAudLog> findAllMozOprtrAudLogList(String oprtrId);

	/**
	  * @Method Name : countMozAudLog
	  * @작성일 : 2024. 2. 19.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 관리자 로그 목록 갯수 조회
	  * @param oprtrAudLog
	  * @return
	  */
	int countMozOprtrAudLog(MozOprtrAudLog oprtrAudLog);
	
}
