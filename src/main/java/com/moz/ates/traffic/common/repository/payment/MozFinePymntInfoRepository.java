package com.moz.ates.traffic.common.repository.payment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.ChartDTO.PaymentChartGraph;
import com.moz.ates.traffic.common.entity.common.ChartDTO.PaymentCircularGraph;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;

@Mapper
public interface MozFinePymntInfoRepository {
	public int countPenaltyDupliCnt(MozFinePymntInfo finePymntInfo);
	
	public List<MozFinePymntInfo> findAllPenaltyList(MozFinePymntInfo finePymntInfo);
	
	public int selectPenaltyListCnt(MozFinePymntInfo finePymntInfo);
	
	public MozFinePymntInfo findOnePenaltyDetailForAdmin(String pymntId);
	
	public MozFinePymntInfo findOnePenaltyDetail(String pymntId);
	
	public MozFinePymntInfo findOneTrafficEnfDetail(String tfcEnfId);
	
	public void insertPenaltyMaster(MozFinePymntInfo finePymntInfo);
	
	public void insertPenaltyForAdmin(MozFinePymntInfo finePymntInfo);
	
	public void insertFinePaymentInfo(MozFinePymntInfo finePymntInfo);
	
	public void updatePenalty(MozFinePymntInfo finePymntInfo);
	
	public void updateFineTotalPrice(MozFinePymntInfo finePymntInfo);
	
	public void updatePaymentInfo(MozFinePymntInfo finePymntInfo);
	
	public void paymentCompleted(String tfcEnfId);
	
	public void paymentCencal(String tfcEnfId);

    /**
     * @brief : 범칙금 리스트 조회
     * @details : 범칙금 리스트 조회 
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : finePymntInfo
     * @return : 
     */
	public List<MozFinePymntInfo> findAllMozFinePymntInfo(MozFinePymntInfo finePymntInfo);

    /**
     * @brief : 범칙금 리스트 개수 조회
     * @details : 범칙금 리스트 조회 
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : finePymntInfo
     * @return : 
     */
	public int countMozFinePymntInfo(MozFinePymntInfo finePymntInfo);
	
    /**
     * @brief : 범칙금 등록
     * @details : 범칙금 등록
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : finePymntInfo
     * @return : 
     */
	public void saveMozFinePymntInfo(MozFinePymntInfo finePymntInfo);

    /**
     * @brief : 범칙금 상세 조회
     * @details : 범칙금 상세 조회
     * @author : KC.KIM
     * @date : 2023.09.13
     * @param : finePymntInfo
     * @return : 
     */
	public MozFinePymntInfo findOneMozFinePymntInfoForAdmin(String pymntId);
	
	/**
	 * @brief : 범칙금 상세 (코드)
	 * @details : 범칙금 상세 (코드)
	 * @author : KY.LEE
	 * @date : 2024.04.01
	 * @param : pymntId
	 * @return : MozFinePymntInfo
	 */
	public MozFinePymntInfo findOneMozFinePymntInfoForDev(String pymntId);

    /**
     * @brief : 범칙금 수정
     * @details : 범칙금 수정
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : finePymntInfo
     * @return : 
     */
	public void updateMozFinePymntInfo(MozFinePymntInfo finePymntInfo);

    /**
     * @brief : 범칙금 납부 처리
     * @details : 범칙금 납부 처리
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : pymntId
     * @return : 
     */
	public void updateMozFinePymntInfoForPymntY(String pymntId);
    /**
     * @brief : 범칙금 미납 처리
     * @details : 범칙금 미납 처리
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : pymntId
     * @return : 
     */
	public void updateMozFinePymntInfoForPymntN(String pymntId);

	/**
     * @brief : 교통단속 - 범칙금 정보 삭제
     * @details : 교통단속 - 범칙금 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : fineNtcId
     * @return : 
     */
	public void deleteFinePymntInfoByTfcEnfId(String fineNtcId);
	
	/**
     * @brief : 범칙금 납부
     * @details : 범칙금 납부
     * @author : KY.LEE
     * @date : 2024.03.20
     * @param : MozFinePymntInfo
     * @return : 
     */
	public void updatePymntStts(MozFinePymntInfo dbMozFinePymntInfo);
	
	/**
     * @brief : 결제 정보 원형 그래프 통계
     * @details : 결제 정보 ㅍ
     * @author : NK.KIM
     * @date : 2024.04.25
     * @return : CircularGraph 
     */
	public PaymentCircularGraph findOnePaymentStatisticsCircularGraph();
	
	/**
	 * @brief : 결제 정보 차트 그래프 통계
	 * @details : 결제 정보 차트 그래프 통계
	 * @author : NK.KIM
	 * @date : 2024.04.25
	 * @return : List<PaymentChartGraph> 
	 */
	public PaymentChartGraph findOnePaymentStatisticsChartGraph();
}
