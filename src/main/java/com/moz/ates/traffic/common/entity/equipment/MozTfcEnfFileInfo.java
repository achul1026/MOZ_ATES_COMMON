package com.moz.ates.traffic.common.entity.equipment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MozTfcEnfFileInfo {
	private String	vioFileNo;					//위반정보 파일 번호
	private String	tfcEnfEqpId;				//단속장비 고유번호
	private String	filePath;					//파일Path
	private String	fileNm;						//파일Nm
	private String	fileSize;					//파일크기
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date	crDt;						//생성일
}
