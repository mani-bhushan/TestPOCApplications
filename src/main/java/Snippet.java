

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Snippet {
	public static boolean isAnagram(String first, String second) {
	 

		char[] charactersOfFirst = first.replaceAll("\\s", "").toLowerCase().toCharArray();
	        char[] charactersOfSecond = second.replaceAll("\\s", "").toLowerCase().toCharArray();
	 
	        if (charactersOfFirst.length != charactersOfSecond.length) {
	            return false;
	        }
	 
	        int[] frequencies = new int[26];
	 
	        for (int i = 0; i < charactersOfFirst.length; i++) {
	            frequencies[charactersOfFirst[i] - 'a']++;
	            frequencies[charactersOfSecond[i] - 'a']--;
	        }
	 
	        for (int frequency : frequencies) {
	            if (frequency != 0) return false;
	        }
	 
	        return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s1= sc.next();
		//String s2= sc.next();
		List<String> l1 = new ArrayList<>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			Scanner lineScan = new Scanner(line);
			l1.add(lineScan.findInLine(Pattern.compile("([0-9]+(-[0-9]+)+)")));
		}
		int max = 0;
		String maxS = "";
		for (String str: l1) {
			int feq = Collections.frequency(l1, str);
			if (feq>max) {
				max=feq;
				maxS=str;
			}
		}
		// System.out.println(isAnagram(s1, s2));
		System.out.println(maxS);
	}
}