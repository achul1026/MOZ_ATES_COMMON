package com.moz.ates.traffic.common.entity.board;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcSftyEdctn extends SearchOption{
	private String tfcSftyEdctnId;		// 교통안전교육 아이디
	private String postTtl;				// 게시글 제목
	private String postCn;				// 게시글 내용
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postStrDe;				// 게시 시작일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postEndDe;				// 게시 종료일
	private String expYn;				// 노출여부
	private int viewCnt;				// 조회수
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date crDt;					// 생성일시
	private String crtr;				// 생성자
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updDt;					// 수정일시
	private String updr;				// 수정자
	
	// 조인 테이블
	private MozWebOprtr webOprtr;
	private MozAtchFile atchFile;

	private String postStrDeString;		
	private String postEndDeString;		
}
