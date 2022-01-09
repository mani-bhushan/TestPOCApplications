package app.org.com.samples;

import java.util.Objects;

public class EmployeeObj {
	Integer id;
	String name;
	Integer sal;
	
	public EmployeeObj () {
		
	}
	
	public EmployeeObj (Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public EmployeeObj (Integer id, String name, Integer sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}

	@Override public int hashCode() { return Objects.hash(id, name, sal); }
	  
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (!(obj instanceof EmployeeObj)) return false; EmployeeObj other =
	  (EmployeeObj) obj; return Objects.equals(id, other.id) &&
	  Objects.equals(name, other.name) && Objects.equals(sal, other.sal); }
	 
	
	
}
