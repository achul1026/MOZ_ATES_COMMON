package com.moz.ates.traffic.common.entity.law;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcLwInfo extends SearchOption{
	private String tfcLawId;					//법률아이디
	private String lawNm;						//법률명
	private String lawArticleNo;				//법령번호
	private String lawDesc;						//법률 설명
	private String lawChapter;					//법률 챕터
	private String lawType;						//법률 유형
	private Date   crDt;						//생성일
	private String crtr;						//생성자
	private Date prmgtnDe;						//공포일자
	private Date eftvDe;						//시행일자
	private Date rvsnDe;						//개정일자
	private String repealYn;					//폐지여부
	private Date repealDe;						//폐지일자
	private String dateSearchType;				//일자 타입
	
	private List<MozTfcLwFineInfo> mozTfcLwFineInfoArr;

	private List<MozTfcLwAdtnRvsn> mozTfcLwAdtnRvsnArr;
	
	// none column
	private String cdNm;
}
