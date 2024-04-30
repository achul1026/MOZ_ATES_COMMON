package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;
import com.moz.ates.traffic.common.entity.stat.ChartSearchDTO;

@Mapper
public interface MozTfcEnfEqpMasterRepository {
	public int countEqpDupliCnt(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public List<MozTfcEnfEqpMaster> findAllMngList(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public int countMngListCnt(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public MozTfcEnfEqpMaster findOneEqpDetail(String tfcEnfEqpId);
	
	public void insertTfcEnfEqpMaster(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public void updateEqp(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public void deleteEqpImage(MozTfcEnfEqpMaster tfcEnfEqpMaster);

    /**
     * @brief : 단속장비 리스트 조회
     * @details : 단속장비 리스트 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcEnfEqpMaster
     * @return : 
     */
	public List<MozTfcEnfEqpMaster> findAllMozTfcEnfEqpMaster(MozTfcEnfEqpMaster tfcEnfEqpMaster);

    /**
     * @brief : 단속장비 리스트 개수 조회
     * @details : 단속장비 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : tfcEnfEqpMaster
     * @return : 
     */
	public int countMozTfcEnfEqpMaster(MozTfcEnfEqpMaster tfcEnfEqpMaster);

	/**
     * @brief : 단속장비 정보 삭제
     * @details : 단속장비 정보 삭제
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : tfcEnfEqpMaster
     * @param : imageFiles
     * @return : 
     */
	public void deleteTfcEnfEqpMasterByTfcEnfEqpId(String tfcEnfEqpId);

	/**
     * @brief : 통계 데이터 조회(시설물)
     * @details : 통계 데이터 조회(시설물)
     * @author : KC.KIM
     * @date : 2024.04.24
     * @param : chartDTO
     * @return : 
     */
	public Map<String, Object> findAllChartData(ChartSearchDTO chartDTO);

	/**
	 * @Method Name : getEqpInfo
	 * @Date : 2024. 4. 25.
	 * @Author : KY.LEE
	 * @Method Brief : 단속장비 정보
	 * @return Map<String,Object>
	 */
	public Map<String, Object> findOneEqpUseCnt();
}
