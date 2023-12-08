package com.moz.ates.traffic.common.support.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
	INVALID_PARAMETER(400, "pleace Check Parameter Value"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
	
	//회원가입
	REGEX_NOT_FOUND(1001, "Regex not found"),					//정규식 못찾았을때
	REQUIRED_FIELDS(1002,"Required field are missing"),			//필수 파라미터 누락
	VALIDATION_FAILED(1003,"validation failed"),				//유효성 검증 실패
	
	
	// 사용자
	NOT_FOUNT_USER_INFO(2001, "Not Fount User Information")
	
	;
	
	private int status;
	private String message;
	
}
