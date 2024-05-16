package com.moz.ates.traffic.common.entity.common;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ApiDriverInfoDTO {
	private String searchType;
	private String searchValue;
	private String apiToken;
	
	private String driverLicenseId;
	private String driverLicenseType;
	private String driverNm;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date driverBrth;
	private String driverAddr;
	private String driverPno;
	private String driverEmail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expirationDate;
	private String vehicleNo;
	private String vehicleType;
	
	
	
}
