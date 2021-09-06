package app.org.com.inheritance.multiple;

public interface ParentA {

	public String useCaseA();
	
	public default void show() {
		System.out.println("Show : ParentA");
	}
	public static void displayA() {
		System.out.println("display : ParentA");
	}
}
