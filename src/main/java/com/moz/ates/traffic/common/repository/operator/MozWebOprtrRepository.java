package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtrDTO;

@Mapper
public interface MozWebOprtrRepository {
	public MozWebOprtr findOneUserById(MozWebOprtr webOprtr);
	
	public int countDupliChk(MozWebOprtr webOprtr);
	
	public MozWebOprtr findOneUserByUserId(MozWebOprtr webOprtr);
	
	public List<MozWebOprtr> findAllUserList(MozWebOprtr webOprtr);
	
	public int countUserListCnt(MozWebOprtr webOprtr);
	
	public MozWebOprtr findOneUserDetail(String oprtrId);
	
	/**
	  * @Method Name : insertUser
	  * @Date : 2024. 2. 13.
	  * @Author : IK.MOON
	  * @Method Brief : 회원가입
	  * @param webOprtr
	  */
	public void insertUser(MozWebOprtr webOprtr);
	
	public void updateUser(MozWebOprtr webOprtr);
	
    /**
     * @brief : 관리자 등록
     * @details : 관리자 등록
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public void saveMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 아이디 중복 조회
     * @details : 아이디 중복 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public int countMozWebOprtrForDuplChk(MozWebOprtr webOprtr);

    /**
     * @brief : 사용자 리스트 조회
     * @details : 사용자 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : webOprtr
     * @return : 
     */
	public List<MozWebOprtr> findAllMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 사용자 리스트 개수 조회 
     * @details : 사용자 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : webOprtr
     * @return : 
     */
	public int countMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 관리자 상세 조회
     * @details : 관리자 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : oprtrId
     * @return : 
     */
	public MozWebOprtr findOneMozWebOprtr(String oprtrId);

    /**
     * @brief : 관리자 수정
     * @details : 관리자 수정
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public void updateMozWebOprtr(MozWebOprtr webOprtr);
	
	/**
     * @brief : 사용자 정보 조회 For Login
     * @details : 사용자 정보 조회 For Login
     * @author : NK.KIM
     * @date : 2023.08.18
     * @param : webOprtr
     * @return : MozWebOprtrDTO
     */
	public MozWebOprtrDTO findOneByOprtrAccountId(String oprtrAccountId);
	
	/**
	  * @Method Name : findOneWebOprtrByOprtrNmAndOprtrPno
	  * @Date : 2024. 2. 15.
	  * @Author : IK.MOON
	  * @Method Brief : ID 찾기
	  * @param mozWebOprtr
	  * @return
	  */
	public MozWebOprtr findOneWebOprtrByOprtrNmAndOprtrPno(MozWebOprtr mozWebOprtr);
	
	/**
	  * @Method Name : findOneWebOprtrByOprtrAccountIdAndOprtrNm
	  * @Date : 2024. 2. 16.
	  * @Author : IK.MOON
	  * @Method Brief : 사용자 정보 조회 for find PW
	  * @param mozWebOprtr
	  * @return
	  */
	public MozWebOprtr findOneWebOprtrByOprtrAccountIdAndOprtrNm(MozWebOprtr mozWebOprtr);
	
	/**
	  * @Method Name : updateOprtrAccountPw
	  * @Date : 2024. 2. 16.
	  * @Author : IK.MOON
	  * @Method Brief : PW 업데이트
	  * @param mozWebOprtr
	  */
	public void updateOprtrAccountPw(MozWebOprtr mozWebOprtr);

	/**
	  * @Method Name : deleteWebOprtr
	  * @작성일 : 2024. 2. 21.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 사용자 삭제
	  * @param webOprtr
	  */
	public void deleteWebOprtr(MozWebOprtr webOprtr);

	/**
	  * @Method Name : findPasswordByOprtrId
      * @author : KY.LEE
      * @date : 2023.04.23
	  * @Method Brief : 비밀번호 찾기
	  * @param oprtrId
	  */
	public String findPasswordByOprtrId(String oprtrId);

	/**
	  * @Method Name : updateMyInfo
      * @author : KY.LEE
      * @date : 2023.04.23
	  * @Method Brief : 내 정보 번경
	  * @param MozWebOprtr
	  * @return
	  */
	public void updateMyInfo(MozWebOprtr mozWebOprtr);

}
