package com.moz.ates.traffic.common.component.enforcement;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class TrafficEnforcementIntegrationDto {
	private MultipartFile vioSignature;			//위반자 서명
	private MultipartFile policeSignature;			//위반자 서명
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime tfcEnfDt; 			//단속 날짜
	private String vioId;						//위반자 고유 ID
    private String dvrLcenId;					//라이센스 고유 번호
    private String vioNm;						//위반자 이름
    private String vioBrth;						//위반자 생년월일
    private String vioAddr;						//위반자 거주지
    private String vioPno;						//위반자 연락처
    private String vioEmail;					//위반자 이메일
    private String dvrLcenTy;					//운전면허 타입
    private String docType;						//문서 타입
    private String docNid;						//문서 번호

    private String	tfcEnfId;						//단속정보 고유 번호
    private String	tfcLawId;						//법률아이디
    private String	tfcEnfEqpId;					//단속장비 고유번호
    private String	polId;							//경찰 고유번호
    private String	tfcAcdntId;						//교통사고 정보 고유 번호
    private String	vioFileNo;						//위반정보 파일 번호
    private String  vioSignYn;						//서명 Y/N

    private String	roadAddr;						//단속지역(도로)
    private String	roadLn;							//위반차로
    private String	vhRegNo;						//차량번호
    private String	vhTy;							//차량타입
    private Long	spdLmt;							//제한속도
    private Long 	vioSpd;							//위반속도
    private Long	overSpd;						//초과속도
    private String	lastTfcEnfProcCd;				//단속정보 최종프로세스 코드
    private Float	lat;							//위도
    private Float	lng;							//경도

    private String	tfcEnfDetail;					//상세내용
    private String	tfcEnfInfoimage;				//위반차량 사진
    private String	tfcEnfImagepath;				//위반차량사진경로
    private String	tfcEnfImgorgname;				//이미지 원본 이름

    private String placePymntId;
    private String pymntOprtr;
    private Long totalPrice;
    
    private String mozTfcEnfFineInfoJSONString;
}
