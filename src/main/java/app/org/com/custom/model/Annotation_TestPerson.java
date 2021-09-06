package app.org.com.custom.model;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import app.org.com.custom.annotation.Age;
import app.org.com.custom.annotation.FutureAndWithinSevenDays;

public class Annotation_TestPerson {

    private String id;
   
    @FutureAndWithinSevenDays
    private String dateValue;
    
    @Age(value=18)
    private Date birthDate;
    
    private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//@FutureAndWithinSevenDays
	public String getDateValue() {
		return dateValue;
	}

	//@FutureAndWithinSevenDays
	public void setDateValue(String dateValue) {
		this.dateValue = dateValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Age(value=18)
	public Date getBirthDate() {
		return birthDate;
	}

	@Age(value=18)
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Person {");
		builder.append("id=").append(id)
		.append(", dateValue=").append(dateValue)
		.append(", name=").append(name)
		.append(", birthDate=").append(birthDate)
		.append("}");
		return builder.toString();
	}

	public static void main(String[] args) throws ParseException, NoSuchMethodException, SecurityException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

		String dateInString = "7-Jun-2013";
		Date date = formatter.parse(dateInString);
		
		Annotation_TestPerson person = new Annotation_TestPerson();
		person.setId("Id");
		person.setName("Name");
		person.setDateValue("20190821");
		person.setBirthDate(date);
		System.out.println(person.toString());
		
		Method m = person.getClass().getMethod("setBirthDate", Date.class); 
		Age manno=m.getAnnotation(Age.class);  
		System.out.println("value is: " + manno.value());  
	}
    
    
}
