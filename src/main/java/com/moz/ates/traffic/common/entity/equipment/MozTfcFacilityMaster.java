package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozTfcFacilityMaster extends SearchOption{
	private String tfcFacilityId;			// 교통시설물 아이디
	private String facilityTy;				// 교통시설물 종류 
	private String facilityStts;			// 교통시설물 상태
	private String facilityDesc;			// 교통시설물 상세 설명
	private String jur;						// 관할
	private String lat;						// 위도
	private String lng;						// 경도
	private Date   crDt;					// 생성일
	private String crtr;					// 생성자 아이디
	private String facilityNm;				// 교통시설물 이름
	private String roadAddr;				// 교통시설물 위치
	private String modelNm;					// 모델명	
	private String mnfctr;					// 제조사
	private String instlYn;					// 설치 여부
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date instlDate;					// 설치 일자
	private String instler;					// 설치자
	private String crOprtrId;				// 담당자
	private String crOprtrDept;				// 담당 부서
	private String tfcFacilityImagepath;	// 교통시설물 이미지 경로
	private String tfcFacilityImagename;	// 교통시설물 이미지 명칭
	// 조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private List<MozTfcFacilityFileInfo> tfcFacilityFileInfoList;
	
	private String instlDateString;	
}
