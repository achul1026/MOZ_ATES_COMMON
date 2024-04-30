package com.moz.ates.traffic.common.entity.menu;

import lombok.Data;

/**
 * 
 * @author : KY.LEE
 * @fileName :  MozMenuRouteDTO
 * @since : 2023-12-13
 */
@Data
public class MozMenuRouteDTO {

	//DB 조회 된 값
	private String menuId;
	private String menuNm;
	private String menuUrl;
	private String subMenuNm;
	private String subMenuUrl;
	
	//세팅 값
	private String currentMenuNm;
	private String currentMenuUrl;
	private String menuActiveLocation = "TWO"; // two or three active 위치
	
	//조회 파라미터
	private String lang = "eng";
	private String menuUrlPattrn;
	
}
