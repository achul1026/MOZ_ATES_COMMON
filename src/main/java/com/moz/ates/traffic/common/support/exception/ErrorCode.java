package com.moz.ates.traffic.common.support.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
	INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
	
	//회원가입
	REGEX_NOT_FOUND(1001, "Regex not found"),					//정규식 못찾았을때
	REQUIRED_FIELDS(1002,"Required field are missing"),			//필수 파라미터 누락
	VALIDATION_FAILED(1003,"Validation failed"),				//유효성 검증 실패
	DUPLICATE_ACCOUNTS(1004,"Duplicate accounts"),				//중복된 계정
	
	
	// 사용자
	NOT_FOUNT_USER_INFO(2001, "Not Fount User Information"),
	
	//Common 8000~9000
	INVALID_PARAMETER(8001, "Pleace Check Parameter Value"),
	ENTITY_DATA_NULL(8002, "The searched data does not exist."),		// 조회한 데이터가 존재하지 않습니다
	ENTITY_SAVE_FAIL(8003, "Registration failed."),		// 등록에 실패했습니다
	SESSION_NOT_FOUND(8004,"Failed to find session information."),		// 세션 정보를 찾지 못했습니다
	ENTITY_UPDATE_FAIL(8003, "Modification failed."),		// 수정에 실패했습니다.
	FILE_UPLOAD_FAIL(8005, "File upload failed."),		// 파일 업로드에 실패하였습니다
	DATE_PARSE_ERROR(8006, "Date conversion failed."),  // 날짜 변환에 실패했습니다
	FILE_NOT_FOUND(8007, "File does not exist."), 		// 파일이 존재하지 않습니다
	FILE_DOWNLOAD_FAIL(8008,"File download failed."),	// 파일 다운로드에 실패 하였습니다.
	FILE_DELETE_FAIL(8009,"File delete failed."),		// 파일 삭제에 실패 하였습니다.
	
	PERMISSION_DENIED(8010, "Permission denied."), 		// 허가가 거부 되었습니다.
	FILE_EXTENTION_MISMATCH(8011, "File extention is not match"), // 파일 확장자가 일치하지 않습니다.
	DATA_INSERT_FAIL(8012, "Data insert failed."),		//데이터 삽입 실패
	DATA_PARSE_FAIL(8013, "Data Parse failed."),		//데이터 파싱 실패
	DATA_DUPLICATE(8014,"Duplicate data exists."),		//중복된 데이터가 존재합니다.
	
	DEFAULT(9999,"Unknown error")		//Default
	;
	
	private int status;
	private String message;
	
}
