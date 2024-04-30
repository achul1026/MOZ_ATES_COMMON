package com.moz.ates.traffic.common.enums;

public interface PaymentLogStatus {
	
	public String PAYMENT_REQUEST = "PLS000";			//결제 요청
    public String SUCCESS = "PLS001";					//결제 성공
    public String FAILED = "PLS002";					//결제 실패
    public String CANCEL = "PLS003";					//결제 요청 취소
    public String REFUND_REQUEST = "PLS004";			//환불 요청
    public String REFUND_COMPLETE = "PLS005";			//환불 완료
    
}
