
public class TestClass3 {

	public static void main(String[] args) {
		System.out.println(facto(5));
	}
	
	public static long facto(long n) {
		if (n<3) return n;
		else return n * facto(n-1);
	}

}
