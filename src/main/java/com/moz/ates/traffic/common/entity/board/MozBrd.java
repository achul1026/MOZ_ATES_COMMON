package com.moz.ates.traffic.common.entity.board;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozBrd extends SearchOption{
	private String boardIdx;			// 게시판 idx
	private String boardCdId;			// 게시판 코드 아이디
	private String oprtrId;				// 담당자 아이디
	private String wrtrNm;				// 작성자 이름
	private String boardTitle;			// 게시글 제목
	private String boardContents;		// 게시글 내용
	private String viewCnt;				// 조회수
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;					// 생성일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date updDt;					// 수정일
	private String cateCd;				// 카테고리 코드 
	private Date postStrDt;				// 게시 시작일
	private Date PostEndDt;				// 게시 종료일
	
	// 조인 테이블
	private MozCmCd cmCd;
}
