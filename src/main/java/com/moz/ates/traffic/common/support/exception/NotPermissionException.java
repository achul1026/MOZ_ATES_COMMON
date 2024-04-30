package com.moz.ates.traffic.common.support.exception;

import lombok.Getter;

@Getter
public class NotPermissionException extends RuntimeException{
	private ErrorCode errorCode;
	private String message;

	public NotPermissionException() {
		super();
		this.errorCode = ErrorCode.NOT_FOUNT_USER_INFO;
		this.message = ErrorCode.NOT_FOUNT_USER_INFO.getMessage();
	}
	
	public NotPermissionException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
		this.message = errorCode.getMessage();
	}

	public NotPermissionException(ErrorCode errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
}
