package app.org.com.main.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VolatileTest {

	static int c = 7;
	public static void main(String[] args) {
		Thread[] threadArr = new Thread[5];
		for(int i = 0; i < threadArr.length; i++) {  
			threadArr[i] = new TestModel(c, ++c);
			threadArr[i].start();
		}
//		for(int i = 0; i < threadArr.length; i++) {  
//			threadArr[i].start();
//		}
		
		System.out.println();
		VolatileTest vol = new VolatileTest();;
		A obj = vol.new B();
		
//		try {
//			obj.display();
//			throw new NullPointerException("try1");
//		} catch (Exception ex)  {
//			System.out.println(ex.getMessage());
//		} finally  {
//			try {
//				obj.display();
//				throw new ArithmeticException("try2");
//			} catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		lostInForest(5);
		
	}
	
	public static int lostInForest(int input1) {
		
		Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
		int max = 1;
		
		if (input1 == 1) {
			return max;
		} else {
			for (int i=1; i<=input1; i++) {
				map1.put(i, new ArrayList<Integer>());
				int num = i;
				int val = lostCall(map1.get(i), num);
				if (val>max) max=val;
				System.out.print(map1.get(i).toString());
			}
		}
		return max;
		//throw new UnsupportedOperationException("lostInForest(int input1)");

	}

	private static int lostCall(List list1, int num) {
		if (num == 1) {
			list1.add(num);
		} 
		while(num > 1) {
			list1.add(num);
			
			if (checkEven(num)) {
				num = (3*num) +1;
			} else {
				num /= 2;
			}
		}
		return list1.size();
	}

	private static boolean checkEven(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else if (num%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	interface i {
		int getInt();
	}
	
	class A implements i {

		int v = 11;
		
		@Override
		public int getInt() {
			return this.v;
		}
		
		public void display() {
			System.out.println("Class : " + getInt() + " A");
		}
		
	}
	
	class B extends A implements i {
		public void display() {
			System.out.println("Class : " + getInt() + " B");
		}
	}
}
