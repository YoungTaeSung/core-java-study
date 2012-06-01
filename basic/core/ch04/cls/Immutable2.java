package core.ch04.cls;

public class Immutable2 {
	private final int id;
	private final BirthDate birthDate;

	public Immutable2(int ssn, int year, int month, int day) {
		id = ssn;
	    birthDate = new BirthDate(year, month, day);
	}
	public int getId() {
		return id;
	}
	public BirthDate getBirthDate() {
		return birthDate;
	}
}
class BirthDate {
	private int year, month, day;
	
	public BirthDate() {
		year = 2011; month = 1; day = 1;
	}
	public BirthDate(int y, int m, int d) {
		year=y; month=m; day=d;
	}
	public void setDay(int newDay) {
		day = newDay;
	}
	public void showBirthDate() {
		System.out.println("Year: "+year+" Month: "+month+" Day: "+day);
	}
}