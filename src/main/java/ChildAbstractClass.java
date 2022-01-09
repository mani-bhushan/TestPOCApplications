import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChildAbstractClass extends AbstractClass {

	public static void main(String[] args) {

		//AbstractClass abs = new AbstractClass();
		
		ChildAbstractClass obj = new ChildAbstractClass();
		
		String s1 = "A";
		String s2 = "B";
		String s3 = new String(s1);
		System.out.println("H" + (s3=s1));
		
//		String s = new String("Manijava");
//		String[] chr = s.split("a");
//		System.out.print(chr);
		
		
//		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
//		
//	    System.out.println("original list: " + numberList);
//
//	    List<Integer> even = numberList.stream()
//	                                .filter(number -> (number % 2 == 0))
//	                                .collect(Collectors.toList());
//
//	    System.out.println("processed list, only even numbers: " + even);
		
		
		
	}
	
	public boolean isPowerOfTwo(int n) {
        
        if (n < 0) return false;
        else if(n==0) return false;
        else return (1 == Integer.bitCount(n));
        // System.out.println(Integer.bitCount(4));
        // System.out.println(Integer.bitCount(-15));
        // System.out.println(Integer.bitCount(16));
        // System.out.println(Integer.bitCount(536870912));
        // if (n < 0) return false;
        // else if(n==0) return false;
        // else if (n == 536870912) return true;
        // else return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
	
	public ChildAbstractClass() {
		super();
		System.out.println("abstract child class : ");
		
		StringBuilder br = new StringBuilder();
		br.append("" + "DFG".charAt(1));
		System.out.println(br.toString());
		String S = "";
		for (int i=0; i<S.length(); i += 2) {
			
		}
		
	}

	
	
}
