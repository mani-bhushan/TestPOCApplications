package app.org.com.util;

import java.util.HashMap;
import java.util.Map;

public enum AppElements {

	EMPLOYEE_DB_EXCEPTION("Employee DB Exception", 7001, "Emp_01"),
	ALREADY_EXISTING_EMPLOYEE("Already Existing Employee", 7001, "Emp_02");


	private static final Map<Integer, AppElements> BY_CODE = new HashMap<>();
	private static final Map<String, AppElements> BY_MESSAGE = new HashMap<>();
	private static final Map<String, AppElements> BY_ID = new HashMap<>();

	static {
		for (AppElements ae : values()) {
			BY_MESSAGE.put(ae.message, ae);
			BY_CODE.put(ae.code, ae);
			BY_ID.put(ae.id, ae);
		}
	}

	public final String message;
	public final int code;
	public final String id;

	private AppElements(String message, int code, String id) {
		this.message = message;
		this.code = code;
		this.id = id;
	}

	public static AppElements valueOfMessage(String message) {
		return BY_MESSAGE.get(message);
	}

	public static AppElements valueOfCode(int code) {
		return BY_CODE.get(code);
	}
	
	public static AppElements valueOfId(String id) {
		return BY_ID.get(id);
	}
	
	/**
	 * Return a string representation of this status code.
	 */
	@Override
	public String toString() {
		return "Code: " + this.code 
				+ ", Message: " + this.message 
				+ ", ID: " + this.id
				+ ", Name: " + name();
	}

}
