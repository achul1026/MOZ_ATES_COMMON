package com.moz.ates.traffic.common.repository.enforcement;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.EnforcementDomain;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;

@Mapper
public interface MozTfcEnfMasterRepository {
	public List<MozTfcEnfMaster> selectEnfList(MozTfcEnfMaster tfcEnfMaster);
	
	public List<EnforcementDomain> selectEnforcementList(String tfcEnfId);
	
	public List<MozTfcEnfMaster> findAllInfoList(MozTfcEnfMaster tfcEnfMaster);
	
	public int countInfoList(MozTfcEnfMaster tfcEnfMaster);
	
	public MozTfcEnfMaster findOneMozTfcEnfMasterBytfcEnfId(String tfcEnfId);
	
	public int selectFinesListTotalCnt(Map<String, Object> paramMap);

	public List<MozTfcEnfMaster> selectFinesList(Map<String, Object> paramMap);
	
	public MozTfcEnfMaster selectFinesDetail(Map<String, Object> paramMap);

	public MozTfcEnfMaster selectPaymentInfo(Map<String, Object> paramMap);
	
	public void insertTfcEnfInfo(MozTfcEnfMaster tfcEnfMaster);
	
	public void insertPenaltyMaster(MozTfcEnfMaster tfcEnfMaster);
	
	public void updatePenaltyMaster(MozTfcEnfMaster tfcEnfMaster);
	
	public void deleteEnfImage(MozTfcEnfMaster tfcEnfMaster);

	public MozTfcEnfMaster selectOne(String tfcEnfId);
	
    /**
     * @brief : 범칙금 상세 조회
     * @details : 범칙금 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : pymntId
     * @return : 
     */
	public void updateMozTfcEnfMaster(MozTfcEnfMaster tfcEnfMaster);
}
