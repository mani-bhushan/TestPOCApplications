package app.org.com.pattern.singleton;

import app.org.com.pattern.singleton.models.EntityManagerC;
import app.org.com.pattern.singleton.models.EntityManagerFactoryC;
import app.org.com.pattern.singleton.models.PersistenceC;

public enum EnumSingleton_ConnectionManager {

	/**
	 * Read more : 
	 * https://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html#ixzz75LEyMI8r
	 */
	INSTANCE,
	//EntityManagerFactoryC
	;

	private EntityManagerFactoryC emf;

	private EnumSingleton_ConnectionManager() {
		emf = PersistenceC.createEntityManagerFactory("cassandra_pu");
	}

	public EntityManagerC getEntityManager() {
		return emf.createEntityManager();
	}

}
