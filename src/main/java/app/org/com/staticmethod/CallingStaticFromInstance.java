package app.org.com.staticmethod;

/**
 * 
 * @author root@manish
 *
 *
 * When De-compiled .class file got this code.

 * Decompiled with CFR 0_114.

  	public class CallingStaticFromInstance {

   		@SuppressWarnings("static-access")
   		public static void main(String[] args) {
        	Object h = null;
        	CallingStaticFromInstance.staticMethod();
    	}
    	
  		public static void staticMethod() {
       		System.out.println("hello");
    	}
    	
	}
 *
 */


public class CallingStaticFromInstance {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		CallingStaticFromInstance h = null;
		h.staticMethod();
		h.nonStaticMethod();
		
	}

	public static void staticMethod() {
        System.out.println("Hello Static Method");
    }
	
	public void nonStaticMethod() {
        System.out.println("Hello Non Static Method");
    }
}




























