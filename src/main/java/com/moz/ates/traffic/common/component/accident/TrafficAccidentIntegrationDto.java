package com.moz.ates.traffic.common.component.accident;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TrafficAccidentIntegrationDto {
	private Float lng;
	private Float lat;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime acdntDt;
	private String mozTfcAcdntTrgtInfoJsonStr;
	private String acdntTyCd;
	private String roadAddr;
	private String acdntChildYn;
	private String acdntTyDtls;
}
