package com.moz.ates.traffic.common.repository.driver;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.driver.MozVioInfo;

@Mapper
public interface MozVioInfoRepository { 
	
	public List<Map<String, Object>> searchTrafficList(Map<String,Object>paramMap);
	
	public void insertVioInfo(MozVioInfo vioInfo);
	
	public void updateVioPnoAndVioEmailByVioId(MozVioInfo vioInfo);

	/**
     * @brief : 교통단속 - 위반자 정보 삭제
     * @details : 교통단속 - 위반자 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : vioId
     * @return : 
     */
	public void deleteVioInfoByVioId(String vioId);
	
	/**
	  * @Method Name : findOneFileInfo
	  * @Date : 2024. 3. 19.
	  * @Author : IK.MOON
	  * @Method Brief : 위반자 서명파일 조회
	  * @param vioId
	  * @return
	  */
	public MozVioInfo findOneFileInfo(String vioId);

	/**
	 * @Method Name : findAllSecondFineNtcVioInfo
	 * @Date : 2024. 4. 03.
	 * @Author : KY.LEE
	 * @Method Brief : 2차고지로 변경된 위반자들 조히
	 * @return List<MozVioInfo>
	 */
	public List<MozVioInfo> findAllSecondFineNtcVioInfo();

	/**
	 * @Method Name : findAllAdministrativeActionVioInfo
	 * @Date : 2024. 4. 03.
	 * @Author : KY.LEE
	 * @Method Brief : 행정처분 위반자들 조회
	 * @return List<MozVioInfo>
	 */
	public List<MozVioInfo> findAllAdministrativeActionVioInfo();

	public void updateMozVioINfo(MozVioInfo vioInfo);

	/**
	 * @brief : 위반자 정보 조회
	 * @details : 위반자 정보 조회
	 * @author : KY.LEE
	 * @date : 2024.04.09
	 * @param : driverLicenseId
	 */
	public List<MozVioInfo> findAllViolationInfoByDvrLcenId(String dvrLcenId);
}
