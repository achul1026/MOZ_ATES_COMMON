package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozTfcSftyInfrm;

@Mapper
public interface MozTfcSftyInfrmRepository {
	/**
     * @brief : 교통안전정보 리스트 개수 조회
     * @details : 교통안전정보 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.18
     * @param : mozTfcSftyInfrm
     * @return : 
     */
	public int countTfcSftyInfrmList(MozTfcSftyInfrm mozTfcSftyInfrm);

	/**
     * @brief : 교통안전정보 리스트 조회
     * @details : 교통안전정보 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.18
     * @param : mozTfcSftyInfrm
     * @return : 
     */
	public List<MozTfcSftyInfrm> findAllTfcSftyInfrmList(MozTfcSftyInfrm mozTfcSftyInfrm);
	
	/**
     * @brief : 교통안전정보 상세 조회
     * @details : 교통안전정보 상세 조회
     * @author : KC.KIM
     * @date : 2024.02.18
     * @param : mozTfcSftyInfrm
     * @return : 
     */
	public MozTfcSftyInfrm findOneTfcSftyInfrmDetail(String tfcSftyInfrmId);
	
	/**
     * @brief : 교통안전정보 삭제
     * @details : 교통안전정보 삭제
     * @author : KC.KIM
     * @date : 2024.02.19
     * @param : tfcSftyInfrmId
     * @return : 
     */
	public void deleteSftyInfrmByTfcSftyInfrmId(String tfcSftyInfrmId);

	/**
     * @brief : 교통안전정보 등록
     * @details : 교통안전정보 등록
     * @author : KC.KIM
     * @date : 2024.02.19
     * @param : mozTfcSftyInfrm
     * @return : 
     */
	public void insertMozTfcSftyInfrm(MozTfcSftyInfrm mozTfcSftyInfrm);

	/**
     * @brief : 교통안전정보 수정
     * @details : 교통안전정보 수정
     * @author : KC.KIM
     * @date : 2024.02.19
     * @param : mozTfcSftyInfrm
     * @return : 
     */
	public void updateMozTfcSftyInfrm(MozTfcSftyInfrm mozTfcSftyInfrm);
	
	
	/**
	  * @Method Name : countAllByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전정보 카운트 조회
	  * @param mozTfcSftyInfrm
	  * @return
	  */
	public int countAllByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyInfrm mozTfcSftyInfrm);
	
	/**
	  * @Method Name : findAllMozTfcSftyInfrmByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전정보 리스트 조회
	  * @param mozTfcSftyInfrm
	  * @return
	  */
	public List<MozTfcSftyInfrm> findAllMozTfcSftyInfrmByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyInfrm mozTfcSftyInfrm);
	
	/**
	  * @Method Name : findOneByTfcSftyInfrmIdAndExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전정보 상세 조회
	  * @param mozTfcSftyInfrm
	  * @return
	  */
	public MozTfcSftyInfrm findOneByTfcSftyInfrmIdAndExpYnAndPostStrDeAndPostEndDe(MozTfcSftyInfrm mozTfcSftyInfrm);
	
	/**
	  * @Method Name : updateViewCntByTfcSftyInfrmIdAndExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전정보 조회수 증가
	  * @param mozTfcSftyInfrm
	  */
	public void updateViewCntByTfcSftyInfrmIdAndExpYnAndPostStrDeAndPostEndDe(MozTfcSftyInfrm mozTfcSftyInfrm);
}
