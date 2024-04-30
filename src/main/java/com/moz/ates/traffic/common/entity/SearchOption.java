package com.moz.ates.traffic.common.entity;

import lombok.Data;

@Data
public class SearchOption {
	private int page = 1;

	private int start = 0;
	private int length = 10;

	private String sDate;
	private String eDate;
	private String searchType;
	private String searchTxt;
	
	private String otherType;
	
	private Long yearFilter;
	
	private int rnum;
	
	private String chartYn = "N";
}
