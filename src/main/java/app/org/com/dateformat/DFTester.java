package app.org.com.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DFTester {

	private SimpleDateFormat logDateFormat;
	private Date logDate;
	
	
	private DFTester() throws ParseException {
		
//		this.logDateFormat= ConcurrentDateFormat.getThreadLocalSimpleDateFormat("yyMM");
//		this.logDate = this.logDateFormat.parse("2112");
		
		this.logDateFormat= ConcurrentDateFormat.getThreadLocalSimpleDateFormat("dd.MM.yyyy|HH:mm:ss|SSS");
		this.logDate = this.logDateFormat.parse("24.4.2021|21:21:21|000Z");
		
		System.out.println(this.logDate);
		System.out.println(this.logDateFormat.format(logDate));
	}
	public static void main(String[] args) throws ParseException {
		DFTester dfTester = new DFTester();
	}

}
