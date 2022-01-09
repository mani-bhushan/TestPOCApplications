package app.org.com.pattern;

public class StarPatternOne {

	public static void main(String[] args) {
		starPat1(4);
	}

	public static int starPat1(int n) {
		for (int i=n; i>0; i--) {
			if ((n-i) > 1)  {
				System.out.print("*");
			} else if ((n-i) == 1) {
				System.out.println("*");
			} else {
				System.out.println(n-i);
			}
			return starPat1(i-1);
		}
		return -1;
	} 
}
