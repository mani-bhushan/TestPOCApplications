package app.org.com.pattern.singleton;

import app.org.com.pattern.singleton.models.EntityManagerC;
import app.org.com.pattern.singleton.models.RunExp;

public class EnumSingleton_Test {

	public static void main(String[] args) throws InterruptedException {
	    System.out.println(EnumSingleton.INSTANCE);
	    System.out.println(EnumSingleton.INSTANCE.getSomething());
	    
	    
	    System.out.println(EnumSingleton_ConnectionManager.INSTANCE.getEntityManager().hashCode());
	    EntityManagerC v1 = EnumSingleton_ConnectionManager.INSTANCE.getEntityManager();
	    EntityManagerC v2 = EnumSingleton_ConnectionManager.INSTANCE.getEntityManager();
	    EntityManagerC v3 = EnumSingleton_ConnectionManager.INSTANCE.getEntityManager();
	    
	    System.out.println(v1.equals(v2));
	    System.out.println(v1.equals(v3));
	    System.out.println(v3.equals(v2));
	    System.out.println(v1.hashCode() + " : " + v2.hashCode() + " : " + v3.hashCode());
	    
	    RunExp rt1 = new RunExp();    
        // It does not start a separate call stack   
        rt1.run();
        rt1.sleep(3000);
        
        RunExp rt2 = new RunExp();
        rt2.run();
        rt2.sleep(3000);
	}
}
