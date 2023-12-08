package com.moz.ates.traffic.common.repository.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.common.AccidentDomain;
import com.moz.ates.traffic.common.entity.common.EnforcementDomain;

@Mapper
public interface GisRepository {
	public EnforcementDomain findOneEnforcementDomainBytfcEnfId(String tfcEnfId);
	
	public AccidentDomain selectAccidentList(String tfcAcdntId); 

	public List<AccidentDomain> selectAccidentListForMonitoring();
	
	public List<EnforcementDomain> selectEnforcementListForMonitoring();
}
