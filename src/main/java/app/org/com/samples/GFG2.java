package app.org.com.samples;

@FunctionalInterface
interface GFG2 {
	
	public void printing();

	default void display() {
		System.out.println("GfG2.interface -> display()");
	}

	static public void show() {
		System.out.println("GfG2.interface -> show() -> Interface objects are unable to call static methods.");
	}
}