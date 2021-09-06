package app.org.com.pattern.singleton.models;


public class EntityManagerFactoryC {

	private String emc;
	
	public EntityManagerFactoryC(String str) {
		this.emc = str;
	}
	
	public EntityManagerC createEntityManager() {
		EntityManagerC emc = new EntityManagerC();
		return emc;
	}
	

}
