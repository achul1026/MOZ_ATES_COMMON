package com.moz.ates.traffic.common.entity.board;

import java.sql.Date;

import lombok.Data;

@Data
public class MozAtchFile{
	private String fileIdx;			// 파일 인덱스
	private String atchIdx;			// 첨부파일 연결할 상위 테이블 인덱스
	private String oprtrId;			// 담당자 아이디
	private String fileOrgNm;		// 원본파일명
	private String fileSaveNm;		// 저장파일명
	private String filePath;		// 파일 경로
	private Long fileSize;			// 파일 사이즈
	private String fileExts;		// 파일 확장자
	private String fileType;		// 파일 타입(1:질문, 2:답변)
	private Date crDt;				// 등록일자
	private Date updDt;				// 수정일자
}
