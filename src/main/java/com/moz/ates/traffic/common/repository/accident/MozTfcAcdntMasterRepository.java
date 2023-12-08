package com.moz.ates.traffic.common.repository.accident;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntMaster;
import com.moz.ates.traffic.common.entity.common.AccidentDomain;

@Mapper
public interface MozTfcAcdntMasterRepository {
	public List<MozTfcAcdntMaster> selectAcdntList(MozTfcAcdntMaster tfcAcdntMaster);
	
	public AccidentDomain selectAccidentInfo(String tfcAcdntid);
	// 수정 예정
	public int selectAcdntDupliCnt(MozTfcAcdntMaster tfcAcdntMaster);
	
	public int countTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);
	
	public List<MozTfcAcdntMaster> selectMngList(MozTfcAcdntMaster tfcAcdntMaster);
	
	public int selectMngListCnt(MozTfcAcdntMaster tfcAcdntMaster);
	
	public MozTfcAcdntMaster selectMngDetail(String tfcAcdntId);
	// 수정 예정
	public void insertAcdnt(MozTfcAcdntMaster tfcAcdntMaster);

	public void saveMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);
	// 수정 예정
	public void upateAcdnt(MozTfcAcdntMaster tfcAcdntMaster);

	public void updateMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);

	public List<MozTfcAcdntMaster> findAllMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);

	public int countMozTfcAcdntMaster(MozTfcAcdntMaster tfcAcdntMaster);

}
