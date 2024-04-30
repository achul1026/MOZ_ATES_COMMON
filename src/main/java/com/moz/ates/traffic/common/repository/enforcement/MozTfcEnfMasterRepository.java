package com.moz.ates.traffic.common.repository.enforcement;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.ChartDTO.EnforcementChartGraph;
import com.moz.ates.traffic.common.entity.common.ChartDTO.EnforcementCircularGraph;
import com.moz.ates.traffic.common.entity.common.EnforcementDomain;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.stat.ChartSearchDTO;

@Mapper
public interface MozTfcEnfMasterRepository {
	public List<MozTfcEnfMaster> findAllEnfList(MozTfcEnfMaster tfcEnfMaster);
	
	public List<EnforcementDomain> selectEnforcementList(String tfcEnfId);
	
	public List<MozTfcEnfMaster> findAllInfoList(MozTfcEnfMaster tfcEnfMaster);
	
	public int countInfoList(MozTfcEnfMaster tfcEnfMaster);
	
	public MozTfcEnfMaster findOneMozTfcEnfMasterBytfcEnfId(String tfcEnfId);

	public MozTfcEnfMaster findOnePaymentInfo(Map<String, Object> paramMap);
	
	public void insertTfcEnfInfo(MozTfcEnfMaster tfcEnfMaster);
	
	public void insertPenaltyMaster(MozTfcEnfMaster tfcEnfMaster);
	
	public void updatePenaltyMaster(MozTfcEnfMaster tfcEnfMaster);
	
	public void deleteEnfImage(MozTfcEnfMaster tfcEnfMaster);

	public MozTfcEnfMaster findOneMozTfcEnfMaster(String tfcEnfId);
	
    /**
     * @brief : 범칙금 상세 조회
     * @details : 범칙금 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : pymntId
     * @return : 
     */
	public void updateMozTfcEnfMaster(MozTfcEnfMaster tfcEnfMaster);
	
	/**
	  * @Method Name : countAllMozTfcEnfByTfcEnfDt
	  * @Date : 2024. 3. 6.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 count 조회 by tfcEnfDt
	  * @param tfcEnfMaster
	  * @return
	  */
	public int countAllMozTfcEnfByTfcEnfDt(MozTfcEnfMaster tfcEnfMaster);

	/**
     * @brief : 교통단속 정보 삭제
     * @details : 교통단속 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : tfcEnfId
     * @return : 
     */
	public void deleteTfcEnfMasterByTfcEnfId(String tfcEnfId);
	
	public void deleteTfcEnfMaster(MozTfcEnfMaster tfcEnfMaster);
	
	/**
	  * @Method Name : findAllTfcEnfMasterHistory
	  * @Date : 2024. 3. 6.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 목록 조회
	  * @param MozTfcEnfMaster
	  */
	public List<MozTfcEnfMaster> findAllTfcEnfMasterHistory(MozTfcEnfMaster tfcEnfMaster);
	
	
	/**
	  * @Method Name : findOneTfcEnfInfoByTfcEnfId
	  * @Date : 2024. 3. 6.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 상세 조회
	  * @param String
	  */
	public MozTfcEnfMaster findOneTfcEnfInfoByTfcEnfId(String tfcEnfId);

	/**
	  * @Method Name : countAllTfcEnfMasterHistory
	  * @Date : 2024. 3. 6.
	  * @Author : IK.MOON
	  * @Method Brief : 단속 목록 카운트
	  * @param MozTfcEnfMaster
	  */
	public int countAllTfcEnfMasterHistory(MozTfcEnfMaster tfcEnfMaster);

	/**
	  * @Method Name : countPolSeqByTfcEnfId
	  * @Date : 2024. 3. 24.
	  * @Author : KY.LEE
	  * @Method Brief : 시퀀스조회
	  * @param String
	  */
	public Long countPolSeqByTfcEnfId(String tfcEnfId);
	
	/**
	  * @Method Name : findOneMozTfcEnfMasterStatus
	  * @Date : 2024. 4. 18.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 단속 상태 조회
	  * @param paramMap
	  * @return
	  */
	public MozTfcEnfMaster findOneMozTfcEnfMasterStatus(Map<String, Object> paramMap);
	
	/**
	 * @Method Name : findOneMozTfcEnfMasterStatus
	 * @Date : 2024. 4. 18.
	 * @Author : IK.MOON
	 * @Method Brief : 포털 단속 상태 조회(상세)
	 * @param paramMap
	 * @return
	 */
	public MozTfcEnfMaster findOneMozTfcEnfMasterStatusDetail(Map<String, Object> paramMap);
	
	/**
     * @brief : 통계 데이터 조회(교통단속)
     * @details : 통계 데이터 조회(교통단속)
     * @author : KC.KIM
     * @date : 2024.04.24
     * @param : chartDTO
     * @return : 
     */
	public Map<String, Object> findAllChartData(ChartSearchDTO chartDTO);

	/**
	  * @Method Name : countAllMozTfcEnfMasterByDvrLcenIdAndVioBrthAndDelYn
	  * @Date : 2024. 4. 25.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 라이센스 조회 - 단속 리스트 카운트 조회
	  * @param tfcEnfMaster
	  * @return
	  */
	public int countAllMozTfcEnfMasterByDvrLcenIdAndVioBrthAndDelYn(MozTfcEnfMaster tfcEnfMaster);
	
	/**
	  * @Method Name : findAllMozTfcEnfMasterByDvrLcenIdAndVioBrthAndDelYn
	  * @Date : 2024. 4. 25.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 라이센스 조회 - 단속 리스트 조회
	  * @param tfcEnfMaster
	  * @return
	  */
	public List<MozTfcEnfMaster> findAllMozTfcEnfMasterByDvrLcenIdAndVioBrthAndDelYn(MozTfcEnfMaster tfcEnfMaster);

	/**
	 * @Method Name : findMozTfcEnfMasterByToday
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 단속 목록 조회 
	 * @return List<MozTfcEnfMaster>
	 */
	public List<MozTfcEnfMaster> findMozTfcEnfMasterByToday();

	/**
	 * @Method Name : findOneEnforcementStatisticsCircularGraph
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 단속 파이 차트 조회
	 * @return EnforcementCircularGraph
	 */
	public EnforcementCircularGraph findOneEnforcementStatisticsCircularGraph();

	/**
	 * @Method Name : findOneEnforcementStatisticsChartGraph
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 단속 그래프 차트조회
	 * @return EnforcementChartGraph
	 */
	public EnforcementChartGraph findOneEnforcementStatisticsChartGraph();

	/**
	 * @Method Name : getTodayAccidentCount
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 사고 목록 카운트
	 */
	public int countMozTfcEnfMasterByToday();
	
}
