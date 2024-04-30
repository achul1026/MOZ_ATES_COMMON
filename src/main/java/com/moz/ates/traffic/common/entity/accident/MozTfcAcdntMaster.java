package com.moz.ates.traffic.common.entity.accident;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.moz.ates.traffic.common.component.accident.TrafficAccidentIntegrationDto;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class MozTfcAcdntMaster extends SearchOption{
	private String tfcAcdntId;					// 교통사고 정보 고유번호
	private String acdntTrgtId;					// 교통사고 타겟 아이디
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date acdntDt;						// 사고날짜
	private String lastAcdntPrcCd;				// 교통사고 최종 프로세스 코드
	private Float lat;							// 위도
	private Float lng;							// 경도
	private String roadAddr;					// 사고지역(도로)
	private Date crDt;							// 생성일
	private String crtr;						// 생성자
	private String polId;						// 담당 경찰 아이디
	private String acdntTyCd;					// 사고 유형
	private String acdntChildYn;				// 어린이 사고 유무
	private String acdntTyDtls;					// 사고 유형 상세
	private String acdntReport;					// 사고 조서
	
	//리스트 용 
	private String trgtNm;						// 사고자 이름
	private String trgtCount;						// 사고자 카운트
	
	private String mozTfcAcdntTrgtInfoJsonStr;
	
	// 조인 테이블
	private MozVioInfo vioInfo;
	private MozCmCd cmCd;
	private MozPolInfo polInfo;
	private List<MozTfcAcdntTrgtInfo> tfcAcdntTrgtInfo;
	private List<MozTfcAcdntTrgtPnrInfo> tfcAcdntPnrInfo;
	private List<MozTfcAcdntFileInfo> tfcAcdntFileInfo;
	
	public MozTfcAcdntMaster(TrafficAccidentIntegrationDto trafficAccidentIntegrationDto){
        // LocalDateTime을 Date로 변환
        LocalDateTime acdntDtLocalDateTime = trafficAccidentIntegrationDto.getAcdntDt();
        Date acdntDtDate = Date.from(acdntDtLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // 속성 복사
        this.acdntDt = acdntDtDate;
        
		BeanUtils.copyProperties(trafficAccidentIntegrationDto, this);
	}
}
