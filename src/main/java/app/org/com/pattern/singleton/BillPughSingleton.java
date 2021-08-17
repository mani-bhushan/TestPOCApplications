package app.org.com.pattern.singleton;

/**
 * 
 * @author root@manish
 * 
 * When you run the above class, 
 * you will notice that the hashCode of both the instances is not same, 
 * which destroys the singleton pattern.
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {
		// private constructor
	}

	// static inner class - inner classes are not loaded until they are
	// referenced.
	private static class Holder {
		private static BillPughSingleton logger = new BillPughSingleton();
	}

	// global access point
	public static BillPughSingleton getInstance() {
		return Holder.logger;
	}

	// Other methods

}