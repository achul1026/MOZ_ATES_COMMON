package com.moz.ates.traffic.common.entity.board;



import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozInqry extends SearchOption{
	private String inqryId;				// 문의 아이디
	private String cateCd;				// 카테고리 코드
	private String postTtl;				// 게시글 제목
	private String postCn;				// 게시글 내용
	private String oprtrId;				// 담당자 아이디
	private String ansYn = "N";			// 답변 여부
	private String ansCn;				// 답변 내용
	private Date   ansCrDt;				// 답변일시
	private Date   crDt;				// 생성일시
	private Date   updDt;				// 수정일시
	private String updr;				// 수정자
	private String postPw;				// 게시글 비밀번호
	private String wrtrEmail;			// 작성자 이메일
	
	// 조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private MozAtchFile atchFile;
	private List<MozAtchFile> qstAtchFileList;
	private List<MozAtchFile> ansAtchFileList;
	
}
