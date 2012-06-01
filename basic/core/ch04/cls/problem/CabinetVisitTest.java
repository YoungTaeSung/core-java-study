package core.ch04.cls.problem;

public class CabinetVisitTest {
	public static void main(String[] args) {
		Cabinet c1 = new Cabinet(1);
		c1.show();
		c1.openCabinet();
		c1.show();
		
		Cabinet[] cabinets = new Cabinet[100];
		Student[] students = new Student[100];
		
		for(int i=0; i < 100; i++) {
			cabinets[i] = new Cabinet(i+1);
			students[i] = new Student(i+1);
//			cabinets[i].show();
//			students[i].show();
		}
		
		//For each cabinets, Student visit each cabinet
		for(int i=0; i < 100; i++) {
			for(int j=0; j<100; j++) {
				students[i].visitAndCheckCabinet(cabinets[j]);
			}
		}
		int totalOpendCab = 0;
		
		for(int i=0; i<100; i++) {
			//cabinets[i].show();
			if(cabinets[i].isOpen()) {
				System.out.println((i+1)+"cap open");
				totalOpendCab++;
			}
		}
		System.out.println("Total number of OP CAB="+totalOpendCab);
		System.exit(0);
	}
}
