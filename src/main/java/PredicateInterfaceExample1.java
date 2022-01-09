import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

class Parent{
    void method1()  {System.out.println("Parent -> method1");}
}

class Child extends Parent {
    void method1() {System.out.println("Child -> method1");}
    void method2() {System.out.println("Child-> method2");}
}

class GrandChild extends Child {
    void method2() {System.out.println("GrandChild-> method2");}
    
   
}

class Reader {
	String read() {
		return "read";
	}
}

class Writer {
	void write(String msg) {
		System.out.print(msg);
	}
}

//class TM extends Reader, Wr {
//	String read() {
//		return "read";
//	}
//}

public class PredicateInterfaceExample1 {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
 
        // Calling Predicate method
        System.out.println(lesserthan.test(10));
        
        String str = "caaabbbaacdddd";
        String[] cha = str.split("");
        
//        Stream.of(cha).filter(n -> { 
//        	if(count(n, cha) < 1) {
//        		return ;
//        	}});
        
        String[] s= {"1", "2", "-2", "15"};
        Arrays.sort(s);
        for (String l : s) {
        	System.out.println(l);
        }
        
        System.out.println("#################################################################");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

        int v = list1.stream().max(Integer::compareTo).get();
        System.out.println(v);
        list1.stream()
                .distinct()
                .filter(list2::contains)
                //.forEach(System.out::print);
        		.forEach(n -> {
        			System.out.print(n);
        		});
//                .collect(Collectors.toList());

        //result.forEach(System.out::print);
        
        Parent p = new GrandChild(); 

        p.method1 (); 

        // wrong p.method2 ();
        System.out.println("#################################################################");
//        Predicate<Integer> p3  = i -> { if (Collectors.counting() > 2) return i;};
//        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,5));
//        list3.stream().filter(Collectors.counting());
        
        int[] numbers = {2,4,5};
        int val = Arrays.stream(numbers).filter(x->x%2==0).map(x->x*2).sum();
        System.out.println(val);
        System.out.println("#################################################################");
        SortedMap<Long, String> res = new TreeMap<>();
        res.put(timeAdds(new ArrayList<>()), "ArrayLsit");
        res.put(timeAdds(new LinkedList<>()), "LinkedList");
        res.put(timeAdds(new CopyOnWriteArrayList<>()), "CopyOnWriteArrayList");
        
        for (Map.Entry<Long, String> entry : res.entrySet()) {
        	System.out.println(entry.getValue());
        }

    }
    
    public static Long timeAdds(List<Integer> nums) {
    	Long startTime = System.currentTimeMillis();

    	Random ran = new Random();
    	for (int i=0; i<10000; i++) {
    		nums.add(ran.nextInt());
    	}
    	Long endTime = System.currentTimeMillis();
    	return endTime-startTime;
    }
    public static int count(String n, String[] cha) {
    	return 1;
    }
    
    public void example (Predicate<Integer> func, ArrayList<Integer> items) {
    	int i=0;
    	for (int item:items) {
    		if (func.test(item)) {
    			items.set(i,item);
    			i+=1;
    			
    		}
    	}
    	items.subList(i, items.size()).clear();
    }
}