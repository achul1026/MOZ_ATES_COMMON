package com.moz.ates.traffic.common.entity.board;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfEqpMaster;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozObjReg extends SearchOption{
	private String objIdx;						// 이의신청 idx
	private String tfcEnfId;					// 단속 고유 번호
	private String cateCd;						// 카테고리 코드
	private String wrtrEmail;					// 문의자 이메일
	private String postTtl;						// 게시글 제목
	private String postCn;						// 게시글 내용
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   crDt;						// 생성일
	private String oprtrId;						// 담당자 아이디
	private String ansEmail;					// 답변자 이메일
	private String ansStts;						// 답변 상태(N:미답변 Y:답변완료)
	private String ansContents;					// 답변 내용
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date ansCrDt;						// 답변 등록 일시
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date ansUpdDt;						// 답변 수정 일시
	
	
	//조인 테이블
	private MozCmCd cmCd;
}
