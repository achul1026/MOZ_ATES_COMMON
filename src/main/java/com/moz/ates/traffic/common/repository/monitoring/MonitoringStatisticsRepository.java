package com.moz.ates.traffic.common.repository.monitoring;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MonitoringStatisticsRepository {


    List<Map<String, Object>> findEnforcementCountByTypeFromToday();

    List<Map<String, Object>> findEnforcementCountByTypeFromYesterday();

    List<Map<String, Object>> findEnforcementCountByTypeAndTimeFromToday();

    List<Map<String, Object>> findEnforcementCountByTypeAndTimeFromMonthly();

    List<Map<String, Object>> findEnforcementCountByTypeAndTimeFromYearly();

    List<Map<String, Object>> findEnforcementListRecentlyLimit10();




    List<Map<String, Object>> findAccidentCountByTypeFromToday();

    List<Map<String, Object>> findAccidentCountByTypeFromYesterday();

    List<Map<String, Object>> findAccidentCountByTypeAndTimeFromToday();

    List<Map<String, Object>> findAccidentCountByTypeAndTimeFromYearly();

    List<Map<String, Object>> findAccidentCountByTypeAndTimeFromMonthly();


    List<Map<String, Object>> findAccidentListRecentlyLimit10();

    List<Map<String, Object>> findFineStatisticsByDate(Map<String,String> param);

    List<Map<String, Object>> findEnforcementCountMonthlyByEqpOrPol();


}
