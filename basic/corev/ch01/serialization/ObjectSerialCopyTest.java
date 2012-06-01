package corev.ch01.serialization;

public class ObjectSerialCopyTest {
	public static void main(String[] args) {
		EmployeeSC harry = new EmployeeSC("Harray", 2000, 1999, 12, 12);
		EmployeeSC harryClone = (EmployeeSC)harry.clone();
		
		harry.raiseSalary(20);
		
		System.out.println(harry);
		System.out.println(harryClone);
		
		System.exit(0);
	}
}
