package com.moz.ates.traffic.common.entity.law;

import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @brief 법률 추가 개정 테이블 
 * @author KY.LEE
 * @date 2024. 2. 23.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcLwAdtnRvsn extends SearchOption{
	private String tfcLawId;					//법률아이디
	private String tfcLawAdtnRvsnId;			//법률 추가 개정 아이디
	private String adtnRvsnDesc;				//법률 추가 내용
	private Date crDt;							//생성일자
	private Date adtnRvsnDt;					//개정일자
}
