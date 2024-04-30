package com.moz.ates.traffic.common.entity.finentc;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.common.MozCmCd;
import com.moz.ates.traffic.common.entity.driver.MozVioInfo;
import com.moz.ates.traffic.common.entity.enforcement.MozTfcEnfMaster;
import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFileInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwFineInfo;
import com.moz.ates.traffic.common.entity.law.MozTfcLwInfo;
import com.moz.ates.traffic.common.entity.payment.MozFinePymntInfo;
import com.moz.ates.traffic.common.entity.payment.MozPlPymntInfo;
import com.moz.ates.traffic.common.entity.police.MozPolInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozFineNtcInfo extends SearchOption {
	private String fineNtcId;
	private String tfcEnfId;
	private Date firstFineNtcDt;
	private Float firstFineNtcPrice;
	private Date secondFineNtcDt;
	private Float secondFineNtcPrice;
	private Date firstFineNtcDdln;
	private Date secondFineNtcDdln;
	private String ntcTy;
	private Date crDt;
	private String crtr;
	
	//none Col
	private String lawType;
	private Long fineInfoCnt;
	
	// 조인 테이블
	private MozVioInfo vioInfo;
	private MozTfcEnfMaster tfcEnfMaster;
	private MozPolInfo polInfo;
	private MozTfcLwInfo tfcLwInfo;
	private MozTfcLwFineInfo tfcLwFineInfo;
	private MozFinePymntInfo finePymntInfo;
	private MozPlPymntInfo plPymntInfo;
	private MozCmCd cmCd;
	
	private List<MozTfcEnfFileInfo> fileList;
}
