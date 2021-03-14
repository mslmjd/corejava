package com.swarna.cj.inheritance;

public class MaskUtil {
	
	private MaskUtil() {
	
	}

	public static String mask(long number) {
		
		String str=Long.toString(number);
		str = "XXXXXXX" + str.substring(str.length() - 3);
		return str;
	

	}

}
