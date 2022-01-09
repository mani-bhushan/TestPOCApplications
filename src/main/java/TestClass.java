import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TestClass {
	public static void main(String[] args) {
//		User u1= new User(1, "u1");
//		User u2= new User(2, "u2");
//		User u3= new User(3, "u3");
//		
//		List<User> userList = new ArrayList<>();
//		userList.add(u1);
//		userList.add(u2);
//		userList.add(u3);
		
		// userList.stream().filter(e->e.id>1).collect(Collectors.toMap(e->e.getId(), e->e));
		//.forEach((k,v)-> System.out.println(k + " " + v));
		//Map<Integer, User> map1 = userList.stream().filter(e->e.id>1).collect(Collectors.toMap(e->e.getId(), e->e));
		//map1.forEach((k,v)-> System.out::println(k + " " + v));
		
//		userList.stream().map((u)-> {u.setName(u.getName()+"u"); return u;}).forEach(System.out::println);
		
		
		
		System.out.println(methodA("xyz"));
		System.out.println(methodB("xyz"));
		
		String s2 = "Welcome To Chennai";
		Map<String, Long> map2 = new HashMap<>();
		for (int i=0; i<s2.length(); i++) {
			
			char ch = s2.charAt(i);
			boolean val = countOccurrences(s2,ch) > 1;
			if (val && !map2.containsKey(ch)) {
				map2.put("" + ch, countOccurrences(s2,ch));
			} 
		}
		
		List<String> items =  Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		//Map<String, Long> map2 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Integer> map1 = new HashMap<>();

		for (String s : items) {
			if (map1.containsKey(s)) 
				map1.put(s, (map1.get(s)+1));
			else 
				map1.put(s, 1);
		}
		
		System.out.println();
		
	}
	
	private static long countOccurrences(String str, char ch) {
	    return str.chars()
	            .filter(c -> c == ch)
	            .count();
	}
	
	public static String methodA(String s) {
		String out = "";
		char[] charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int j = 0; j < s.length(); j++) {
			if (check(charArray, s.charAt(j))) {
				for (int i = 0; i < charArray.length; i++) {
					if (charArray[i] == s.charAt(j)) {
						out += i;
					}
				}
			} else {
				return "None";
			}
		}
		return out;
	}
	
	public static String methodB(String s) {
		String out = "";
		char[] charArray1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String s1 = "xcd";
		List l1 = Arrays.asList(s1.toCharArray());
		for (int i = 0; i < charArray1.length; i++) {
			if (l1.contains(charArray1[i])) {
				out += "" + ((int) charArray1[i] - 65);
			} else
				return "None";
		}
		return out;
	}
	
	public static boolean check(char[] charArray, char ch) {
		for (int i=0; i<charArray.length; i++) {
			if (charArray[i]==ch)
				 return true;
		}
		return false;
	}
	
	List<String> items =  Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
	//items.stream().collect();

 }