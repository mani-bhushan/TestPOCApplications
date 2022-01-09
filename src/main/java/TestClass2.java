import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestClass2 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Jack 1"));
		empList.add(new Employee(2, "Jack 2"));
		empList.add(new Employee(3, "Jack 3"));

		empList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList()).forEach(Employee::toString);
		
		
	}
	

}

class Employee {
	
	Integer id;
	String name;
	
	public Employee () {
		
	}
	
	public Employee (Integer id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (name != null)
			builder.append("name=").append(name);
		builder.append("]");
		System.out.println(builder.toString());
		return builder.toString();
	}
	
	
}
