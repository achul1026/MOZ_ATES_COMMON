package com.moz.ates.traffic.common.repository.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.MozCmCd;

@Mapper
public interface MozCmCdRepository {
	
	public List<MozCmCd> selectCdList(String cdGroupId);

}
