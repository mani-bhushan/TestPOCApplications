package app.org.com.dynamic.Exceptions;

import java.io.IOException;

public class ChildClass extends ParentClass {
	
	public void show() throws IOException {
		try {
			System.out.print("Show : ParentClass.show() must throw a upperlevel hierarchy of Exception Class");
			throw new IOException();
		} catch (IOException ioEx) {
			System.out.print("Show : IOException");
			throw ioEx;
		}
	}

}
