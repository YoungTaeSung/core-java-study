package core.ch04.cls;

public class ComputerTest {
	public static void main(String[] args) {
		Computer comp1 = new Computer(3);
		comp1.show();

		comp1.execute("Hangul");
		
		comp1.powerOn();
		comp1.execute("Hangul");
		comp1.execute("StarCraft");
		comp1.execute("Warcraft");
		
		comp1.powerOff();
		comp1.execute("Warcraft");
		
		comp1.powerOn();
		comp1.execute("Eclipse");
		comp1.powerOff();
		
		comp1.powerOn();
		comp1.execute("Window7");
		comp1.execute("VMWare");
		comp1.execute("SnowLeopard");
		comp1.execute("FreeBSD");
		comp1.powerOff();
		
		System.exit(0);
	}
}
