package com.moz.ates.traffic.common.entity.operator;

import lombok.Data;

 /**
  * @FileName : MozWebOprtrDTO.java
  * @Project : moz_ates_common
  * @Date : 2024. 1. 25.
  * @Author : IK.MOON
  * @Brief : 로그인 사용자 session 저장
  */
@Data
public class MozWebOprtrDTO {
	private String oprtrId;						//담당자 고유번호
	private String oprtrNm;						//담당자명
	private String oprtrAccountId;				//담당자 아이디
	private String oprtrAccountPw;				//담당자 비밀번호
	private String oprtrPermission;				//담당자 권한
	private String authId;						//권한 아이디
	private String oprtrStts;					// 담당자 계정 상태
	private String tmpPwIssuedYn;		// 임시 비밀번호 발급 여부
}
