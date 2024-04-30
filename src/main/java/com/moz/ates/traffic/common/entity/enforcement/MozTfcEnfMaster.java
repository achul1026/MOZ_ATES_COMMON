package com.moz.ates.traffic.common.entity.enforcement;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.moz.ates.traffic.common.component.enforcement.TrafficEnforcementIntegrationDto;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFileInfo;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFineInfo;
import com.moz.ates.traffic.common.entity.finentc.MozFineNtcInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwFineInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;
import com.moz.ates.traffic.common.entity.payment.MozPlPymntInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class MozTfcEnfMaster extends SearchOption{
	private String	tfcEnfId;						//단속정보 고유 번호
	private String	vioId;							//위반자 고유Id
	private String	tfcEnfEqpId;					//단속장비 고유번호
	private String	polId;							//경찰 고유번호
	private String	vioFileNo;						//위반정보 파일 번호
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date	tfcEnfDt;						//단속날짜시간
	private String	roadAddr;						//단속지역(도로)
	private String	roadLn;							//위반차로
	private String	vhRegNo;						//차량번호
	private String	vhTy;							//차량타입
	private Long	spdLmt;							//제한속도
	private Long	vioSpd;							//위반속도
	private Long	overSpd;						//초과속도
	private Float   alcLv;							//알코올수치
	private String	lastTfcEnfProcCd;				//단속정보 최종프로세스 코드
	private Float	lat;							//위도
	private Float	lng;							//경도
	private Date	crDt;							//생성일
	private String	crtr;							//생성자
	private String	tfcEnfDetail;					//상세내용
	private String	tfcEnfInfoimage;				//위반차량 사진
	private String	tfcEnfImagepath;				//위반차량사진경로
	private String	tfcEnfImgorgname;				//이미지 원본 이름
	private String  tfcEnfTtl;						//교통단속 제목
	private String 	delYn;							//삭제 여부
	
	private String mozTfcEnfFineInfoJSONString;
	
	//조인테이블
	private MozFinePymntInfo finePymntInfo;
	private List<MozTfcEnfFineInfo> tfcFineNtcInfoList;
	private List<MozTfcEnfFileInfo> tfcEnfFileInfoList;
	private List<MozTfcLwFineInfo> tfcLwFineInfoList;
	private MozPolInfo polInfo;
	private MozVioInfo vioInfo;
	private MozCmCd cmCd;
	private MozPlPymntInfo plPymntInfo;
	private MozTfcLwInfo tfcLwInfo;
	private List<MozTfcLwInfo> tfcLwInfoList;
	private List<MozTfcEnfFileInfo> fileList;
	private MozFineNtcInfo fineNtcInfo;
	
	// none column
	private String dvrLcenId;
	private String vioBrth;
	private String title;
	private int enfFineInfoCnt;
	private Float totalPrice;
	private Long idx;
	
	public MozTfcEnfMaster(TrafficEnforcementIntegrationDto trafficEnforcementIntegrationDto){
        // LocalDateTime을 Date로 변환
        LocalDateTime enfDtLocalDateTime = trafficEnforcementIntegrationDto.getTfcEnfDt()!=null?trafficEnforcementIntegrationDto.getTfcEnfDt(): LocalDateTime.now();
        Date enfDtDate = Date.from(enfDtLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // 속성 복사
        this.tfcEnfDt = enfDtDate;
		BeanUtils.copyProperties(trafficEnforcementIntegrationDto, this);
	}
}
