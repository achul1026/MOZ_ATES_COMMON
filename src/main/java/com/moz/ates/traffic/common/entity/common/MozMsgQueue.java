package com.moz.ates.traffic.common.entity.common;


import java.util.Date;

import lombok.Data;

@Data
public class MozMsgQueue {
	private Integer idx;				//SMS 발신 아이디
	private String msgType;				//주 연락처
	private String sender;				//보조 연락처
	private String receiver;			//수신자 명
	private String content;				//문자 내용
	private String status;				//상태
	private Date crDt;					//등록 일
	private Date sendDt;				//발신 일
	private Integer retry;				//재시도 횟수				
	private String tfcEnfId;			//단속 등록 아이디
}
