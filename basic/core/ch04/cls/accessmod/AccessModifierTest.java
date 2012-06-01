package core.ch04.cls.accessmod;

public class AccessModifierTest {
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		obj.x = 10;
		obj.y = 20;
		//obj.z = 30;	//ERROR!
		obj.m1();
		obj.m2();
		//obj.m3();	//ERROR!
		System.exit(0);
	}
}
