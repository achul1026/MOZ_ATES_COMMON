package com.moz.ates.traffic.common.repository.equipment;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEqpEnfInfo;

@Mapper
public interface MozTfcEqpEnfInfoRepository {

	/**
	 * @brief 단속장비 단속 정보 등록
	 * @author KY.LEE
	 * @date 2024. 4. 9.
	 * @method saveMozTfcEqpEnfInfo
	 */
	public void saveMozTfcEqpEnfInfo(MozTfcEqpEnfInfo mozTfcEqpEnfInfo);

	/**
	 * @brief 단속장비 단속 정보 삭제
	 * @author KC.KIM
	 * @date 2024. 4. 10.
	 * @method deleteTfcEqpEnfInfoByTfcEnfId
	 */
	public void deleteTfcEqpEnfInfoByTfcEnfId(String tfcEnfId);
    
}
