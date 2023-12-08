package com.moz.ates.traffic.common.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class MozatesCommonUtils{

	private MozatesCommonUtils() {};
	
	public static String getUuid() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	
	public static String getTfcEnfId() {
		// 현재 날짜 구하기
		LocalDate now = LocalDate.now();
		// 포맷 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		// 포맷 적용
		String formatedNow = now.format(formatter);
		int TfcEnfNo = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
		
		String tfcEnfId = formatedNow + Integer.toString(TfcEnfNo); 
		
		return tfcEnfId;
	}
	
	public static boolean isNull(Object paramVal) {
		boolean result = false;
		if("".equals(paramVal) || paramVal == null) {
			result = true;
		}
		return result;
	}
	
	public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
	
	public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }
}
