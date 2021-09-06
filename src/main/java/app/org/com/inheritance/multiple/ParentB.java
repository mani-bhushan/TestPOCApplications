package app.org.com.inheritance.multiple;

public interface ParentB {
	
	public String useCaseB();
	
	public default void show() {
		System.out.println("Show : ParentB");
	}
	public static void displayB() {
		System.out.println("display : ParentB");
	}

}
