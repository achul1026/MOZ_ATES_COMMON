package com.moz.ates.traffic.common.entity.driver;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozVioInfo {
	private String vioId;						//위반자 고유 ID
	private String dvrLcenId;					//라이센스 고유 번호
	private String vioNm;						//위반자 이름
	private String vioBrth;						//위반자 생년월일
	private String vioAddr;						//위반자 거주지
	private String vioPno;						//위반자 연락처
	private String vioEmail;					//위반자 이메일
	private String dvrLcenTy;					//운전면허 타입
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						//생성일
	private String crtr;						//생성자
}
