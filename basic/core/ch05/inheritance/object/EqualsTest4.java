package core.ch05.inheritance.object;

class MyCar {
	private String manufacture;
	public MyCar(String _manufact) { manufacture=_manufact; }
	@Override
	public boolean equals(Object other) {
		if(this == other) { return true; }
		if(other == null) { return false; }
		
		//check actual object type
		System.out.println("Obj1="+this.getClass().getName());
		System.out.println("Obj2="+other.getClass().getName());
		if(this.getClass() != other.getClass()) { return false; }
		
		MyCar otherCar = (MyCar)other;
		return manufacture.equals(otherCar.manufacture);
	}
}
class Bike extends MyCar {
	private int manu_year;
	public Bike(String _menufact, int _menu_year) {
		super(_menufact);
		manu_year = _menu_year;
	}
	@Override
	public boolean equals(Object other) {
		if(!super.equals(other)) { return false; }
		return manu_year==((Bike)other).manu_year;
	}
}
public class EqualsTest4 {
	public static void main(String[] args) {
		MyCar c1 = new MyCar("Hyundai");
		MyCar c2 = new MyCar("Hyundai");
		checkEquality(c1, c2);
		checkEquality(c1, new MyCar("Audi"));
		Bike b1 = new Bike("BMW", 1999);
		Bike b2 = new Bike("BMW", 1999);
		checkEquality(b1, b2);
		
		checkEquality(c1, b1);
		
		System.exit(0);
	}

	private static void checkEquality(MyCar c1, MyCar c2) {
		if(c1.equals(c2)) {
			System.out.println("equals() OK");
		} else {
			System.out.println("equals() NOT OK");
		}
		
	}

}
