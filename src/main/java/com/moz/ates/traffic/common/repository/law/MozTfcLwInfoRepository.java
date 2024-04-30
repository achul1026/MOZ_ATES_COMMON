package com.moz.ates.traffic.common.repository.law;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;

@Mapper
public interface MozTfcLwInfoRepository {
	public List<MozTfcLwInfo> findAllLawListsByTfcLwInfo(MozTfcLwInfo tfcLwInfo);

	/**
	 * @brief 범칙금이 존재하는 법률 목록 조회
	 * @author KY.LEE
	 * @date 2024. 3. 6.
	 * @method findAllLawListsIsNotNullFineInfo
	 */
	public List<MozTfcLwInfo> findAllLawListsIsNotNullFineInfo();
	
	public int countLawListsByTfcLwInfo(MozTfcLwInfo tfcLwInfo);
	
	public MozTfcLwInfo findOneLawDetail(String tfcLawId);
	
	public List<MozTfcLwInfo> findAllTrafficLawsList(MozTfcLwInfo tfcLwInfo);
	
	public void insertMozTfcLwInfo(MozTfcLwInfo tfcLwInfo);
	
	public void updateMozTfcLwInfoByTfcLawId(MozTfcLwInfo tfcLwInfo);
	
	public void deleteMozTfcLwInfoByTfcLawId(String tfcLawId);
	
	/**
	 * 법률 폐지 처리
	 * @param mozTfcLwInfo
	 */
	public void updateRepealYnByTfcLawId(MozTfcLwInfo mozTfcLwInfo);
	
	
//************************* for Portal start
	
	/**
	  * @Method Name : countAllMozTfcLwInfo
	  * @Date : 2024. 4. 2.
	  * @Author : IK.MOON
	  * @Method Brief : 법률 카운트 조회
	  * @param mozTfcLwInfo
	  * @return
	  */
	public int countAllMozTfcLwInfo(MozTfcLwInfo mozTfcLwInfo);
	
	/**
	  * @Method Name : findAllMozTfcLwInfo
	  * @Date : 2024. 4. 2.
	  * @Author : IK.MOON
	  * @Method Brief : 법률 리스트 조회
	  * @param mozTfcLwInfo
	  * @return
	  */
	public List<MozTfcLwInfo> findAllMozTfcLwInfo(MozTfcLwInfo mozTfcLwInfo);
	
	/**
	  * @Method Name : findOneMozTfcLwInfoByTfcLwId
	  * @Date : 2024. 4. 2.
	  * @Author : IK.MOON
	  * @Method Brief : 법률 상세 조회
	  * @param mozTfcLwInfo
	  * @return
	  */
	public MozTfcLwInfo findOneMozTfcLwInfoByTfcLwId(MozTfcLwInfo mozTfcLwInfo);
	
	/**
	  * @Method Name : findAllMozTfcLwInfoByFineNtcId
	  * @Date : 2024. 4. 19.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 상태 조회 - 위반 법률 조회
	  * @param fineNtcId
	  * @return
	  */
	public List<MozTfcLwInfo> findAllMozTfcLwInfoByTfcEnfId(String tfcEnfId);
	
//************************* for Portal end	
	
}
