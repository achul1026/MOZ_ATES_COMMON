package com.moz.ates.traffic.common.entity.common;


import java.sql.Date;

import com.moz.ates.traffic.common.entity.SearchOption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozCmCd extends SearchOption{

    private String cdId;		// 공통코드아이디
    private String cdGroupId;	// 공통코드부모아이디
    private String cdNm;		// 공통코드명
    private String cdDesc;		// 공통코드설명
    private String useYn;		// 사용여부
    private String crtr;		// 생성자
    private Date crDt;		// 생성일시
		
	// None Column
	private String cdIdOg;  // 공통코드아이디 og
	
//	private List<MozCmCdInfo> subCodeList;
//	
//	@Data
//	public static class MozCmCdInfo {
//		 private String cdId;		// 공통코드아이디
//		    private String cdGroupId;	// 공통코드부모아이디
//		    private String cdNm;		// 공통코드명
//		    private String cdDesc;		// 공통코드설명
//		    private String useYn;		// 사용여부
//		    private String crtr;		// 생성자
//	}
//	
//	public void setJsonSubMenuList(String strSubCode) {
//		if(strSubCode != null) {
//			ObjectMapper objectMapper = new ObjectMapper();
//			try {
//				List<MozCmCdInfo> subMenuList = Arrays.asList(objectMapper.readValue(strSubCode, MozCmCdInfo[].class))
//													.stream().collect(Collectors.toList());
//				this.subCodeList = subMenuList;
//			} catch (JsonProcessingException e) { 
//			    this.subCodeList = null;
//			}
//		}
//	}
}
