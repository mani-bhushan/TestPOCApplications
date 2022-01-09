package app.org.com.samples;

@FunctionalInterface
interface GfG1 {

	public void printing();
	
	default void display() {
		System.out.println("GfG1.interface -> display()");
	}

	static public void show() {
		System.out.println("GfG1.interface -> show() -> Interface objects are unable to call static methods.");
	}
}