package com.moz.ates.traffic.common.entity.payment;

import lombok.Data;

@Data
public class MozPymntStats {
	private String idx;			// idx
	private String dt;			// 날짜
	private String tfcLwId;		// 법률 아이디
	private String pymntAmt;	// 납부된 금액
}
