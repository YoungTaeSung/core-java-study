package core.ch06.interfaces;

import java.util.Arrays;

public class CmpEmployeeTest {
	public static void main(String[] args) {
		CmpEmployee[] empArray = new CmpEmployee[3];
		empArray[0] = new CmpEmployee("Sam", 2500, 2010, 10, 4);
		empArray[1] = new CmpEmployee("Bob", 3500, 2011, 1, 1);
		empArray[2] = new CmpEmployee("Karl", 1500, 1999, 8, 16);
		
		Arrays.sort(empArray);
		for(CmpEmployee i : empArray) {
			System.out.println(i.getSalary());
		}
		System.exit(0);
	}
}
