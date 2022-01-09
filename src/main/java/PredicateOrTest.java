import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateOrTest {

	public static void main(String[] args) {

		Predicate<Integer> p1 = number -> (number % 2 == 0);
		Predicate<Integer> p2 = number -> (number > 10);

		// number should be divisible by 2 or greater than 10
		System.out.println(p1.or(p2).test(11)); // true
		System.out.println(p1.or(p2).test(12)); // true

		List<String> names = Arrays.asList("Peter", "Martin", "Alex", "Philip", "Piyush", "Mike");

		Predicate<String> p3 = name -> name.equals("Martin");
		Predicate<String> p4 = name -> name.endsWith("p");
		

		// find a name starts with "A" or not ends with "p"
		names.stream()
		.filter(p3.or(p4))
		.forEach(System.out::println);
		
	}
}