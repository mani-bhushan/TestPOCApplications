import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClass1 {

	public static void main(String[] args) {
		int[] arr = {-1, 9, 8, 1, 2, 7, 2, 7, 3, 6, 3};
		
		//Long lon1 = (long) new Integer(1);
		// List<Long> longList2 = Arrays.stream(arr).mapToObj( n -> (long) n).collect(Collectors.<Long>toList());
		
		int sum = 9;
		// 
		Map<Integer, Long> map1 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//map1.entrySet().map()
		List<Integer> l1= new ArrayList<>();
		for (int i=0; i<arr.length; i++) {
			int target = (sum > arr[i]) ? sum - arr[i] : arr[i] - sum;
			for (int j=0; j<arr.length; j++) {
				if (arr[j] == target) {
					if (map1.get(arr[j])  > 0 && map1.get(arr[i])  > 0)  {
						l1.add(arr[i]);
						l1.add(arr[j]);
						map1.put(arr[j], map1.get(arr[j])-1);
						map1.put(arr[i], map1.get(arr[i])-1);
					}
					break;
				}
			}	
		}
		l1.forEach(n -> {
			System.out.print(n + ",");
		});
		

		List<Integer> list = IntStream.range(69, 101).boxed().collect(Collectors.toList());
		
		List<Integer> numList = new ArrayList<>();
		for (int i=69; i<101; i++) {
			numList.add(i);
		}
		
		
		StringBuilder sb = new StringBuilder();
		list.stream().sorted((p1,p2) -> p1.compareTo(p2)).collect(Collectors.toList()).forEach(n -> {
			if (n.equals(75)) sb.append(n);
		});
		System.out.println(sb.toString());
		numList.stream().sorted((p1,p2) -> p1.compareTo(p2)).collect(Collectors.toList()).forEach(System.out::print);
		
	}
}

interface I1 {
	void i1();
}

interface I2 {
	void i1();
	void i2();
}

class A implements I1, I2 {

	@Override
	public void i1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void i2() {
		// TODO Auto-generated method stub
		
	}
}

class B extends A {
	
}

class C extends B{
	
}

//{-1, 9, 8, 1, 2, 7, 2, 7, 3, 6, 3};
//
//8,1
//2,7
//7,2
//2,7
//3,6
//
//8,1
//2,7
//7,2
//3,6

// {-1=1, 1=1, 2=2, 3=2, 6=1, 7=2, 8=1, 9=1}

//8,1
//1,8
//2,7
//2,7
//7,2
//7,2
//2,7
//2,7
//7,2
//7,2
//3,6
//6,3
//6,3
//3,6