package com.moz.ates.traffic.common.entity.operator;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozWebOprtr extends SearchOption{
	private String oprtrId;						//담당자 고유번호
	private String oprtrDeptId;					//담당자 소속 고유번호
	private String oprtrNm;						//담당자명
	private String oprtrAccountId;				//담당자 아이디
	private String oprtrAccountPw;				//담당자 비밀번호
	private String oprtrPno;					//담당자 연락처
	private String oprtrEmail;					//담당자 이메일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   oprtrRegDt;					//담당자 가입날짜
	private String oprtrPermission;				//담당자 권한
	private String oprtrDeptNm;					//담당자 소속명
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   lastLoginDt;					//최근로그인날짜
	private String loginFailCnt = "0";			//로그인 실패 횟수
	private String connectIp;					//접속가능 아이피
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	private String authId;						//권한
	
	
//    private Collection<? extends GrantedAuthority> authorities;

    public MozWebOprtr(String username){
        this.oprtrAccountId = username;
    }
}
