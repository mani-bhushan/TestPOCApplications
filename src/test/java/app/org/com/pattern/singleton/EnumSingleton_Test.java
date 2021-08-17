package app.org.com.pattern.singleton;

public class EnumSingleton_Test {

	public static void main(String[] args) {
	    System.out.println(EnumSingleton.INSTANCE);
	    System.out.println(EnumSingleton.INSTANCE.doSomething("My EnumSingletonTest"));
	    System.out.println(EnumSingleton.INSTANCE.getSomething());
	}

}
