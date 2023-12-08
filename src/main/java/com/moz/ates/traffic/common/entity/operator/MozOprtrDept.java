package com.moz.ates.traffic.common.entity.operator;

import lombok.Data;

@Data
public class MozOprtrDept{
	private String oprtrDeptId; 		// 담당자 소속 고유 번호
	private String oprtrDeptNm;			// 소속명
	private String oprtrDeptAddr;		// 주소
	private String oprtrDeptTel;		// 연락처
	private String useYn;				// 사용여부
}
