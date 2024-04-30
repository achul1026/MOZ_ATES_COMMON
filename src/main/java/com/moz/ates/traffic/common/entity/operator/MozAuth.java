package com.moz.ates.traffic.common.entity.operator;

import java.util.Date;
import java.util.List;

import com.moz.ates.traffic.common.entity.SearchOption;
import com.moz.ates.traffic.common.entity.menu.MozAuthMenu;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MozAuth extends SearchOption{
	private String authId;				//권한 아이디
	private String authCd;				//권한 코드
	private String authNm;				//권한 명
	private String authDesc;			//권한 설명
	private Date   crDt;				//생성일
	private String crtr;				//생성자
	
	//none Col
	private List<MozAuthMenu> authMenuList;		// 메뉴권한 목록
	
}
