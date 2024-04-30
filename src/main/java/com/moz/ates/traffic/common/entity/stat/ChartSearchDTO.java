package com.moz.ates.traffic.common.entity.stat;

import lombok.Data;

@Data
public class ChartSearchDTO {
	private String type;
	private String timeType;
	private String cate;
	private String sDate;
	private String eDate;
}
