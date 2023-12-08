package com.moz.ates.traffic.common.entity.enforcement;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcEnfSumStats {
	private String idx;				//인덱스번호
	private Date	dt;				//날짜
	private String tfcLwId;			//법률아이디
	private String sumCnt;			//누적수
	private String totFine;			//벌금 누적액
	
}
