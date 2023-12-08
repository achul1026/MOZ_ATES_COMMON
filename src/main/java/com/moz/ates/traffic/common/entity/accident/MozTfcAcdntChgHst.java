package com.moz.ates.traffic.common.entity.accident;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcAcdntChgHst extends SearchOption{
	private String hstId;			// 히스토리 고유번호
	private String tfcAcdntId;		// 교통사고 정보 고유번호
	private String oprtrId;			// 담당자 고유번호
	private String acdntPrcCd;		// 교통사고 프로세스 코드
	private String cmnt;			// 코멘트
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;				// 생성일
	private String crtr;			// 생성자
	
	// 조인 테이블
	private MozCmCd cmCd;
}
