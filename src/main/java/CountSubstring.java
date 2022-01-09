import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
 
public class CountSubstring {
	public static int countSubstring(String subStr, String str){
		// the result of split() will contain one more element than the delimiter
		// the "-1" second argument makes it not discard trailing empty strings
		System.out.println("length : " + str.split(subStr).length); // [, e , ree tru, s], [], [, , , a*, , , a*]
		return str.split(Pattern.quote(subStr), -1).length - 1; // [, e , ree tru, s], [, , , , , ], [abaabb, bab, bab]
	}
 
	public static void main(String[] args){
		System.out.println(countSubstring("th", "the three truths"));
		System.out.println(countSubstring("ab", "ababababab"));
		System.out.println(countSubstring("a*b", "abaabba*bbaba*bbab"));
		
		String s = "ReponseEntity GetMaping";
		String[] sArr = s.split(" ");

		Map<String, Long> map = Arrays.asList(sArr).stream()
				.sorted()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
//		Collections.sort((List<T>) map.entrySet(), (p1,p2) -> p2.getValue().compareTo(p1.getValue));

	}
}  