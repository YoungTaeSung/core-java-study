package core.ch04.cls;

public class CopyConPersonTest {
	public static void main(String[] args) {
		CopyConPerson p1 = new CopyConPerson("YoungTae", 36, "Male", "FeMale", 25, "Jin");
		CopyConPerson p2 = new CopyConPerson("DooYoung", 20, "Male", "Male", 30, "Park");
		p1.show();
		p2.show();
		
		CopyConPerson p3 = new CopyConPerson(p1);
		p3.show();
		
		if(p1==p3) {
			System.out.println("Same Person");
		}
		
		CopyConPerson p4 = CopyConPerson.getInstance(p2);
		p4.show();
		if(p2==p4) {
			System.out.println("Same Person2");
		}

		p1.talkWith(p2);
		p1.show();
		p2.show();
		
		System.exit(0);
	}
}
