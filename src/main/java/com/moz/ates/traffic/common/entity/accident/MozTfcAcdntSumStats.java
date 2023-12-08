package com.moz.ates.traffic.common.entity.accident;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcAcdntSumStats {
		private String idx;				//인덱스
		private Date dt;				//날짜
		private String sumCnt;			//누적수
}
