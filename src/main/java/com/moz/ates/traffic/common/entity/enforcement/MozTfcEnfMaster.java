package com.moz.ates.traffic.common.entity.enforcement;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcEnfMaster extends SearchOption{
	private String	tfcEnfId;						//단속정보 고유 번호
	private String	vioId;							//위반자 고유Id
	private String	tfcLawId;						//법률아이디
	private String	tfcEnfEqpId;					//단속장비 고유번호
	private String	polId;							//경찰 고유번호
	private String	tfcAcdntId;						//교통사고 정보 고유 번호
	private String	vioFileNo;						//위반정보 파일 번호
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date	tfcEnfDt;						//단속날짜시간
	private String	roadAddr;						//단속지역(도로)
	private String	roadLn;							//위반차로
	private String	vhRegNo;						//차량번호
	private String	vhTy;							//차량타입
	private String	spdLmt;							//제한속도
	private String	vioSpd;							//위반속도
	private String	overSpd;						//초과속도
	private String	lastTfcEnfProcCd;				//단속정보 최종프로세스 코드
	private String	lat;							//위도
	private String	lng;							//경도
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date	crDt;							//생성일
	private String	crtr;							//생성자
	private String	tfcEnfDetail;					//상세내용
	private String	tfcEnfInfoimage;				//위반차량 사진
	private String	tfcEnfImagepath;				//위반차량사진경로
	private String	tfcEnfImgorgname;				//이미지 원본 이름
	
	//조인테이블
	private MozFinePymntInfo finePymntInfo;
	private MozTfcLwInfo tfcLwInfo;
	private MozVioInfo vioInfo;
	
}
