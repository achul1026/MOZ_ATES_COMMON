package com.moz.ates.traffic.common.repository.monitoring;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MonitoringMapRepository {

	List<Map<String,Object>> findAllEquipmentByEquipmentTy(Map<String,String> param);

	List<Map<String,Object>> findAllFacilityByFacilityTy(Map<String,String> param);

    List<Map<String,Object>> findAllEnforcementByDate(Map<String,String> param);

    List<Map<String,Object>> findAllAccidentByDate(Map<String,String> param);

    List<Map<String,Object>> findAllAccidentByDateForAdminDashboard(Map<String,String> param);

    List<Map<String,Object>> findAccidentListRecentlyLimit10(Map<String,String> param);

}
