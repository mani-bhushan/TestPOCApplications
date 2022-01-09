package app.org.com.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//leap of faith : Vishwas ki chhalang
public class RecursionSamples {

	public static void main(String[] args) {
		RecursionSamples obj = new RecursionSamples();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(obj.methodA(arr, 0));
		obj.methodB(arr, 0);
		
		int[] newArr = {1,2,3,4,5,6,7};
		List<Integer> l1 = Arrays.stream(newArr).boxed().collect(Collectors.toList());
		OptionalDouble val = IntStream.of(newArr).filter(n -> n%2==1).map(n-> {return (int) Math.sqrt(n);}).average();
		
		double d1 = l1.stream().filter(n -> n%2==1).map(n-> {return Math.sqrt(n);}).collect(Collectors.averagingInt(n-> Integer.parseInt(n+"")));

		System.out.print(d1);
	}
	
	public int methodA(int[] arr, int st) {
		if (st==arr.length-1) return arr[st];
		return Math.max(arr[st], methodA(arr, st+1));
	}
	
	// print ele in array :
	public void methodB(int[] arr, int st) {
		if (st==arr.length) {
			return;
		}
		System.out.print(arr[st]);
		methodB(arr, st+1);
	}

}
