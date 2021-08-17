package app.org.com.pattern.singleton;

public enum EnumSingleton {

	INSTANCE;

    public String doSomething(String str) { 

    	System.out.println("doSomething()");
    	this.something = str;
    	return this.something;
    }

    public synchronized String getSomething() { 
    
    	System.out.println("getSomething()");
    	return something; 
    }

    private String something;
}
