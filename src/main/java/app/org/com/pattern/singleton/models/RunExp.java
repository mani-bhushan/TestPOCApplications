package app.org.com.pattern.singleton.models;

import app.org.com.pattern.singleton.EnumSingleton_ConnectionManager;

public class RunExp extends Thread {    
    public void run()  
    {    
        System.out.println("running...");   
        System.out.println(EnumSingleton_ConnectionManager.INSTANCE.getEntityManager().hashCode());
        
    }      
}
