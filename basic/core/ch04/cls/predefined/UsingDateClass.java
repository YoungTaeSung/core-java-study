package core.ch04.cls.predefined;

import java.util.Date;

public class UsingDateClass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date currentDay = new Date();
		System.out.println(currentDay.toGMTString());
		System.out.println(currentDay.toString());
		System.exit(0);
	}
}
