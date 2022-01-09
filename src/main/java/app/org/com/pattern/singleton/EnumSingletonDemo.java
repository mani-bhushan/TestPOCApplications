package app.org.com.pattern.singleton;

public class EnumSingletonDemo {

	public static void main(String[] args) {
		/*
		 * ABC obj1 = ABC.INSTANCE; obj1.i = 5; obj1.show("obj1");
		 * 
		 * ABC obj2 = ABC.INSTANCE; obj2.i = 7; obj2.show("obj2");
		 */

		Direction d1 = Direction.getInstance("W");
		System.out.println(d1.value());
		System.out.println(d1.name());

		Address address = Address.getInstance("Badka Bajrang Bali", "Giridih", "Jharkhand");
		address.show();
		address.toString();

		Address address1 = Address.INSTANCE1;
		address1.show();
		address1.toString();
		
		Address address2 = Address.INSTANCE2;
		address2.show();
		address2.toString();
		
		Address address3 = Address.INSTANCE3;
		address3.show();
		address3.toString();
		
		Object obj = null;
		String str = "Hello";
		String st = null;
		Object obj1 = st;
		printMsg(null);
		printMsg(obj);
		printMsg(str);
		printMsg(st);
		printMsg(obj1);
		st = (String) obj;
		printMsg(st);
	}
	
	public static void printMsg(Object obj) {
		System.out.println("object");		
	}
	
	public static void printMsg(String obj) {
		System.out.println("String");		
	}
	
	/*
	 * public enum ABC {
	 * 
	 * INSTANCE;
	 * 
	 * int i;
	 * 
	 * public void show(String str) { System.out.println(str + " : i : " + i); } }
	 */
	
	public enum Direction {
		
		//Set e = new HashSet<>();
		
	    North("N"), South("S"), East("E"), West("W"), AskGoogle("AskGoogle");
	  
	    private final String val;
	    
	    private Direction (String val) {
	        this.val = val;
	    }
	  
	    public String value(){
	        return val;
	    }
	  
	    public static Direction getInstance(String c){
	        Direction direction;
	        switch(c){
	            case "N": direction = North; break;
	            case "S": direction = South; break;
	            case "E": direction = East; break;
	            case "W": direction = West; break;
	            default: direction = AskGoogle; break;
	        }
	        return direction;
	    }
	    
	    public void show () {
			System.out.println(val);
		}
	}
	
	public enum Address {
		  
		INSTANCE1(""), INSTANCE2("",""), INSTANCE3("","","");
		
		private String addLine1; 
		private String city;
		private String state;
	  
	    
	    private Address (String addLine1, String city, String state) {
	        this.addLine1 = addLine1;
	        this.city = city;
	        this.state = state;
	    }
	    
		private Address(String addLine1) {
			this.addLine1 = addLine1;
		}
		
		private Address(String addLine1, String city) {
			this.addLine1 = addLine1;
			this.city = city;
		}

		
	    public String value(){
	        return addLine1;
	    }
	  
	    public static Address getInstance(String addLine1, String city, String state) {
	    	Address address = INSTANCE3;
	    	address.addLine1 = addLine1;
	    	address.city = city;
	    	address.state = state;
	    	return address;
	    }
	    
	    public void show () {
			System.out.println(addLine1 + " -> " + city + " -> " + state);
		}
	    
	    public String toString() {
	    	String value =  "{\n address Line : " + this.addLine1 + "\n city : " + this.city + "\n state : " + this.state + "\n}";
	    	System.out.println(value);
	    	return value;
	    }
	}

}
