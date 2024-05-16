package com.moz.ates.traffic.common.entity.driver;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.moz.ates.traffic.common.component.enforcement.TrafficEnforcementIntegrationDto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MozVioInfo {
	private String vioId;						//위반자 고유 ID
	private String dvrLcenId;					//라이센스 고유 번호
	private String vioNm;						//위반자 이름
	private String vioBrth;						//위반자 생년월일
	private String vioAddr;						//위반자 거주지
	private String vioPno;						//위반자 연락처
	private String vioEmail;					//위반자 이메일
	private String dvrLcenTy;					//운전면허 타입
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	private String vioSignFilePath;				//위반자 서명 파일 경로
	private String vioSignFileOrgNm;			//위반자 서명 파일 원본 이름
	private Long   vioSignFileSize;				//위반자 서명 파일 크기
	
	private String tfcEnfId;					//단속번호
	private String tfcLawId;					//법률번호
	private Date	tfcEnfDt;					//단속날짜시간
	private String roadAddr;					//주소
	private String docType;						//문서타입
	private String docNid;						//문서번호
	private String vioSignYn;					//서명 여부

	public MozVioInfo(TrafficEnforcementIntegrationDto trafficEnforcementIntegrationDto){
		BeanUtils.copyProperties(trafficEnforcementIntegrationDto, this);
	}
}
