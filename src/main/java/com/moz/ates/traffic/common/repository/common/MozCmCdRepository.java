package com.moz.ates.traffic.common.repository.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.MozCmCd;

@Mapper
public interface MozCmCdRepository {
	
	public List<MozCmCd> findAllCdList(String cdGroupId);

	/**
     * @brief : 코드 리스트 개수 조회
     * @details : 코드 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.01.23
     * @param : mozCmCd
     * @return : 
     */
	public int countMozCmCd(MozCmCd mozCmCd);

	/**
     * @brief : 코드 리스트 조회
     * @details : 코드 리스트 조회
     * @author : KC.KIM
     * @date : 2024.01.23
     * @param : mozCmCd
     * @return : 
     */
	public List<MozCmCd> findAllMozCmCd(MozCmCd mozCmCd);

	/**
     * @brief : 코드 등록
     * @details : 코드 등록
     * @author : KC.KIM
     * @date : 2024.01.31
     * @param : mozCmCd
     * @return : 
     */
	public void saveMozCmCd(MozCmCd mozCmCd);

	/**
     * @brief : 코드 상세 정보 조회
     * @details : 코드 상세 정보 조회
     * @author : KC.KIM
     * @date : 2024.01.31
     * @param : cdId
     * @return : 
     */
	public MozCmCd findOneMozCmCd(String cdId);

	/**
     * @brief : 코드 정보 삭제 
     * @details : 코드 정보 삭제 
     * @author : KC.KIM
     * @date : 2024.02.01
     * @param : cdId
     * @return
     */ 
	public void deleteMozCmCdByCdIdOrCdGroupId(String cdId);

	/**
     * @brief : 코드 상세 정보 수정 
     * @details : 코드 상세 정보 수정
     * @author : KC.KIM
     * @date : 2024.01.31
     * @param : mozCmCd
     * @return
     */ 
	public void updateMozCmCd(MozCmCd mozCmCd);


	/**
	  * @Method Name : findAllSubCmcd
	  * @작성일 : 2024. 2. 20.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 코드 상세정보 하위 코드 리스트 조회
	  * @param cdId
	  * @return
	  */
	public List<MozCmCd> findAllSubCmcd(String cdId);
	
	/**
	  * @Method Name : deleteMozCmCdByCdIdAndCdGroupId
	  * @작성일 : 2024. 2. 21.
	  * @작성자 : KY.LEE
	  * @Method 설명 : 서브 코드 삭제 
	  * @param MozCmCd
	  * @return
	  */
	public void deleteMozCmCdByCdId(MozCmCd mozCmCd);

	/**
	 * @Method Name : countByCdGroupId
	 * @Date : 2024. 3. 26.
	 * @Author : IK.MOON
	 * @Method Brief : 소속 기관 카운트조회
	 * @param MozCmCd
	 * @return int
	 */
	public int countByCdGroupId(MozCmCd mozCmCd);

	/**
     * @brief : 코드 목록 조회
     * @details : 코드 목록 조회
     * @author : IK.MOON
     * @date : 2024.03.26
     * @param : mozCmCd
     * @return : 
     */
	public List<MozCmCd> findAllCdListByPagination(MozCmCd mozCmCd);

	/**
	  * @Method Name : countMozCmCdByCdIdForSave
	  * @Date : 2024. 4. 9.
	  * @Author : IK.MOON
	  * @Method Brief : code id 중복 확인을 위한 카운트 조회 (저장)
	  * @param mozCmCd
	  * @return
	  */
	public int countMozCmCdByCdIdForSave(MozCmCd mozCmCd);
	
	/**
	 * @Method Name : countMozCmCdByCdIdForUpdate
	 * @Date : 2024. 4. 9.
	 * @Author : IK.MOON
	 * @Method Brief : code id 중복 확인을 위한 카운트 조회 (수정)
	 * @param mozCmCd
	 * @return
	 */
	public int countMozCmCdByCdIdForUpdate(MozCmCd mozCmCd);
	
}
