package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import lombok.Data;

@Data
public class MozTfcEnfFileInfo {
	private String tfcEnfId;					//단속정보 고유번호
	private Long	vioFileNo;					//위반정보 파일 번호
	private String	tfcEnfEqpId;				//단속장비 고유번호
	private String	filePath;					//파일Path
	private String	fileNm;						//파일Nm
	private String	fileSize;					//파일크기
	private Date	crDt;						//생성일
	private String fileOrgNm;					//원본 파일명
}
