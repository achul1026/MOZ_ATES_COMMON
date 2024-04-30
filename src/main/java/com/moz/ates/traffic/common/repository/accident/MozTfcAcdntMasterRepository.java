package com.moz.ates.traffic.common.repository.accident;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntMaster;
import com.moz.ates.traffic.common.entity.common.AccidentDomain;
import com.moz.ates.traffic.common.entity.common.ChartDTO.AccidentChartGraph;
import com.moz.ates.traffic.common.entity.common.ChartDTO.AccidentCircularGraph;
import com.moz.ates.traffic.common.entity.stat.ChartSearchDTO;

@Mapper
public interface MozTfcAcdntMasterRepository {
	public List<MozTfcAcdntMaster> findAllAcdntList(MozTfcAcdntMaster tfcAcdntMaster);
	
	public AccidentDomain findOneAccidentInfo(String tfcAcdntid);
	// 수정 예정
	public int countAcdntDupliCnt(MozTfcAcdntMaster tfcAcdntMaster);
	
	public int countTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);
	
	public List<MozTfcAcdntMaster> findAllMngList(MozTfcAcdntMaster tfcAcdntMaster);
	
	public int countMngListCnt(MozTfcAcdntMaster tfcAcdntMaster);
	
	public MozTfcAcdntMaster findOneMngDetail(String tfcAcdntId);
	// 수정 예정
	public void insertAcdnt(MozTfcAcdntMaster tfcAcdntMaster);

	public void saveMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);
	// 수정 예정
	public void upateAcdnt(MozTfcAcdntMaster tfcAcdntMaster);

	public void updateMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);

	public List<MozTfcAcdntMaster> findAllMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);

	public int countMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);
	
	/**
	  * @Method Name : countAllByAcdntDt
	  * @Date : 2024. 3. 6.
	  * @Author : IK.MOON
	  * @Method Brief : 교통 사고 count 조회 by AcdntDt
	  * @param trAcdntMaster
	  * @return
	  */
	public int countAllByAcdntDt(MozTfcAcdntMaster trAcdntMaster);

	/**
	 * @Method Name : countAllTfcEnfHistoryList
	 * @Date : 2024. 3. 6.
	 * @Author : IK.MOON
	 * @Method Brief : 교통 사고 count 조회 by AcdntDt
	 * @param trAcdntMaster
	 * @return
	 */
	public int countAllTfcEnfHistoryList(MozTfcAcdntMaster trAcdntMaster);
	
	/**
	  * @Method Name : findAllTfcEnfHistoryList
	  * @Date : 2024. 3. 19.
	  * @Author : IK.MOON
	  * @Method Brief : 사고 이력 조회
	  * @return
	  */
	public List<MozTfcAcdntMaster> findAllTfcEnfHistoryList(MozTfcAcdntMaster tfcAcdntMaster);
	
	/**
	  * @Method Name : findOneTfcAcdntHistory
	  * @Date : 2024. 3. 21.
	  * @Author : IK.MOON
	  * @Method Brief : 사고 이력 상세 조회
	  * @param tfcAcdntMaster
	  * @return
	  */
	public MozTfcAcdntMaster findOneTfcAcdntHistory(String tfcAcdntId);

	/**
	  * @Method Name : countPolSeqByTfcEnfId
	  * @Date : 2024. 3. 24.
	  * @Author : KY.LEE
	  * @Method Brief : 등록 시퀀스 조회
	  * @param String
	  */
	public Long countPolSeqByTfcAcdntId(String tfcAcdntId);
	
	/**
     * @brief : 통계 데이터 조회(교통사고)
     * @details : 통계 데이터 조회(교통사고)
     * @author : KC.KIM
     * @date : 2024.04.24
     * @param : chartDTO
     * @return : 
     */
	public Map<String, Object> findAllChartData(ChartSearchDTO chartDTO);

	/**
	 * @Method Name : getTodayAccidentInfo
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 사고 목록
	 * @return List<MozTfcEnfMaster>
	 */
	public List<MozTfcAcdntMaster> findMozTfcAcdntMatserByToday();

	/**
	 * @Method Name : findOneAccidentStatisticsCircularGraph
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 사고 목록
	 * @return List<MozTfcEnfMaster>
	 */
	public AccidentCircularGraph findOneAccidentStatisticsCircularGraph();

	/**
	 * @Method Name : findOneAccidentStatisticsChartGraph
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 연별
	 * @return List<MozTfcEnfMaster>
	 */
	public AccidentChartGraph findOneAccidentStatisticsChartGraph();

	/**
	 * @Method Name : getTodayAccidentCount
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 대시보드 금일 사고 목록 카운트
	 */
	public int countMozTfcAcdntMatserByToday();
}
