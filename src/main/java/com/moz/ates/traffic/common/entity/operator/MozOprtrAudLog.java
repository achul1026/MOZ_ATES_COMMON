package com.moz.ates.traffic.common.entity.operator;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozOprtrAudLog {
	private String audLogId;		// idx
	private String url;				// URL
	private String oprtrId;			// 담당자 아이디
	private String oprtrNm;			// 담당자 이름
	private String paramtr;			// 파라미터
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private String ctDt;			// 생성일
}
