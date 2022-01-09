import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class  User {
	
	private Integer id;
	private String name;
	
	public User(Integer id, String name) {
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
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		
		User u1= new User(1, "u1");
		User u2= new User(2, "u2");
		User u3= new User(3, "u3");
		
		List<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		
		userList.stream().map((u)-> {u.setName(u.getName()+"u"); return u;}).forEach(System.out::println);
		
	}
}