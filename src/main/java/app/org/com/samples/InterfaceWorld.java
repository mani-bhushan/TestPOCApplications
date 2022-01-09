package app.org.com.samples;

public class InterfaceWorld {

	public static void main(String[] args) {

		GfG1 obj1 = () -> System.out.println("Printing method of GfG1 interface.");
		obj1.printing();
		obj1.display();
		// obj2.show(); interface objects are unable to call static methods.
		GfG1.show();
		System.out.println();

		GFG2 obj2 = () -> System.out.println("Printing method of GFG2 interface.");
		obj2.printing();
		obj2.display();
		// obj2.show(); interface objects are unable to call static methods.
		GFG2.show();
		System.out.println();

		SampleClasses obj3 = new SampleClasses();
		obj3.printing();
		obj3.display();
		obj3.show(obj3);
		SampleClasses.show(null);
		
		try {
			int a = 10/0;
			String s = null;
			s.length();
		} catch(Exception ex) {
			
		}
		
		A1 a1 = new A1();
		B1 b1 = new B1();
		// B1 b2 = new A1(); add cast to B2
		A1 a2 = new B1(); 
		
		a1.printM();
		a2.printM();
		
		// a1.anotherM(); not in the access scope of a1 as A1 is the parent of B1 and method anotherM() is in the child scope.
		
		b1.printM();
		b1.anotherM();
		
	}
	
	@SuppressWarnings("finally")
	public int checkFinally() {
		try {
			 return 10;
		}
		catch (Exception ex) {
			return 20;
		}
		finally { 
			return 30;
		}
		
		// return 40; unreachable code
	}
}
