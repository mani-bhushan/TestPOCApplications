package app.org.com.accessmodifiers;

import java.io.FileNotFoundException;

public class A1 {
	
	public int x;
	private int y;
	protected int z;

	public static void print() {
		System.out.println("A1 print");
	}
	
	public void show() {
		System.out.println("A1 show");
	}
	
	private void display() {
		System.out.println("A1 display");
	}
	
	public String m1() {
		return "";
	}
	
	void m2() throws FileNotFoundException {
		System.out.println("In m1 A");
	}
}