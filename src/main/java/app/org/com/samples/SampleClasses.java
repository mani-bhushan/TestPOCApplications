package app.org.com.samples;

public class SampleClasses implements GfG1, GFG2 {

//  Interface default methods are Overridden
	@Override
	public void display() {

		GfG1.super.display();

		GFG2.super.display();
	}

//	public static void main(String args[]) {
//		SampleClasses obj = new SampleClasses();
//		obj.display();
//	}
	
	// @Override can't be used on static methods
	public static void show(Object obj) {
		StringBuilder sb = new StringBuilder();
		if (obj instanceof SampleClasses) {
			sb.append("Objects of concrete class can also call static methods and");
		}
		sb.append("@Override cannot be used on static methods.");
		System.out.println(sb.toString());
	}

	@Override
	public void printing() {
		System.out.println("SampleClasses.class -> printing() -> Overridden method.");
	}
}

class SampleClasses1 { }

final class SampleClasses2 { }

abstract class SampleClasses3 { }

class SampleClasses4 { }

final class SampleClasses5 { }

abstract class SampleClasses6 { }


/**
 * 
 *
 * The public type SampleClasses7 must be defined in its own file
 *
 * Illegal modifier for the class SampleClasses8; 
 * only public, abstract & final are permitted
 *
 *
 */

// public class SampleClasses7 { }
// private class SampleClasses8 { }


class A1 {
	public void printM() {
		 System.out.println("Inside A1");
	 }
}

class B1 extends A1 {
	public void printM() {
		 System.out.println("Inside B1: printM()");
	 }
	
	public void anotherM() {
		 System.out.println("Inside B1: anotherM()");
	 }
}

