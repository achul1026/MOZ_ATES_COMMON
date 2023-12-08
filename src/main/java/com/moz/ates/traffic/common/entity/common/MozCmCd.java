package com.moz.ates.traffic.common.entity.common;


import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozCmCd {

    private String cdId;		// 공통코드아이디
    private String cdGroupId;	// 공통코드부모아이디
    private String cdNm;		// 공통코드명
    private String cdDesc;		// 공통코드설명
    private String userYn;		// 사용여부
    private String crtr;		// 생성자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date crDt;		// 생성일시

}
