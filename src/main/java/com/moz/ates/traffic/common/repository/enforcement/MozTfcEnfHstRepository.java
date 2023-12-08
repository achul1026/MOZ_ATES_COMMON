package com.moz.ates.traffic.common.repository.enforcement;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfHst;

@Mapper
public interface MozTfcEnfHstRepository {
	public List<MozTfcEnfHst> findAllLogListsByTfcEnfHst(MozTfcEnfHst tfcEnfHst);
	
	public int countLogListsByTfcEnfHst(MozTfcEnfHst tfcEnfHst);
	
	public void insertTfcEnfHstInfo(MozTfcEnfHst tfcEnfHst);
}
