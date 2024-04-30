package com.moz.ates.traffic.common.entity.board;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

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
	private int viewCnt;				// 조회수
	private Date crDt;					// 생성일
	private Date updDt;					// 수정일
	private String cateCd;				// 카테고리 코드 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postStrDt;				// 게시 시작일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postEndDt;				// 게시 종료일
	private String useYn;				// 노출 여부
	private String popupYn;				// 팝업 여부
	private String imprtYn;				// 중요 여부
	
	// 조인 테이블
	private MozCmCd cmCd;
	private List<MozAtchFile> atchFileList;
	
	private String dateSearchType;		// 날짜 검색 타입
	
	private String oprtrNm;						//담당자 명
	private String oprtrDeptNm;					//담당자 소속명
	
	private String postStrDtString;	
	private String postEndDtString;		
}
