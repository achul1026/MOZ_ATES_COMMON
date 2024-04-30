package com.moz.ates.traffic.common.repository.finentc;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.finentc.MozFineNtcInfo;
import com.moz.ates.traffic.common.entity.stat.ChartSearchDTO;

@Mapper
public interface MozFineNtcInfoRepository {

	/**
     * @brief : 고지 관리 리스트 개수 조회
     * @details : 고지 관리 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.01.25
     */
	public int countFineNtcList(MozFineNtcInfo fineNtcInfo);

	/**
     * @brief : 고지 관리 리스트 조회
     * @details : 고지 관리 리스트 조회
     * @author : KC.KIM
     * @date : 2024.01.25
     */
	public List<MozFineNtcInfo> findAllFineNtcList(MozFineNtcInfo fineNtcInfo);
	
	/**
     * @brief : 고지 관리 상세 조회
     * @details : 고지 관리 상세 조회
     * @author : KY.LEE
     * @date : 2024.02.19
     */
	public MozFineNtcInfo findOneNtcDetailByFineNtcId(String fineNtcId);
	
	/**
     * @brief : 1차 고지 만료 조회
     * @details : 1차 고지 만료 조회
     * @author : KY.LEE
     * @date : 2024.02.27
     */
	public List<MozFineNtcInfo> findAllByExpirationFirstNtc(String ntcTy);

	/**
	 * @brief : 2차 고지 만료 조회
	 * @details : 2차 고지 만료 조회
	 * @author : KY.LEE
	 * @date : 2024.02.27
	 */
	public List<MozFineNtcInfo> findAllByExpirationSecondNtc(String ntcTy);
	
	/**
	 * @brief : 1차고지 - > 2차고지  
	 * @details : 1차고지 -> 2차고지
	 * @author : KY.LEE
	 * @date : 2024.02.27
	 */
	public void updateFirstNoticeBatch();

	/**
	 * @brief : 1차고지 - > 2차고지  
	 * @details : 1차고지 -> 2차고지
	 * @author : KY.LEE
	 * @date : 2024.02.27
	 */
	public void updateSecondNoticeBatch();
	
	/**
	 * @brief 고지서 등록(단속고지 1차)
	 * @author KY.LEE
	 * @date 2024. 3. 7.
	 * @method insertFineNtcInfo
	 */
	public void insertFineNtcInfo(MozFineNtcInfo mozFineNtcInfo);

	/**
     * @brief : 교통단속 - 고지 정보 삭제
     * @details : 교통단속 - 고지 정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : tfcEnfId
     * @return : 
     */
	public void deleteFineNtcInfoByTfcEnfId(String tfcEnfId);
	
	/**
     * @brief : 교통단속 - 고지 정보 조회
     * @details : 교통단속 - 고지 정보 조회
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : tfcEnfId
     * @return : 
     */
	public MozFineNtcInfo findOneFineNtcInfoByTfcEnfId(String tfcenfid);

	/**
     * @brief : 교통단속 정보 삭제 - 고지정보 삭제
     * @details : 교통단속 정보 삭제 - 고지정보 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : fineNtcInfo
     * @return : 
     */
	public void updateNtcTyForDeleteEnfInfo(MozFineNtcInfo fineNtcInfo);
	
	/**
	  * @Method Name : findOneTfcEnfIdByFineNtcId
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 - 이의제기 - 이의제기 등록을 위한 단속정보 고유번호 조회
	  * @param fineNtcInfo
	  * @return
	  */
	public MozFineNtcInfo findOneTfcEnfIdByFineNtcId(MozFineNtcInfo fineNtcInfo);
	
	/**
	  * @Method Name : findOneMozFineNtcInfoJoinMozTfcEnfMasterAndMozFinePymntInfoAndMozCmCdByFineNtcId
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포탈 - 이의제기 - 이의제기 등록을 위한 고지서 정보 조회
	  * @param fineNtcInfo
	  * @return
	  */
	public MozFineNtcInfo findOneMozFineNtcInfoJoinMozTfcEnfMasterAndMozFinePymntInfoAndMozCmCdByTfcEnfId(MozFineNtcInfo fineNtcInfo);
	
	/**
	  * @Method Name : findOneMozFineNtcInfoStatus
	  * @Date : 2024. 4. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 - 납부 상태 조회
	  * @param paramMap
	  * @return
	  */
	public MozFineNtcInfo findOneMozFineNtcInfoStatus(Map<String, Object> paramMap);

	/**
     * @brief : 통계 데이터 조회(고지)
     * @details : 통계 데이터 조회(고지)
     * @author : KC.KIM
     * @date : 2024.04.24
     * @param : chartDTO
     * @return : 
     */
	public Map<String, Object> findAllChartData(ChartSearchDTO chartDTO);
	
	/**
	  * @Method Name : fineOneFineNtcInfo
	  * @Date : 2024. 4. 29.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 고지서 팝업 정보 조회 (1차 고지)
	  * @param paramMap
	  * @return
	  */
	public MozFineNtcInfo findOneFineNtcInfoForNoticeDetail(Map<String, Object> paramMap);
}
