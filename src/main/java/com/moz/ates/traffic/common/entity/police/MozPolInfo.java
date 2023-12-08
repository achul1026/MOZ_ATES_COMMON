package com.moz.ates.traffic.common.entity.police;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozPolInfo extends SearchOption{
	private String polId; 						// 경찰 고유 번호
	private String polLcenId;					// 경찰 라이센스 번호
	private String polNm;						// 경찰 이름
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date polLcenDt;						// 경찰 라이센스 취득일
	private String polDeptNm;					// 소속
	private String clss;						// 계급
	private String jur;							// 관할지역
	private String brth;						// 생년월일
	private String addr;						// 주소
	private String devId;						// 단말기 아이디
	private String phone;						// 핸드폰
	private String email;						// 이메일
	private String appPermission;				// 사용권한
	private String appPolId;					// 단말기 고유번호
	private String appPolPw;					// 단말기 기밀번호
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;							// 생성일
	private String crtr;						// 생성자
}
