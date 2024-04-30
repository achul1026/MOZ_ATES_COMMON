package com.moz.ates.traffic.common.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moz.ates.traffic.common.enums.CurrencyType;
import com.moz.ates.traffic.common.enums.PassengerDamageCd;
import com.moz.ates.traffic.common.enums.PassengerDriverRelationCd;
import com.moz.ates.traffic.common.enums.TrafficIdClassification;

@Component
public class MozatesCommonUtils {
	
	final static String middlebar = "-";

	private MozatesCommonUtils() {
	};

	/**
	 * @Method Name : getUuid
	 * @Date : 2024. 2. 7.
	 * @Author : IK.MOON
	 * @Method Brief : UUID 생성
	 * @return
	 */
	public static String getUuid() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}

	/**
	 * @Method Name : getUuid
	 * @작성일 : 2023. 11. 02.
	 * @작성자 : KY.LEE
	 * @Method 설명 : UUID 생성 글자수 제한
	 * @param int maxLength
	 * @return String
	 */
	public static String getUuid(int maxLength) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		uuid = uuid.substring(0, maxLength);
		return uuid;
	}

	//2024.03.24 custom creator = polId-sequence
	public static String getTfcEnfId(String creator , Date date) {
		//날짜 정의
		Date tfcEnfDt = date != null ? date : new Date();
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		
		String tfcEnfDtStr = fmt.format(tfcEnfDt);
		
		String creatorStr = getUuid(6).toUpperCase();
		
		if(!isNull(creator)) {
			creatorStr = creator;
		}
		
		String tfcEnfId = TrafficIdClassification.ENFORCEMENT + middlebar + tfcEnfDtStr + middlebar + creatorStr;

		return tfcEnfId;
	}
	
	//2024.03.24 custom creator = polLcenId-sequence
	public static String getAcdntId(String creator , Date date ) {
		//날짜 정의
		Date tfcAcdntDt = date != null ? date : new Date();
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		
		String tfcAcdntDtStr = fmt.format(tfcAcdntDt);
		
		String creatorStr = getUuid(6).toUpperCase();
		
		if(!isNull(creator)) {
			creatorStr = creator;
		}

		String tfcAcdntId = TrafficIdClassification.ACCIDENT + middlebar + tfcAcdntDtStr + middlebar + creatorStr;
		
		return tfcAcdntId;
	}


	/**
	 * @Method Name : isNull
	 * @Date : 2024. 2. 7.
	 * @Author : IK.MOON
	 * @Method Brief : Null check
	 * @param paramVal
	 * @return
	 */
	public static boolean isNull(Object paramVal) {
		boolean result = false;
		if ("".equals(paramVal) || paramVal == null) {
			result = true;
		}
		return result;
	}

	static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNotEmpty(final CharSequence cs) {
		return !isEmpty(cs);
	}

	/**
	 * @Method Name : getUrlPattrn
	 * @Date : 2024. 2. 7.
	 * @Author : IK.MOON
	 * @Method Brief : URL 패턴 확인
	 * @param urlPath
	 * @param replaceStr
	 * @return
	 */
	public static String getUrlPattrn(String urlPath, char replaceStr) {
		String resultPath = urlPath;
		try {
			long urlPathChk = urlPath.chars().filter(c -> c == replaceStr).count();
			if (urlPathChk > 1) {
				int lastIdx = urlPath.lastIndexOf(replaceStr);
				resultPath = urlPath.substring(0, lastIdx) + "/**";
			}
		} catch (Exception e) {
			resultPath = urlPath;
		}

		return resultPath;
	}
	
	/**
	  * @Method Name : getUrlType
	  * @작성일 : 2024. 2. 19.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 3Depth URL 타입 확인
	  * @param currentUrl
	  * @param replaceStr
	  * @return
	  */
	public static String getUrlType(String currentUrl, char replaceStr) {
		
		int lastIdx = currentUrl.lastIndexOf(replaceStr);
		String resultUrlType = currentUrl.substring(lastIdx + 1);
			
		return resultUrlType;
	}
	
	/**
	  * @Method Name : isNowStr
	  * @작성일 : 2023. 8. 22.
	  * @작성자 : KC.KIM
	  * @Method 설명 : 현재 날짜 구하기(String 반환)
	  * @param pattern
	  * @return String
	  */
	public static String isNowStr(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date now = new Date();
		
		return sdf.format(now);
	}
	
	/**
	 * @brief priceFmt
	 * @author KY.LEE
	 * @date 2024. 2. 26.
	 * @method priceFmt
	 */
	public static String priceFmt(Float price, String formatType) {
		String result = "";
		
		DecimalFormat formatter = new DecimalFormat("###,###.##");
		if(!isNull(price) && !isNull(CurrencyType.getCurrency(formatType))) {
			result = formatter.format(price) + CurrencyType.getCurrency(formatType).getName();
		} else {
			result = "-";
		}
		
		return result;
	}
	
	/**
	 * @brief 날짜 계산기
	 * @author KY.LEE
	 * @date 2024. 2. 27.
	 * @method calculateAfterDays
	 */
    public static Date calculateAfterDays(Date paramDt,int number, int addType) {
        Calendar calendar = Calendar.getInstance();
        
        calendar.setTime(paramDt);
        calendar.add(addType, number);
        
        return calendar.getTime();
    }
    
	/**
	 * @brief 가격 퍼센테이지 더하기
	 * @author KY.LEE
	 * @date 2024. 2. 27.
	 * @method calculateAfterDays
	 */
    public static float calculateIncreasedPrice(float price , float percentage) {
        // percentage에 따라 가격 증가율 계산
        float increasedPrice = price + (price * (percentage / 100));
        return increasedPrice;
    }
    
	/**
	 * @brief JsonString To Map<String,Object>
	 * @author KY.LEE
	 * @date 2024. 3. 21.
	 * @method jsonStringToMap
	 */
    public static Map<String,Object> jsonStringToMap(String jsonString){
    	Map<String, Object> result = null;
    	if(!isNull(jsonString)) {
    		try {
    			result = new ObjectMapper().readValue(jsonString, HashMap.class);
    		} catch (JsonProcessingException e) {
    			return null;
    		}
    	}
		return result;
    }
    
	/**
	 * @brief castEnumCode
	 * @author KY.LEE
	 * @date 2024. 3. 21.
	 * @method castEnumCodeForName
	 */
    public static String castEnumCodeForName(String colName, String code){
    	if(!isNull(code)) {
    		switch(colName) {
    		case "pnrDmgCd" :
    			return PassengerDamageCd.getPassengerDamageCdNameForCode(code);
    		case "pnrDrvrRltnCd" :
    			return PassengerDriverRelationCd.getPassengerDriverRelationCdNameForCode(code);
    		}
    	}
    	return "";
    }
}
