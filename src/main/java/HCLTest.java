import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Find the non-repeating character in an array. 
 * Chandan --> chd
 *
 */
public class HCLTest {
	
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		String st = "Chandan";
		Set<String> setV = new HashSet<String>();
		
		for (int i=0; i<st.length(); i++) {
			if (!setV.contains(st.charAt(i))) {
				setV.add(st.charAt(i)+"");
			}
		} 
		
		System.out.print(setV.toString());
		
		Map mapA = new HashMap<>(); 
		//Collections.sort(mapA,"");
	}
	
//	public enum EnumSingleton () {
//		
//		Instance = EnumSingleton.getInstance();
//		
//		getInstance() {
//			Instance = new EnumSingleton();
//		}	
//		
//	}
//
//	Strin s= "some";
//	Strin d = s;
//	if (s.equas(s))
}
