package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozInqry;

@Mapper
public interface MozInqryRepository {

	/**
     * @brief : 문의하기 리스트 개수 조회
     * @details : 문의하기 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozInqry
     * @return : 
     */
	public int countMozInqry(MozInqry mozInqry);

	/**
     * @brief : 문의하기 리스트 조회
     * @details : 문의하기 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozInqry
     * @return : 
     */
	public List<MozInqry> findAllMozInqryList(MozInqry mozInqry);

	/**
     * @brief : 문의하기 상세 조회
     * @details : 문의하기 상세 조회
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : inqryId
     * @return : 
     */
	public MozInqry findOneMozInqry(String inqryId);

	/**
     * @brief : 문의하기 답변 등록
     * @details : 문의하기 답변 등록
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozInqry
     * @return : 
     */
	public void updateMozInqry(MozInqry mozInqry);

	/**
	  * @Method Name : save
	  * @작성일 : 2024. 3. 8.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포탈 문의하기 등록
	  * @param mozInqry
	  */
	public void saveMozInqry(MozInqry mozInqry);

	/**
	  * @Method Name : deleteMozInqryByInqryId
	  * @작성일 : 2024. 3. 11.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포탈 문의하기 질문 삭제
	  * @param inqryId
	  */
	public void deleteMozInqryByInqryId(String inqryId);

	/**
	  * @Method Name : findAllMozInqryListPortal
	  * @작성일 : 2024. 3. 11.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포탈 문의하기 목록 조회
	  * @param mozInqry
	  * @return
	  */
	public List<MozInqry> findAllMozInqryListPortal(MozInqry mozInqry);

	/**
	  * @Method Name : findOneMozInqryPortal
	  * @작성일 : 2024. 3. 11.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포탈 문의하기 상세 조회
	  * @param inqryId
	  * @return
	  */
	public MozInqry findOneMozInqryPortal(String inqryId);

	/**
	  * @Method Name : countMozInqryPortal
	  * @작성일 : 2024. 3. 11.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포탈 문의하기 리스트 개수 조회
	  * @param mozInqry
	  * @return
	  */
	public int countMozInqryPortal(MozInqry mozInqry);

}
