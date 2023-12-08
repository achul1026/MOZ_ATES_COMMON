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
public class MozFaq extends SearchOption{
    private String faqIdx;						// faq idx
    private String faqSeq;						// faq 순번
    private String cateTy;						// 카테고리 타입
    private String wrtrId;						// 작성자 아이디
    private String postTitle;					// 게시글 제목
    private String postContent;					// 게시글 내용
    private String ansCn;						// 답변 내용
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date   regDt;						// 생성일시
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date mdfDt;						// 수정일시
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private String delDt;						// 삭제일시
    private String delYn;						// 삭제여부
    private String viewCnt;						// 조회수
    
    // 조인 테이블
    private MozCmCd cmCd;
}
