package com.moz.ates.traffic.common.entity.accident;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozTfcAcdntPnrInfo {
	private String dvrId; 				//교통사고 운전자 고유아이디
	private String tfcAcdntId; 			//교통사고 정보 고유 번호
	private String dvrLcenId;			//라이센스 고유번호
	private String pnrNm;				//탑승자 이름
	private String pnrBrth;				//탑승자 생년월일
	private String pnrAddr;				//탑승자 거주지 주소
	private String pnrPno;				//탑승자 연락처
	private String pnrEmail;			//탑승자 이메일
	private String dvYn = "N";			//운전여부
	private String dvrLcenTy;			//운전면허 타입
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;					//생성일
	private String crtr;				//생성자
	}