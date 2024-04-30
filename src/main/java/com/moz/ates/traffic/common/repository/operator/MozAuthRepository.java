package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozAuth;

@Mapper
public interface MozAuthRepository {

	/**
     * @brief : 권한 리스트 조회
     * @details : 권한 리스트 조회
     * @author : KC.KIM
     * @date : 2024.01.23
     * @param : mozAuth
     * @return : 
     */
	public List<MozAuth> findAllMozAuth(MozAuth mozAuth);

	/**
     * @brief : 권한 리스트 개수 조회
     * @details : 권한 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.01.23
     * @param : mozAuth
     * @return : 
     */
	public int countMozAuth(MozAuth mozAuth);
	
	/**
	  * @Method Name : findOneMozAuth
	  * @Date : 2024. 1. 31.
	  * @Author : IK.MOON
	  * @Method Brief : 권한 단일 조회
	  * @param mozAuth
	  * @return
	  */
	public MozAuth findOneMozAuth(MozAuth mozAuth);
	
	/**
	  * @Method Name : save
	  * @Date : 2024. 1. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 권한 저장
	  * @param mozAuth
	  */
	public void saveMozAuth(MozAuth mozAuth);
	
	/**
	  * @Method Name : update
	  * @Date : 2024. 2. 1.
	  * @Author : IK.MOON
	  * @Method Brief : 권한 수정
	  * @param mozAuth
	  */
	public void updateMozAuth(MozAuth mozAuth);
}
