package core.ch04.cls;

public class StaticTest {
	public int i = 5;
	public static int j = 10;
	
	public static void main(String[] args) {
		//int m = i;	//ERROR!	
		int n = j;
		System.out.println("N="+n);
		
		staticMethod();
		//nonStaticMethod();	//ERROR!
		
		System.exit(0);
	}
	//non-static method
	public static void staticMethod() {
		//System.out.println(i+j);	//ERROR!
	}
	//non-static method
	public void nonStaticMethod() {
		System.out.println(i+j);
	}
}
