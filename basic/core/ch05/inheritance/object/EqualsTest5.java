package core.ch05.inheritance.object;

class Device {
	private String name;
	public Device(String _name) { name=_name; }
	@Override
	public boolean equals(Object other) {
		if(this==other) { return true; }
		if(other == null) { return false; }
		if(this.getClass() != other.getClass()) { return false; }
		Device dev = (Device)other;
		return this.name.equals(dev.name);
	}
}
class MobileDevice extends Device {
	private boolean is_android_os;
	public MobileDevice(String _name, boolean _is_android_os) {
		super(_name);
		is_android_os = _is_android_os;
	}
	@Override
	public boolean equals(Object other) {
		if(!super.equals(other)) { return false; }
		return is_android_os==((MobileDevice)other).is_android_os;
	}
}
public class EqualsTest5 {
	public static void checkEqualityCond1(Device d1, Device d2) {
		if(d1.equals(d2) && d2.equals(d1)) {
			System.out.println("Condition PASS!");
		} else {
			System.out.println("Contition FAILED!");
		}
	}
	public static void checkEqualityCond2(Device d1, Device d2) {
		checkEqualityCond1(d1, d2);
	}
	public static void checkEqualityCond3(Device d1, Device d2, Device d3) {
		if(d1.equals(d2) && d2.equals(d3) && d1.equals(d3)) {
			System.out.println("Condition3 PASS!");
		} else {
			System.out.println("Condition3 FAILED!");
		}
	}
	public static void checkEqualityCond5(Device d1) {
		if(!d1.equals(null)) {
			System.out.println("Condition5 PASS!");
		} else {
			System.out.println("Condition5 FAILED!");
		}
	}
	public static void main(String[] args) {
		Device dev1 = new Device("Drill");
		Device dev2 = new Device("Drill");
		Device dev3 = new Device("Drill");
		
		//check condition#1 x.equals(x)
		checkEqualityCond1(dev1, dev1);
		//check condition#2 x.equals(y) && y.equals(x)
		checkEqualityCond1(dev1, dev2);
		//check condition#3 x.equals(y) && y.equals(z) then x.equals(z)
		checkEqualityCond3(dev1, dev2, dev3);
		//check condition#4 SKIP
		//check condition#5 x.equals(null)
		checkEqualityCond5(dev1);
		System.exit(0);
	}
}
