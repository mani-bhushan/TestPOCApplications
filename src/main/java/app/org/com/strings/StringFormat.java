package app.org.com.strings;

import java.util.regex.Pattern;

public class StringFormat {

	public static void main(String[] args) {
		
		System.out.println("piper".charAt(3));
		System.out.println("piper".compareTo("njn"));
		
		String pipe = "Hello World!";
		System.out.println("print different values: \n" 
				+ pipe.substring(11, 12) 
				+ pipe.substring(11) 
				+ pipe.charAt(11));
		
		
		if ("" instanceof String) {
			System.out.println("true");
		}
		
		
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
