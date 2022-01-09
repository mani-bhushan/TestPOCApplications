package app.org.com.accessmodifiers;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A2 extends A1 {

	protected int a;
	private int b;
	
	public static void print() {
		System.out.println("A2 print");
	}
	
	@Override
	public void show() {
		System.out.println("A2 show");
	}
	
	
	private void display() {
		System.out.println("A2t display");
	}
	
	public String m1() {
		return "B -> m1()";
	}

//	void m2() throws IOException {
//		System.out.println("In m1 A");
//	}
	
	
}