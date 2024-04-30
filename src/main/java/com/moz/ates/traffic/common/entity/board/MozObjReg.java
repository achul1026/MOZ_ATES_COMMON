package com.moz.ates.traffic.common.entity.board;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.finentc.MozFineNtcInfo;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozObjReg extends SearchOption{
	private String objIdx;						// 이의제기 idx
	private String tfcEnfId;					// 단속 고유 번호
	private String cateCd;						// 카테고리 코드
	private String wrtrNm;					// 문의자 이름
	private String wrtrPno;					// 문의자  연락처
	private String postTtl;						// 게시글 제목
	private String postCn;						// 게시글 내용
	private String postPw;						// 게시글 비밀번호
	private Date   crDt;						// 생성일
	private String oprtrId;						// 담당자 아이디
	private String ansEmail;					// 답변자 이메일
	private String ansStts;						// 답변 상태(N:미답변 Y:답변완료)
	private String ansContents;					// 답변 내용
	private Date ansCrDt;						// 답변 등록 일시
	private Date ansUpdDt;						// 답변 수정 일시
	
	
	//조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private MozAtchFile atchFile;
	private List<MozAtchFile> ansAtchFileList;
	private MozFineNtcInfo fineNtcInfo;
	
	// none column
	private String fineNtcId;		// 고지서 일련번호
}
