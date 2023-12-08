package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;

@Mapper
public interface MozTfcEnfEqpMasterRepository {
	public int selectEqpDupliCnt(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public List<MozTfcEnfEqpMaster> selectMngList(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public int selectMngListCnt(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
	public MozTfcEnfEqpMaster selectEqpDetail(String tfcEnfEqpId);
	
	public void insertEqp(MozTfcEnfEqpMaster tfcEnfEqpMaster);
	
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
}
