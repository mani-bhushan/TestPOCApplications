package app.org.com.dynamic.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedOrUncheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {

		uncheckedOrRunTime_isOk_withoutThrows_inMethodSignature(); 				// No Error
		complieTimeOrChecked_isOk_withThrows_inMethodSignature("s");			// No Error
		complieTimeOrChecked_isNotOk_withoutThrows_inMethodSignature("s"); 		// IsGivingError

	}

	public static int uncheckedOrRunTime_isOk_withoutThrows_inMethodSignature() {
		
		int d = 0;
		
		try {
			d = 4 / 0;
		} catch (Exception ex) {
			// throw ex;
			throw new ArithmeticException();
		}
		return d;
	}
	
	public static boolean complieTimeOrChecked_isOk_withThrows_inMethodSignature(String s) throws FileNotFoundException {

		try {
			FileInputStream GFG = new FileInputStream(s);
		} catch (FileNotFoundException ex) {
			// remove the comment to see // throw ex;
			throw new FileNotFoundException();
		}
		return true;
	}
	
	public static boolean complieTimeOrChecked_isNotOk_withoutThrows_inMethodSignature(String s) {

		try {
			FileInputStream GFG = new FileInputStream(s);
		} catch (FileNotFoundException ex) {
			ex.getCause(); 
			// remove the comment to see // throw ex;
			// remove the comment to see // throw new FileNotFoundException();
		}
		return true;
	}
}

