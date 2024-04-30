package com.moz.ates.traffic.common.entity.board;


import java.util.Date;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozFaq extends SearchOption{
    private String faqIdx;						// faq idx
    private int faqSeq;						// faq 순번
    private String cateTy;						// 카테고리 타입
    private String wrtrId;						// 작성자 아이디
    private String postTitle;					// 게시글 제목
    private String postContent;					// 답변 내용
	private Date   regDt;						// 생성일시
    private Date mdfDt;						// 수정일시
    private String delDt;						// 삭제일시
    private String delYn;						// 삭제여부
    private int viewCnt;						// 조회수
    private String faqKywrd;						// 관련 키워드
    
    // 조인 테이블
    private MozCmCd cmCd;
    private MozWebOprtr webOprtr;
}
