package app.org.com.staticmethod;

public class TestObject {

	public static void main(String[] args) {
		CallingStaticFromInstance h = new CallingStaticFromInstance();
		h.staticMethod();
		String str ="";
		str.toCharArray();

		TestObject t1 = new TestObject();
		System.out.println(t1.checkPAlindrome("ASDFGFDSA"));
	}
	
	public boolean checkPAlindrome(String str) {

		StringBuilder builder = new StringBuilder(str);
		if (builder.toString().equals(builder.reverse().toString())) 
			return true;
		else return false;
		
	}

}
