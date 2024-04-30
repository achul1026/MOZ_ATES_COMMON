package com.moz.ates.traffic.common.entity.operator;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozWebOprtr extends SearchOption{
	private String oprtrId;						//담당자 고유번호
	private String oprtrDeptId;					//담당자 소속 고유번호
	private String oprtrNm;						//담당자 명
	private String oprtrAccountId;				//담당자 아이디
	private String oprtrAccountPw;				//담당자 비밀번호
	private String oprtrPno;					//담당자 연락처
	private String oprtrEmail;					//담당자 이메일
	private Date   oprtrRegDt;					//담당자 가입날짜
	private String oprtrPermission;				//담당자 권한
	private String oprtrPermissionName;			//담당자 권한명
	private String oprtrPermissionGroupCode;	//담당자 권한 그룹 코드
	private String oprtrDeptNm;					//담당자 소속명
	private String oprtrStts;					//담당자 계정 상태
	private Date   lastLoginDt;					//최근 로그인 날짜
	private int    loginFailCnt = 0;			//로그인 실패 횟수
	private String connectIp;					//접속가능 아이피
	private Date   crDt;						//생성일
	private String tmpPwIssuedYn;		// 임시 비밀번호 발급 여부
	private String apvr;						//승인자
	private String authId;						//권한
	
	// None column
	private String crtr;
	private String authNm;						//권한 이름
	private String[] oprtrPermissionCdArr;
	private String loginUserPermission;			//로그인한 유저 권한 상태
//    private Collection<? extends GrantedAuthority> authorities;

	private String oprtrAccountPwChk;				//비밀번호 확인

	public MozWebOprtr(String username){
        this.oprtrAccountId = username;
    }
}
