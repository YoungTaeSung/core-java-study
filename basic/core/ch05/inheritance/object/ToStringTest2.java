package core.ch05.inheritance.object;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Car {
	private String fName;
	private int fNumDoors;
	private Date fYearManufactured;
	private String fColor;
	private ArrayList<String> fOptions;
	
	public Car(String aName, int aNumDoors, Date aYearManufactured,
		String aColor, ArrayList<String> aOptions) {
		fName = aName;
		fNumDoors = aNumDoors;
		fYearManufactured = aYearManufactured;
		fColor = aColor;
		fOptions = aOptions;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		String newLine = System.getProperty("line.separator");
	
		result.append(this.getClass().getName());
		result.append(" Object {");
		result.append(newLine);
	
		Field[] fields = this.getClass().getDeclaredFields();
	
		for (Field field : fields) {
			result.append("  ");
			try {
				result.append(field.getName());
				result.append(": ");
				result.append(field.get(this));
			} catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");
		return result.toString();
	}
}

public class ToStringTest2 {
	public static void main(String[] arguments) {
		ArrayList<String> options = new ArrayList<String>();
		options.add("Air Conditioning");
		options.add("Leather Interior");

		Car van = new Car("Dodge", 4, new Date(), "Blue", options);
		System.out.println(van);
		System.exit(0);
	}
}
