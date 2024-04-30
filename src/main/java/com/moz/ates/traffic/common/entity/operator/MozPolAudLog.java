package com.moz.ates.traffic.common.entity.operator;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozPolAudLog extends SearchOption {
	private String audLogId;		// idx
	private String audNm;			// 심사명
	private String url;				// URL
	private String polId;			// 담당자 아이디
	private String polNm;			// 담당자 이름
	private String paramtr;			// 파라미터
	private String crDt;			// 생성일
}
