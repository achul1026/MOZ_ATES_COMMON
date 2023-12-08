package com.moz.ates.traffic.common.repository.payment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.payment.MozPlPymntInfo;

@Mapper
public interface MozPlPymntInfoRepository {
	
	public List<MozPlPymntInfo> selectPlacePaymentList(MozPlPymntInfo plPymntInfo);
	
	public void saveMozPlPymntInfo(MozPlPymntInfo plPymntInfo);
	
	public void updatePenaltyPlace(MozPlPymntInfo plPymntInfo);
	
	public void deletePenaltyPlace(String placePymntId);

    /**
     * @brief : 범칙금 납부처 리스트 조회 
     * @details : 범칙금 납부처 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.08
     * @param : plPymntInfo
     * @return : 
     */
	public List<MozPlPymntInfo> findAllPenaltyPlaceList(MozPlPymntInfo plPymntInfo);

    /**
     * @brief : 범칙금 납부처 리스트 개수 조회 
     * @details : 범칙금 납부처 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.08
     * @param : plPymntInfo
     * @return : 
     */
	public int countPenaltyPlaceList(MozPlPymntInfo plPymntInfo);

    /**
     * @brief : 범칙금 납부처 상세 
     * @details : 범칙금 납부처 상세
     * @author : KC.KIM
     * @date : 2023.08.08
     * @param : placePymntId
     * @return : 
     */
	public MozPlPymntInfo findOnePenaltyPlaceDetail(String placePymntId);
}
