package app.org.com.dynamic.Exceptions;

public class ChildClassA extends ParentClassA {

	public void show() throws NullPointerException {
		try {
			System.out.print("Show : ParentClassA.show() must throw a upperlevel hierarchy of Exception Class");
			throw new NullPointerException();
		} catch (NullPointerException ioEx) {
			System.out.print("Show : IOException");
			throw ioEx;
		}
	}
}
