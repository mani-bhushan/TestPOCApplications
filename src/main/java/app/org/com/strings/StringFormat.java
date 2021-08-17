package app.org.com.strings;

import java.util.regex.Pattern;

public class StringFormat {

	public static void main(String[] args) {
		String str = checkAndReplace("0x01C"); 
		Boolean val = checkPattern("0x012");
		if (!val) {
			str = str.substring(0, str.length() - 1); 
		}
		
		System.out.println(str);
		System.out.println(val);

	}
	
	public static String checkAndReplace(String str) {
		
		if (str.endsWith("B")) {
			str = replace(str, "*");
		}
		if (str.endsWith("C")) {
			str = replace(str, "#");
		}
		return str;
	}
	
	public static String replace(String str, String ch) {
		
		StringBuilder builder = new StringBuilder(str);
		builder.replace(builder.length() - 1, builder.length(), ch);
		builder.toString();
		
		return builder.toString();

	}
	
	public static boolean checkPattern(String inputString) {
		String style = "[0-9#*]$";
		return Pattern.compile(style).matcher(inputString).find();

	}

}
