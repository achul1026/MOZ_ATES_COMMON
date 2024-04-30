package com.moz.ates.traffic.common.component.accident;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntChgHst;
import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntMaster;
import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntTrgtInfo;
import com.moz.ates.traffic.common.entity.accident.MozTfcAcdntTrgtPnrInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;
import com.moz.ates.traffic.common.enums.AccidentTargetCd;
import com.moz.ates.traffic.common.enums.RegisterType;
import com.moz.ates.traffic.common.enums.TrafficIdClassification;
import com.moz.ates.traffic.common.repository.accident.MozTfcAcdntChgHstRepository;
import com.moz.ates.traffic.common.repository.accident.MozTfcAcdntMasterRepository;
import com.moz.ates.traffic.common.repository.accident.MozTfcAcdntTrgtInfoRepository;
import com.moz.ates.traffic.common.repository.accident.MozTfcAcdntTrgtPnrInfoRepository;
import com.moz.ates.traffic.common.repository.driver.MozVioInfoRepository;
import com.moz.ates.traffic.common.repository.law.MozTfcLwInfoRepository;
import com.moz.ates.traffic.common.repository.payment.MozPlPymntInfoRepository;
import com.moz.ates.traffic.common.repository.police.MozPolInfoRepository;
import com.moz.ates.traffic.common.support.exception.CommonException;
import com.moz.ates.traffic.common.support.exception.ErrorCode;
import com.moz.ates.traffic.common.util.MozatesCommonUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class TrafficAccidentComponent {
	
    final MozTfcLwInfoRepository tfcLwInfoRepository;

	final MozPlPymntInfoRepository plPymntInfoRepository;

	final MozVioInfoRepository vioInfoRepository;

	final MozTfcAcdntMasterRepository tfcAcdntMasterRepository;

	final MozTfcAcdntTrgtInfoRepository tfcAcdntTrgtInfoRepository;

	final MozTfcAcdntTrgtPnrInfoRepository tfcAcdntTrgtPnrInfoRepository;
	
	final MozTfcAcdntChgHstRepository tfcAcdntChgHstRepository;
	
	final MozPolInfoRepository polInfoRepository;
	
	
	
    /**
     * Traffic Accident Register
     * @throws JsonProcessingException 
     * @throws JsonMappingException 
     */
    @Transactional
    public MozTfcAcdntMaster register(TrafficAccidentIntegrationDto trafficAccidentIntegrationDto, String polId) {
    	MozTfcAcdntMaster tfcAcdntMaster = new MozTfcAcdntMaster(trafficAccidentIntegrationDto);

    	Date crDt = new Date();
        String code = TrafficAccidentStatus.REG;
        String date = DateFormatUtils.format(crDt, "yyyyMMdd");

        //AcdntId조회
        MozPolInfo dbPolInfo =  polInfoRepository.findOneMozPolInfo(polId);
        String acdntIdStr = TrafficIdClassification.ACCIDENT + "-" + date + "-" + dbPolInfo.getPolLcenId();
        Long tfcAcdntSeq = tfcAcdntMasterRepository.countPolSeqByTfcAcdntId(acdntIdStr);
        String creator = dbPolInfo.getPolLcenId() + "-" + String.valueOf(tfcAcdntSeq);
 
        String tfcAcdntId = MozatesCommonUtils.getAcdntId(creator, crDt);
        tfcAcdntMaster.setTfcAcdntId(tfcAcdntId);
        tfcAcdntMaster.setCrDt(crDt);
        tfcAcdntMaster.setLastAcdntPrcCd(code);
        tfcAcdntMaster.setPolId(polId);
        
        ObjectMapper mapper = new ObjectMapper();
        
        List<MozTfcAcdntTrgtInfo> mozTfcAcdntTrgtInfoList = null;
        
		try {
			mozTfcAcdntTrgtInfoList = mapper.readValue(trafficAccidentIntegrationDto.getMozTfcAcdntTrgtInfoJsonStr(), new TypeReference<List<MozTfcAcdntTrgtInfo>>(){});
		} catch (JsonProcessingException e) {
			log.debug("AccidentTarget ParseException");
			throw new CommonException(ErrorCode.DATA_PARSE_FAIL);
		}
        
        tfcAcdntMasterRepository.saveMozTfcAcdntMaster(tfcAcdntMaster);

        if(mozTfcAcdntTrgtInfoList != null && !mozTfcAcdntTrgtInfoList.isEmpty()) {
        	for(MozTfcAcdntTrgtInfo mozTfcAcdntTrgtInfo : mozTfcAcdntTrgtInfoList) {
        		String acdntTrgtId = MozatesCommonUtils.getUuid();
        		String tfcAcdntTrgtPnrInfoStr = mozTfcAcdntTrgtInfo.getTfcAcdntTrgtPnrInfoStr();
        		
        		mozTfcAcdntTrgtInfo.setTfcAcdntId(tfcAcdntId);
        		mozTfcAcdntTrgtInfo.setAcdntTrgtId(acdntTrgtId);
        		mozTfcAcdntTrgtInfo.setCrDt(crDt);
        		
        		if(AccidentTargetCd.PERSON.getCode().equals(mozTfcAcdntTrgtInfo.getAcdntTrgtCd())) {
        			mozTfcAcdntTrgtInfo.setVhRegNo(null);
        			mozTfcAcdntTrgtInfo.setVhTy(null);
        			mozTfcAcdntTrgtInfo.setDvYn("N");
        		} 
        			
        		tfcAcdntTrgtInfoRepository.saveMozTfcAcdntTrgtInfo(mozTfcAcdntTrgtInfo);

        		if(!MozatesCommonUtils.isNull(tfcAcdntTrgtPnrInfoStr)) {
					List<MozTfcAcdntTrgtPnrInfo> tfcAcdntTrgtPnrInfoList = null;
					try {
						tfcAcdntTrgtPnrInfoList = mapper.readValue(tfcAcdntTrgtPnrInfoStr, new TypeReference<List<MozTfcAcdntTrgtPnrInfo>>(){});
					} catch (JsonProcessingException e) {
						log.debug("AccidentTarget Passenger ParseException");
						throw new CommonException(ErrorCode.DATA_PARSE_FAIL);
						}
					if(tfcAcdntTrgtPnrInfoList != null && !tfcAcdntTrgtPnrInfoList.isEmpty()) {
						for(MozTfcAcdntTrgtPnrInfo mozTfcAcdntTrgtPnrInfo : tfcAcdntTrgtPnrInfoList) {
							String acdntTrgtPnrId = MozatesCommonUtils.getUuid();
							mozTfcAcdntTrgtPnrInfo.setAcdntTrgtId(acdntTrgtId);
							mozTfcAcdntTrgtPnrInfo.setTfcAcdntId(tfcAcdntId);
							mozTfcAcdntTrgtPnrInfo.setAcdntTrgtPnrId(acdntTrgtPnrId);
							
							tfcAcdntTrgtPnrInfoRepository.saveMozTfcAcdntTrgtPnrInfo(mozTfcAcdntTrgtPnrInfo);
						}
					}
				}
        	}
        } 
        //로그 테이블 insert
        MozTfcAcdntChgHst mozTfcAcdntChgHst = new MozTfcAcdntChgHst();
        String hstId = MozatesCommonUtils.getUuid();
        mozTfcAcdntChgHst.setHstId(hstId);
        mozTfcAcdntChgHst.setTfcAcdntId(tfcAcdntId);
        mozTfcAcdntChgHst.setAcdntPrcCd(code);
        mozTfcAcdntChgHst.setAcdntRegTy(RegisterType.POLICE_OFFICER.getCode());
        mozTfcAcdntChgHst.setCrtr(polId);
        
        tfcAcdntChgHstRepository.saveMozTfcAcdntChgHst(mozTfcAcdntChgHst);
       
        return tfcAcdntMaster;
    }

    @Transactional
    public void update(TrafficAccidentIntegrationDto trafficAccidentIntegrationDto){

    }

    public void delete(TrafficAccidentIntegrationDto trafficAccidentIntegrationDto){

    }


}
