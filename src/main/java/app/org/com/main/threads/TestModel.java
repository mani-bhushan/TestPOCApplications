package app.org.com.main.threads;

public class TestModel extends Thread {
	
	static volatile int volatileVar = 5; 
	static int var = 5; 
	
	public TestModel(int volatileVar, int var) {
		this.var = var;
		this.volatileVar = volatileVar;
	} 
	
	@Override  
	public void run() {
		System.out.println("[Thread " + Thread.currentThread().getId() + "] : Var -> " + this.var);
		System.out.println("[Thread " + Thread.currentThread().getId() + "] : Volatile Var -> " + this.volatileVar);
	}

}
