package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcEnfEqpMaster extends SearchOption{
	private String tfcEnfEqpId;						//단속장비 고유 번호
	private String roadAddr;						//단속장비 설치위치 도로명
	private String lat;								//단속장비 위도
	private String lng;								//단속장비 경도
	private String eqpTy;							//단속장비 타입
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;							//생성일
	private String crOprtrId;						//생성자 아이디
	private String useYn = "N";						//사용여부
	private String mnfctr;							//제조업체
	private String sttsINfoGnrCy;					//상태정보 생성주기
	private String freightVhLmtSpd;					//화물차량 제한속도
	private String nrVhLmtSpd;						//일반차량 제한속도
	private String lastSyncTime;					//마지막 동기화 시간
	private String roadLnQy;						//차로수
	private String crOprtrDept;						//생성자 부서
	private String tfcEnfEqpInfo;					//단속장비 상세정보
	private String tfcEnfEqpImagepath;				//단속장비 이미지 주소
	private String tfcEnfEqpImagename;				//단속장비 이미지 이름
	private String tfcEnfEqpImageorgn;				//이미지파일원본 이름
}
