package com.moz.ates.traffic.common.component.enforcement;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.moz.ates.traffic.common.entity.common.MozMsgQueue;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfHst;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFineInfo;
import com.moz.ates.traffic.common.entity.finentc.MozFineNtcInfo;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;
import com.moz.ates.traffic.common.enums.MsgQueueStatus;
import com.moz.ates.traffic.common.enums.MsgType;
import com.moz.ates.traffic.common.enums.NtcTypeCd;
import com.moz.ates.traffic.common.enums.RegisterType;
import com.moz.ates.traffic.common.enums.TrafficIdClassification;
import com.moz.ates.traffic.common.repository.common.MozMsgQueueRepository;
import com.moz.ates.traffic.common.repository.driver.MozVioInfoRepository;
import com.moz.ates.traffic.common.repository.enforcement.MozTfcEnfHstRepository;
import com.moz.ates.traffic.common.repository.enforcement.MozTfcEnfMasterRepository;
import com.moz.ates.traffic.common.repository.equipment.MozTfcEnfFileInfoRepository;
import com.moz.ates.traffic.common.repository.equipment.MozTfcEnfFineInfoRepository;
import com.moz.ates.traffic.common.repository.finentc.MozFineNtcInfoRepository;
import com.moz.ates.traffic.common.repository.law.MozTfcLwInfoRepository;
import com.moz.ates.traffic.common.repository.payment.MozFinePymntInfoRepository;
import com.moz.ates.traffic.common.repository.payment.MozPlPymntInfoRepository;
import com.moz.ates.traffic.common.repository.police.MozPolInfoRepository;
import com.moz.ates.traffic.common.support.exception.CommonException;
import com.moz.ates.traffic.common.support.exception.ErrorCode;
import com.moz.ates.traffic.common.util.MozatesCommonUtils;
import com.moz.ates.traffic.common.util.SmsSendContentUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class TrafficEnforcementComponent {

    final MozTfcLwInfoRepository tfcLwInfoRepository;

    final MozPlPymntInfoRepository plPymntInfoRepository;

    final MozVioInfoRepository vioInfoRepository;

    final MozTfcEnfMasterRepository tfcEnfMasterRepository;

    final MozTfcEnfHstRepository tfcEnfHstRepository;

    final MozFinePymntInfoRepository finePymntInfoRepository;
    
    final MozTfcEnfFineInfoRepository tfcEnfFineInfoRepository;
    
    final MozFineNtcInfoRepository fineNtcInfoRepository;
    
    final MozTfcEnfFileInfoRepository mozTfcEnfFileInfoRepository;
    
    final MozPolInfoRepository polInfoRepository;
    
    final MozMsgQueueRepository mozMsgQueueRepository;
    
	@Value("${mail.sender.inatro}")
	private String sender;

	@Value("${mail.url.inatro}")
	private String inatroUrl;
	
	@Value("${mail.url.portal}")
	private String portalUrl;
    
	@Value("${file.path.enforcement}")
	private String filePath;

    /**
     * Traffic Enforcement Register
     */
    @Transactional
    public MozTfcEnfMaster register(TrafficEnforcementIntegrationDto trafficEnforcementIntegrationDto, String polId){
        Date crDt = new Date();
        String code = TrafficEnforcementStatus.REG;
        String vioId = MozatesCommonUtils.getUuid();
        String date = DateFormatUtils.format(crDt, "yyyyMMdd");
        
        MozPolInfo dbPolInfo =  polInfoRepository.findOneMozPolInfo(polId);
        
        String enfIdStr = TrafficIdClassification.ENFORCEMENT + "-" + date + "-" + dbPolInfo.getPolLcenId();
        
        Long tfcEnfSeq = tfcEnfMasterRepository.countPolSeqByTfcEnfId(enfIdStr);
        
        String creator = dbPolInfo.getPolLcenId() + "-" + String.valueOf(tfcEnfSeq);
        
        String tfcEnfId = MozatesCommonUtils.getTfcEnfId(creator , crDt);
        float totalPrice = 0F;
        
        MultipartFile file = null;
        BufferedOutputStream bos = null;
		List<String> uploadPathList = new ArrayList<String>();
		
		MozTfcEnfMaster tfcEnfMaster = null;
		try {
			List<MozTfcEnfFineInfo> mozTfcEnfFineInfoList = new ArrayList<MozTfcEnfFineInfo>();
	        
	        if(!MozatesCommonUtils.isNull(trafficEnforcementIntegrationDto.getMozTfcEnfFineInfoJSONString())) {
	        	ObjectMapper objectMapper = new ObjectMapper();
	        	TypeFactory typeFactory = objectMapper.getTypeFactory();
	        	try {
	        		mozTfcEnfFineInfoList = objectMapper.readValue(trafficEnforcementIntegrationDto.getMozTfcEnfFineInfoJSONString(), typeFactory.constructCollectionType(List.class, MozTfcEnfFineInfo.class));
	        	} catch (JsonProcessingException e) {
	        		log.info("Casting Error");
	        	}
	        }
	        trafficEnforcementIntegrationDto.setVioId(vioId);
	        trafficEnforcementIntegrationDto.setTfcEnfId(tfcEnfId);
	        trafficEnforcementIntegrationDto.setPolId(polId);
	        MozVioInfo vioInfo = new MozVioInfo(trafficEnforcementIntegrationDto);
	        //위반자 서명
	        if(trafficEnforcementIntegrationDto.getVioSignature() != null) {
				file = trafficEnforcementIntegrationDto.getVioSignature();
				String name = MozatesCommonUtils.getUuid();
				String ext = FilenameUtils.getExtension(file.getOriginalFilename());
				String filename = name + "." + ext;
				String uploadFilePath = filePath + File.separator + date + File.separator + tfcEnfId;
				
				String uploadPath = uploadFilePath + File.separator + filename;
				
				uploadPathList.add(uploadPath);
				try {
					byte[] bytes = file.getBytes();
					File dir = new File(uploadFilePath);
					if (!dir.exists()) dir.mkdirs();
					File serverFile = new File(uploadPath);
					bos = new BufferedOutputStream(new FileOutputStream(serverFile));
					bos.write(bytes);
					
					vioInfo.setVioSignFilePath(uploadPath);
					vioInfo.setVioSignFileOrgNm(file.getOriginalFilename());
					vioInfo.setVioSignFileSize(file.getSize());
				} catch (IOException ignored) {
					log.info("File upload failed");
				} finally {
					try {
						if (bos != null) bos.close();
					} catch (IOException ignored) {
					}
				}
				vioInfo.setVioSignYn("Y");
			} else {
				vioInfo.setVioSignYn("N");
			}
	        vioInfo.setCrDt(crDt);
	        vioInfo.setCrtr(polId);
	        vioInfoRepository.insertVioInfo(vioInfo);

	        tfcEnfMaster = new MozTfcEnfMaster(trafficEnforcementIntegrationDto);
	        //위반자 서명
	        if(trafficEnforcementIntegrationDto.getPoliceSignature() != null) {
				file = trafficEnforcementIntegrationDto.getPoliceSignature();
				String name = MozatesCommonUtils.getUuid();
				String ext = FilenameUtils.getExtension(file.getOriginalFilename());
				String filename = name + "." + ext;
				String uploadFilePath = filePath + File.separator + date + File.separator + tfcEnfId;
				String uploadPath = uploadFilePath + File.separator + filename;
				
				uploadPathList.add(uploadPath);
				try {
					byte[] bytes = file.getBytes();
					File dir = new File(uploadFilePath);
					if (!dir.exists()) dir.mkdirs();
					File serverFile = new File(uploadPath);
					bos = new BufferedOutputStream(new FileOutputStream(serverFile));
					bos.write(bytes);
					
					tfcEnfMaster.setPolSignFilePath(uploadPath);
					tfcEnfMaster.setPolSignFileOrgNm(file.getOriginalFilename());
					tfcEnfMaster.setPolSignFileSize(file.getSize());
				} catch (IOException ignored) {
					log.info("File upload failed");
				} finally {
					try {
						if (bos != null) bos.close();
					} catch (IOException ignored) {
					}
				}
				vioInfo.setVioSignYn("Y");
			}
	        tfcEnfMaster.setCrtr(polId);
	        tfcEnfMaster.setLastTfcEnfProcCd(code);
	        tfcEnfMasterRepository.insertTfcEnfInfo(tfcEnfMaster);
	        
	        if(!mozTfcEnfFineInfoList.isEmpty()) {
	        	for(MozTfcEnfFineInfo mozTfcEnfFineInfo: mozTfcEnfFineInfoList) {
	        		totalPrice += mozTfcEnfFineInfo.getTfcEnfPrice();
	        		mozTfcEnfFineInfo.setTfcEnfId(tfcEnfId);
	        		mozTfcEnfFineInfo.setTfcEnfDt(crDt);
	        		tfcEnfFineInfoRepository.insertTfcEnfFineInfo(mozTfcEnfFineInfo);
	        	}
	        }

	        MozFineNtcInfo mozFineNtcInfo = new MozFineNtcInfo();
	        String fineNtcId = MozatesCommonUtils.getUuid();
	        mozFineNtcInfo.setFineNtcId(fineNtcId);
	        mozFineNtcInfo.setTfcEnfId(tfcEnfId);
	        mozFineNtcInfo.setNtcTy(NtcTypeCd.FIRST_NOTICE.getCode());
	        mozFineNtcInfo.setFirstFineNtcDt(crDt);
	        mozFineNtcInfo.setFirstFineNtcPrice(totalPrice);
	        mozFineNtcInfo.setFirstFineNtcDdln(MozatesCommonUtils.calculateAfterDays(crDt, 15, Calendar.DAY_OF_MONTH));
	        mozFineNtcInfo.setCrDt(crDt);
	        mozFineNtcInfo.setCrtr(polId);
	        fineNtcInfoRepository.insertFineNtcInfo(mozFineNtcInfo);
	        
	        //SMS 설정
			MozMsgQueue mozMsgQueue = new MozMsgQueue();
			mozMsgQueue.setSender(sender);
			mozMsgQueue.setMsgType(MsgType.SMS);
			mozMsgQueue.setStatus(MsgQueueStatus.WAITING);
			mozMsgQueue.setRetry(0);
			mozMsgQueue.setContent(SmsSendContentUtils.fineNoticeSmsContent(trafficEnforcementIntegrationDto.getVioNm(), portalUrl, NtcTypeCd.SECOND_NOTICE ,sender,tfcEnfId));
			mozMsgQueue.setReceiver(trafficEnforcementIntegrationDto.getVioPno());
			mozMsgQueue.setTfcEnfId(trafficEnforcementIntegrationDto.getTfcEnfId());
			mozMsgQueueRepository.saveMozMsgQueue(mozMsgQueue);
	        
	        MozFinePymntInfo finePymntInfo = new MozFinePymntInfo();
	        String pymntId = MozatesCommonUtils.getUuid();
	        finePymntInfo.setPymntId(pymntId);
	        finePymntInfo.setFineNtcId(fineNtcId);
	        finePymntInfo.setPayerNm(trafficEnforcementIntegrationDto.getVioNm());
	        finePymntInfo.setPlacePymntId(trafficEnforcementIntegrationDto.getPlacePymntId());
	        finePymntInfo.setTotalPrice(totalPrice);
	        finePymntInfo.setPymntPrice(0F);
	        finePymntInfo.setPymntStts("N");
	        finePymntInfo.setCrtr(polId);
	        finePymntInfo.setPolId(polId);
	        finePymntInfoRepository.insertFinePaymentInfo(finePymntInfo);
	        
	        MozTfcEnfHst tfcEnfHst = new MozTfcEnfHst();
	        String enfHstId = MozatesCommonUtils.getUuid();
	        tfcEnfHst.setHstId(enfHstId);
	        tfcEnfHst.setTfcEnfRegTy(RegisterType.POLICE_OFFICER.getCode());
	        tfcEnfHst.setTfcEnfId(tfcEnfId);
	        tfcEnfHst.setTfcEnfPrcCd(code);
	        tfcEnfHst.setCrtr(polId);
	        tfcEnfHstRepository.insertTfcEnfHstInfo(tfcEnfHst);
		} catch (CommonException e) {
			if(!uploadPathList.isEmpty()) {
				for(String uploadPath : uploadPathList) {
					//Error 발생시 사인 파일 제거
					File uploadFile = new File(uploadPath);
					if(uploadFile.exists()) {
						uploadFile.delete();
					}
				}
			}
		}
        return tfcEnfMaster;
    }

    @Transactional
    public void update(TrafficEnforcementIntegrationDto trafficEnforcementIntegrationDto){

    }

    public void delete(TrafficEnforcementIntegrationDto trafficEnforcementIntegrationDto){

    }


}
