package app.org.com.pattern.singleton;

import java.lang.reflect.Constructor;

public class BillPughSingleton_Reflection_Test {
	
	public static void main(String[] args) {
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = null;
		try {
			Constructor[] cstr = BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : cstr) {
				// Setting constructor accessible
				constructor.setAccessible(true);
				instance2 = (BillPughSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}


}
