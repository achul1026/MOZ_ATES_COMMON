package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;
import java.util.List;

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
	private String lat;						// 위도
	private String lng;						// 경도
	private Date   crDt;					// 생성일
	private String crtr;					// 생성자 아이디
	private String facilityNm;				// 교통시설물 이름
	private String roadAddr;				// 교통시설물 위치
	private String facilityCate;			// 교통시설물 카테고리
	private String facilityDiv;				// 교통시설물 구분
	private String areaCd;					// 구역 코드
	private String useYn;					// 사용 여부
	private String oprtrId;					// 담당자
	
	// 조인 테이블
	private MozCmCd cmCd;
	private MozWebOprtr webOprtr;
	private List<MozTfcFacilityFileInfo> tfcFacilityFileInfoList;
	
	private String instlDateString;	
}
