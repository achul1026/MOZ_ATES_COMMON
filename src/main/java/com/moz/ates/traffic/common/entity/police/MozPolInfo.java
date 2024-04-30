package com.moz.ates.traffic.common.entity.police;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozPolInfo extends SearchOption{
	private String polId; 						// 경찰 고유 번호
	private String polLcenId;					// 경찰 라이센스 번호
	private String polNm;						// 경찰 이름
	private Date polLcenDt;						// 경찰 라이센스 취득일
	private String polDeptNm;					// 소속
	private String polStts;						// 경찰 계정 상태
	private String classes;						// 계급
	private String jur;							// 관할지역
	private Date brth;						    // 생년월일
	private String addr;						// 주소
	private String devId;						// 단말기 아이디
	private String phone;						// 핸드폰
	private String email;						// 이메일
	private String appPermission;				// 사용권한
	private String appPolId;					// 단말기 고유번호
	private String appPolPw;					// 단말기 기밀번호
	private Date crDt;							// 생성일
	private String crtr;						// 생성자
	private Date lastUpdDt;						// 최근 수정일
	
	//none column
	private String loginUserPermission;			// 로그인한 유저 권한 상태
	
	private String newPw;
	private String newPwChk;
}
