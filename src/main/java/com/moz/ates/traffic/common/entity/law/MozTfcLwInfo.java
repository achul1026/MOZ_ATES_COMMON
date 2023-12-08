package com.moz.ates.traffic.common.entity.law;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcLwInfo extends SearchOption{
	private String tfcLawId;					//법률아이디
	private String lawNm;						//법률명
	private String lawArticleNo;				//법령번호
	private String lawDesc;						//법률 설명
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						//생성일
	private String crtr;						//생성자
}
