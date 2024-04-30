package com.moz.ates.traffic.common.util;

import org.springframework.util.Base64Utils;

public class Base64PasswordUtils {

	public static String encodePassword(String plainPassword) {
		return Base64Utils.encodeToString(plainPassword.getBytes());
	}

	public static boolean matches(String rawPassword, String encodedPassword) {
		String decodeddPassword = new String(Base64Utils.decodeFromString(encodedPassword));
		
		return decodeddPassword.equals(rawPassword);
	}
	
}
