package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozTfcSftyEdctn;

@Mapper
public interface MozTfcSftyEdctnRepository {

	/**
     * @brief : 교통안전교육 리스트 개수 조회
     * @details : 교통안전교육 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozTfcSftyEdctn
     * @return : 
     */
	public int countMozTfcSftyEdctn(MozTfcSftyEdctn mozTfcSftyEdctn);

	/**
     * @brief : 교통안전교육 리스트 조회
     * @details : 교통안전교육 리스트 조회
     * @author : KC.KIM
     * @date : 2024.02.19
     * @param : mozTfcSftyEdctn
     * @return : 
     */
	public List<MozTfcSftyEdctn> findAllMozTfcSftyEdctn(MozTfcSftyEdctn mozTfcSftyEdctn);

	/**
     * @brief : 교통안전교육 등록
     * @details : 교통안전교육 등록
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozTfcSftyEdctn
     * @return : 
     */
	public void insertMozTfcSftyEdctn(MozTfcSftyEdctn mozTfcSftyEdctn);

	/**
     * @brief : 교통안전교육 상세 정보 조회
     * @details : 교통안전교육 상세 정보 조회
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : tfcSftyEdctnId
     * @return : 
     */
	public MozTfcSftyEdctn findOneMozTfcSftyEdctnByTfcSftyEdctnId(String tfcSftyEdctnId);
	
	/**
     * @brief : 교통안전교육 삭제
     * @details : 교통안전교육 삭제
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : tfcSftyEdctnId
     * @return : 
     */
	public void deleteMozTfcSftyEdctnByTfcSftyEdctnId(String tfcSftyEdctnId);

	/**
     * @brief : 교통안전교육 수정
     * @details : 교통안전교육 수정
     * @author : KC.KIM
     * @date : 2024.02.20
     * @param : mozTfcSftyEdctn
     * @return : 
     */
	public void updateMozTfcSftyEdctn(MozTfcSftyEdctn mozTfcSftyEdctn);
	
	
	/**
	  * @Method Name : countAllByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전교육 카운트 조회
	  * @param mozTfcSftyEdctn
	  * @return
	  */
	public int countAllByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyEdctn mozTfcSftyEdctn);
	
	/**
	  * @Method Name : findAllByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전교육 리스트 조회
	  * @param mozTfcSftyEdctn
	  * @return
	  */
	public List<MozTfcSftyEdctn> findAllByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyEdctn mozTfcSftyEdctn);
	
	/**
	  * @Method Name : updateViewCntByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전교육 조회수 증가
	  * @param mozTfcSftyEdctn
	  */
	public void updateViewCntByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyEdctn mozTfcSftyEdctn);
	
	/**
	  * @Method Name : findOneByExpYnAndPostStrDeAndPostEndDe
	  * @Date : 2024. 3. 26.
	  * @Author : IK.MOON
	  * @Method Brief : 교통안전교육 상세 조회
	  * @param mozTfcSftyEdctn
	  * @return
	  */
	public MozTfcSftyEdctn findOneByExpYnAndPostStrDeAndPostEndDe(MozTfcSftyEdctn mozTfcSftyEdctn);
}
