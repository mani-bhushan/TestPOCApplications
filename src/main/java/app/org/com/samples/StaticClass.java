package app.org.com.samples;

public class StaticClass {

	public static void main(String[] args) {
		SuperStaticClass A = new SuperStaticClass();
		SuperStaticClass B = new SubStaticClass();
		SubStaticClass C = new SubStaticClass();
        
		A.print();
        B.print();
        C.print();
        
        A.show();
        B.show();
        C.show();
        

	}
	
	public static class SuperStaticClass {
        static void print() {
            System.out.println("print in Super Static Class.");
        }
        
        public void show() {
            System.out.println("show in Super Static Class.");
        }
    }
	
    public static class SubStaticClass extends SuperStaticClass {
        
    	static void print() {
            System.out.println("print in Sub Static Class.");
        }
        
        public void show() {
            System.out.println("show in Sub Static Class.");
        }
    }

}
