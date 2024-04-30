package com.moz.ates.traffic.common.repository.law;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.law.MozTfcLwFineInfo;

@Mapper
public interface MozTfcLwFineInfoRepository {

	/**
	 * 범칙금 등록
	 * @param mozTfcLwFineInfo
	 */
	public void saveMozTfcLwFineInfo(MozTfcLwFineInfo mozTfcLwFineInfo);

	/**
	 * 범칙금 목록 조회
	 * @param tfcLawId
	 * @return List<MozTfcLwFineInfo>
	 */
	public List<MozTfcLwFineInfo> findMozTfcLwFineInfoByTfcLawId(String tfcLawId);

	/**
	 * 범칙금 삭제
	 * @param tfcLawFineId
	 */
	public void deleteMozTfcLwFineInfo(String tfcLawFineId);

	/**
	 * 범칙금 수정
	 * @param mozTfcLwFineInfo
	 */
	public void updateMozTfcLwFineInfo(MozTfcLwFineInfo mozTfcLwFineInfo);
	
}
