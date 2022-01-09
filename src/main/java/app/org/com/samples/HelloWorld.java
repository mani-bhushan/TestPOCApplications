package app.org.com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HelloWorld {

	public static <Integer> Map<Integer, Long> numberFrequencyMap(Stream<Integer> elements) {
		return elements.collect(Collectors.groupingBy(
				Function.identity()
				, HashMap::new, // can be skipped
				Collectors.counting()));
	}

	public static <Character> Map<Character, Long> characterFrequencyMap(Stream<Character> elements) {
		return elements.collect(Collectors.groupingBy(
				Function.identity(), 
				HashMap::new, // can be skipped
				Collectors.counting()));
	}

	public static <String> Map<Character, Long> stringFrequencyMap(Stream<Character> elements) {
		return elements.collect(Collectors.groupingBy(
				Function.identity(),
				HashMap::new, // can be skipped
				Collectors.counting()));
	}

	public static void main(String args[]) {
		
		int[] numbers = { 1, 2, 2, 2, 3, 3 };
		System.out.println(characterFrequencyMap(Arrays.stream(numbers).boxed()));
		
		String str = "Welcome To Chennai Central";
		System.out.println(characterFrequencyMap(str.chars().mapToObj(c -> (char) c)));
		
		char[] chArray = str.toCharArray();
		System.out.println(characterFrequencyMap(Stream.of(chArray)));

		Character[] letters = { 'a', 'b', 'b', 'c', 'c', 'c' };
		System.out.println(characterFrequencyMap(Arrays.stream(letters)));

		List<String> words = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
		System.out.println(characterFrequencyMap(words.stream()));
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		words.forEach(word -> frequencyMap.merge(word, 1, (v, newV) -> v + newV));
		System.out.println(frequencyMap);
		
		Map<Integer, String> mergeMap = new HashMap<>();
		mergeMap.put(3, "bella");
		mergeMap.put(1, "hello");
		mergeMap.put(2, "bye");
		// mergeMap
		mergeMap.merge(3, " ciao", (v, newV) -> { return (v + newV); });
		mergeMap.merge(1, " world", String::concat);
		System.out.println(mergeMap);
		
		
		String str1 = "Mani Mishra";
		Map<String, Integer> map1=new HashMap<>();
		for (int i=0; i<str1.length(); i++) {
			map1.merge(str1.charAt(i)+"", 1, (v, newV) -> v+1);
//			if  (!map1.containsKey(str1.charAt(i)+"")) map1.put(str1.charAt(i)+"", 1);
//			else map1.put(str1.charAt(i)+"", map1.get(str1.charAt(i)+"")+1);
		}
		for (int i=0; i<str1.length(); i++) {
			if (map1.get(str1.charAt(i)+"")==1) {
				System.out.println(str1.charAt(i)+"");
				break;
			}
		}
		
		
		String testString ="qqwweerrttyyaaaaaasdfasafsdfadsfadsewfywqtedywqtdfewyfdweytfdywfdyrewfdyewrefdyewdyfwhxvsahxvfwytfx"; 
		
		Map<Character, Long> mapTest = testString.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
//		mapTest.entrySet()
//		.stream()
//		.max((e1, e2) -> e1.getValue())
		
		mapTest.entrySet()
		.stream()
		.filter(map -> map.getValue() > 1) 
	    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		
		mapTest.entrySet()
		.stream()
		.filter(map -> map.getValue() > 1) 
	    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // working on entrySet() so collect to map is working
		
        long java8Case2 = testString.codePoints().filter(ch -> ch =='a').count();
        System.out.println("a = " + java8Case2);

        List<Character> list = new ArrayList<Character>();
        for (char c : testString.toCharArray()) {
          list.add(c);
        }
        Map<Object, Integer> counts = list.parallelStream().
            collect(Collectors.toConcurrentMap(
                w -> w, w -> 1, Integer::sum));
        System.out.println("counts : " + counts);
        
        String testStr = "Hello World LOL";
        Entry<Character, Long> testVal = testStr.toLowerCase()
        		.chars()
        		.mapToObj(c -> (char) c)
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
        		.stream()
        		.max((p1,p2) -> p1.getValue().compareTo(p2.getValue())).get();
        System.out.println("testVal " + testVal);
        
        char c=8;
        int i=9;
        System.out.println(c+i);
        c='a';
        System.out.println(c+i);
        
        /**
         * method to check map and there hash/equals contract 
         */
        
        System.out.println("methodMap : start");
        methodMap();
        System.out.println("methodMap : end");
        
        System.out.println("checkMethod2 : start");
        checkMethod2();
        System.out.println("checkMethod2 : end");
        
        List<Integer> numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		int value = numList.stream().max(Integer::compare).get();
		System.out.println("value : " + value);
		
		Optional<Integer> val = numList.stream().filter(n->n%2==0).findAny();
		System.out.println("val : " + val);
		
		double avg = numList.stream().filter(n->n%2!=0).collect(Collectors.averagingInt(n->n));
		System.out.println("average : " + avg);
		
		System.out.println("-16%2 : " + (-16%3));

		
        String s1 = "Hello World";
        // String s1 = new String("Hello World").intern();
        // s1 = s1.intern();
        String s2 = new String("Hello World");
        s2 = s2.intern();
        // s2.intern();
        System.out.println("s1==s2 : " + (s1==s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.hash : " + s1.hashCode());
        System.out.println("s2.hash : " + s2.hashCode());
        Map<String, Integer> stringHashMap  = new HashMap<>();
        stringHashMap.put(s1, s1.hashCode());
        stringHashMap.put(s2, s2.hashCode());
        System.out.println("stringHashMap : " + stringHashMap);
        System.out.println("size : " + stringHashMap.size());
        Map<String, Integer> stringHashMap1  = new HashMap<>();
        stringHashMap1.put(s1, s1.hashCode());
        stringHashMap1.put(s2, s2.hashCode());
        System.out.println("stringHashMap1 : " + stringHashMap1);
        System.out.println("size : " + stringHashMap1.size());
        
        List l1 = new ArrayList<>(10);
        l1.add("");
        Set set1 = new HashSet<>();
        set1.add("");
	}

//  public static void hellos(HashSet<String> h1) {
//	
//}

	public static void hellos(Set<Integer> s1) {

	}

	public static void hellos(HashSet<Integer> h1) {

	}

	public static void hellos(SortedSet<Integer> s1) {

	}

	public static void hellos(TreeSet<Integer> s1) {

	}
	
	static void methodMap() {
		System.out.println("methodMap");
		
		EmployeeObj e1 = new EmployeeObj(1, "ABC");
		EmployeeObj e2 = new EmployeeObj(1, "ABC");
		EmployeeObj e3 = null;


		Map<EmployeeObj, String> m1 = new HashMap<>();
		m1.put(e1, "ABC");
		m1.put(e2, "ABC"); // map with e1 as its key and "ABC"
		m1.put(e3, "pqrs");
		m1.put(null, "zaqw");

		System.out.println("e1.equals(e2) : " + e1.equals(e2));

		e1.setName("xyz");

		System.out.println("e1.equals(e2) : " + e1.equals(e2));

		System.out.println(m1.get(e1)); // xyz // ABC because changing only the key's value not the value in map


		System.out.println(m1.get(null)); // zaqw // 


		System.out.println(m1.get(e3)); // zaqw // 


		System.out.println("map size : " + m1.size()); // 3 // 2
		}
	
	static void checkMethod2() {
		List<EmployeeObj> empList = new ArrayList<>();
		empList.add(new EmployeeObj(1, "JACK - 1", 5001));
		empList.add(new EmployeeObj(2, "JACK - 2", 5002));
		empList.add(new EmployeeObj(3, "JACK - 3", 5003));
		empList.add(new EmployeeObj(4, "JACK - 4", 5004));
		empList.add(new EmployeeObj(5, "JACK - 5", 5005));
		empList.add(new EmployeeObj(10, "Huge Jack", 5010));
		empList.add(new EmployeeObj(9, "JACK - 9", 5009));
		empList.add(new EmployeeObj(8, "JACK - 8", 5008));
		empList.add(new EmployeeObj(7, "JACK - 7", 5007));
		empList.add(new EmployeeObj(6, "JACK - 6", 5006));
		
		String name = empList.stream()
				.sorted((e1, e2) -> e1.getSal().compareTo(e2.getSal()))
				.skip(1)
				.map(c -> c.getName())
				.findFirst()
				.get();
		System.out.println(name);
		
		name = empList.stream()
				.sorted(Comparator.comparingInt(EmployeeObj::getSal)
						.reversed())
				.skip(1)
				 .map(c -> c.getName())
				.findFirst()
				.get();

		
	}

}