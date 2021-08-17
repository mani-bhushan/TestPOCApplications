package app.org.com.dynamic.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class MultipleExceptions {

	public static void main(String[] args) {
		List<String> employee = new ArrayList<String>();
		employee.add("emp1");
		employee.add("emp2");
		employee.add("emp3");
		employee.add(null);
		employee.add("emp4");
		employee.add(null);
		employee.add("7");

		List<String> msg = new ArrayList<String>();
		
		for (String emp : employee) {
			try {
				System.out.println(emp.length());
			} catch (Exception ex) {
				msg.add(ex.toString());
				//System.out.println(ex.getMessage());
			}
		}
		msg.forEach(System.out::println);
	}

}
