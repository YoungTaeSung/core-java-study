package core.ch04.cls.problem;

public class Student {
	private int std_id;
	
	public Student() {}
	public Student(int stdNumber) {
		std_id = stdNumber;
	}
	public void setStudentNumber(int stdNum) { std_id = stdNum; }
	public int getStudentNumber() { return std_id; }
	public String toString() {
		return "Student<ID:"+std_id+">";
	}
	public void show() {
		System.out.println(this);
	}
	public void visitAndCheckCabinet(Cabinet cabinet) {
		if(cabinet.getCabNumber() % this.getStudentNumber() == 0) {
			if(cabinet.isOpen()) cabinet.closeCabinet();
			else cabinet.openCabinet();
		}
	}
}
