package app.org.com.map.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOfElementCounts {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 2, 4, 1, 1 };

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map1.containsKey(arr[i])) {
				map1.put(arr[i], map1.get(arr[i])+1);
			} else {
				map1.put(arr[i], 1);
			}
		}
		System.out.println(map1);
		
		/**
		 * 
		 * Collects the counting of each elements.
		 * 
		 * Function.identity() is (n -> n) i.e 
		 * It returns a function that always returns its input argument.
		 */
		Map<Integer, Long> stream1 = Arrays.stream(arr, 0, arr.length).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Integer, Long> stream2 = Arrays.stream(arr, 0, arr.length).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(stream1);
		System.out.println(stream2);

		/**
		 * 
		 * Collects the counting of each elements.
		 * Prints key for the maximum occurring element.
		 * 
		 */
		String str1 = "Java is a platform independent aaaa.";
		String[] strArr = str1.split("");
		Map<String, Long> stream3 = Arrays.stream(strArr, 0, strArr.length).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		String key = Collections.max(stream3.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("stream3 : " + stream3);
		System.out.println("key : " + key);
		
		/**
		 * 
		 * create a stream of integer.
		 * Limits to 10th element.
		 * 
		 */
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2).limit(10);
                //.forEach(x -> System.out.println(x));
		
		Stream.iterate(0, n -> n + 1)
				.filter(x -> x % 2 != 0) //odd value
				.limit(10)
				.forEach(x -> System.out.println(x));
		
		/**
		 * 
		 * A classic Fibonacci example.
		 * 
		 */
		StringBuilder builder = new StringBuilder();
		Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
				.limit(20)
				.map(n -> n[0])
				.forEach(x -> {
					builder.append(x + ", ");
					//System.out.print(x + "  ");
				});
		
		System.out.println(builder.substring(0, (builder.length()-2)) + ".");
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        productsList.stream()  
        .filter(product -> product.price >= 30000)  
        .forEach(product -> System.out.println(product.name));
        
        
	}
	
}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
}
