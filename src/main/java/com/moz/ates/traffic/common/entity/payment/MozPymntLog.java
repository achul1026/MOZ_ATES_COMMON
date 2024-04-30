package com.moz.ates.traffic.common.entity.payment;

import java.util.Date;

import lombok.Data;

@Data
public class MozPymntLog {
	private String pymntLogId;
	private String pymntId;
	private String payer;
	private String logType;
	private String logDetail;
	private String logStts;
	private String oprtrId;
	private Date   pymntLogDt;
	private String polId;
	private String logErrMsg;
	private Float reqPrice;
}