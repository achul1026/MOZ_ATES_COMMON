package com.moz.ates.traffic.common.repository.law;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.law.MozTfcLwAdtnRvsn;

@Mapper
public interface MozTfcLwAdtnRvsnRepository {
	
    /**
     * @brief : 법률 추가개정 목록
     * @details : 법률 추가개정 목록
     * @author : KY.LEE
     * @date : 2024.02.23
     * @param : tfcLawId
     * @return : List<MozTfcLwAdtnRvsn>
     */
	List<MozTfcLwAdtnRvsn> findMozTfcLwAdtnRvsnByTfcLawId(String tfcLawId);
	
	/**
	 * @brief : saveMozTfcLwAdtnRvsn
	 * @details : 추가개정 등록
	 * @author : KY.LEE
	 * @date : 2024.02.23
	 * @param : MozTfcLwAdtnRvsn
	 */
	public void saveMozTfcLwAdtnRvsn(MozTfcLwAdtnRvsn mozTfcLwAdtnRvsn);

	/**
	 * @brief : updateMozTfcLwAdtnRvsn
	 * @details : 추가 개정 수정
	 * @author : KY.LEE
	 * @date : 2024.02.23
	 * @param : MozTfcLwAdtnRvsn
	 */
	public void updateMozTfcLwAdtnRvsn(MozTfcLwAdtnRvsn mozTfcLwAdtnRvsn);
}
