package com.moz.ates.traffic.common.repository.police;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.police.MozPolInfo;

@Mapper
public interface MozPolInfoRepository {
	
	public List<MozPolInfo> findAllPolInfoList(MozPolInfo polInfo);
	
	public int countPolInfoListCnt(MozPolInfo polInfo);
	
	public MozPolInfo findAllPoliceInfo(MozPolInfo polInfo);
	
	public MozPolInfo findOnePoliceInfoByPoliceId(String appPolId);

	public MozPolInfo findOnePoliceInfoByPoliceLcenId(String polLcenId);

	public MozPolInfo fineOnePolInfoDetail(String polLcenId);

    /**
   * @brief : 사용자 리스트 조회
   * @details : 사용자 리스트 조회
   * @author : KC.KIM
   * @date : 2023.08.18
   * @param : polInfo
   * @return : 
   */
	public List<MozPolInfo> findAllMozPolInfo(MozPolInfo polInfo);

    /**
   * @brief : 사용자 리스트 개수 조회
   * @details : 사용자 리스트 개수 조회
   * @author : KC.KIM
   * @date : 2023.08.18
   * @param : polInfo
   * @return : 
   */
	public int countMozPolInfo(MozPolInfo polInfo);

    /**
     * @brief : 사용자 상세 조회
     * @details : 사용자 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : oprtrId
     * @return : 
     */
	public MozPolInfo findOneMozPolInfo(String polId);

	/**
	  * @Method Name : updateMozPolInfo
	  * @작성일 : 2024. 2. 22.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 경찰 수정
	  * @param polInfo
	  */
	public void updateMozPolInfo(MozPolInfo polInfo);

	/**
	  * @Method Name : deleteMozPolInfo
	  * @작성일 : 2024. 2. 22.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 경찰 삭제
	  * @param polInfo
	  */
	public void deleteMozPolInfo(MozPolInfo polInfo);

	/**
	  * @Method Name : updateAppPolPwByPolId
	  * @작성일 : 2024. 3. 22.
	  * @작성자 : KY.LEE
	  * @Method 설명 : 경찰 비밀번호 변경
	  * @param polInfo
	  */
	public void updateAppPolPwByPolId(MozPolInfo updateMozPolInfo);
	
	/**
	 * @Method Name : findPasswordByPoliceId
	 * @작성일 : 2024. 3. 22.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 비밀번호 조회
	 * @param polInfo
	 */
	public String findPasswordByPoliceId(String polId);
	
	/**
	 * @Method Name : updateMozPolInfoByPolId
	 * @작성일 : 2024. 3. 22.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 회원정보 수정
	 * @param polInfo
	 */
	public void updateMozPolInfoByPoliceApp(MozPolInfo mozPolInfo);

	/**
	 * @Method Name : saveMozPolInfo
	 * @작성일 : 2024. 3. 22.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 회원 등록 신청
	 * @param polInfo
	 */
	public void saveMozPolInfo(MozPolInfo mozPolInfo);

	/**
	 * @Method Name : existsByPolLcenId
	 * @작성일 : 2024. 3. 22.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 회원 등록 중복조회
	 * @param polInfo
	 */
	public boolean existsByPolLcenId(String polLcenId);

	/**
	 * @Method Name : findOnePoliceInfoByPoliceLcenIdAndBrth
	 * @작성일 : 2024. 3. 27.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 경찰 정보 조회
	 * @param polInfo
	 */
	public MozPolInfo findOnePoliceInfoByPoliceLcenIdAndBrth(MozPolInfo mozPolInfo);
}
