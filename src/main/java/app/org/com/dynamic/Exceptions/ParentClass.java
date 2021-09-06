package app.org.com.dynamic.Exceptions;

import java.io.IOException;

public class ParentClass {

	public void show() throws IOException {
		try {
			System.out.print("Show : ParentClass");
			throw new IOException();
		} catch (IOException ioEx) {
			System.out.print("Show : IOException");
			throw ioEx;
		}
	}
}
