package app.org.com.pattern.singleton;

import app.org.com.ds.algos.PrimeNumbers;

public enum EnumSingleton {

	INSTANCE;
	
	private String something;
	private PrimeNumbers prime;

	public synchronized String getSomething() { 
		setSomething("Hello");
    	return something; 
    }
	
	public synchronized PrimeNumbers getPrime() { 
		this.prime = new PrimeNumbers();
    	return prime; 
    	// https://www.youtube.com/watch?v=YOi5i-93lgo
    }

	private void setSomething(String str) {
		EnumSingleton.INSTANCE.something=str;
	}

}