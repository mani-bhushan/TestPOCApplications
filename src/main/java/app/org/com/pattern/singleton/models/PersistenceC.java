package app.org.com.pattern.singleton.models;


public class PersistenceC {
	
	public static EntityManagerFactoryC emf;
	
	public static EntityManagerFactoryC createEntityManagerFactory(String str) {
		emf = new EntityManagerFactoryC(str); 
		System.out.println(str);
		return emf;
	}
}
