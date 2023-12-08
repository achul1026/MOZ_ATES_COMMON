package com.moz.ates.traffic.common.entity.board;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozAtchFile{
	private String fileIdx;			// 파일 인덱스
	private String atchIdx;			// 첨부파일 연결할 상위 테이블 인덱스
	private String oprtrId;			// 담당자 아이디
	private String fileOrgNm;		// 회원파일명
	private String fileSaveNm;		// 저장파일명
	private String filePath;		// 파일 경로
	private String fileSize;		// 파일 사이즈
	private String fileExts;		// 파일 확장자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date crDt;				// 등록일자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date updDt;				// 수정일자
}
