package core.ch04.cls;

public class RefVarField {
	public static void NotInit() {
		int x;
		String msg;
		//System.out.println(x);	//ERROR!!	
		//System.out.println(msg);  //ERROR!!
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.isCSMajor);
		System.out.println(s1.gender);
		System.exit(0);
	}
}
