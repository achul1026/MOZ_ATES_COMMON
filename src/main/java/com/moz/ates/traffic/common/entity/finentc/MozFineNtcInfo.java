package com.moz.ates.traffic.common.entity.finentc;

import java.util.Date;

import lombok.Data;

@Data
public class MozFineNtcInfo {
	private String fineNtcId;
	private String tfcEnfId;
	private String vioId;
	private String tfcLawId;
	private String oprtrId;
	private Date fineNtcDt;
	private String fineNtcPrice;
	private String fineNtcDdln;
	private String ntcTy;
	private String paymntYn;
	private Date crDt;
	private String crtr;
}
