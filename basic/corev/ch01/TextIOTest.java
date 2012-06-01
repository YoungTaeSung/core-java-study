package corev.ch01;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIOTest {
	public static void main(String[] args) {
		Employee[] empArray = new Employee[3];
		empArray[0] = new Employee("Sam", 2000, 1998, 10, 3);
		empArray[1] = new Employee("Bob", 1500, 2000, 2, 1);
		empArray[2] = new Employee("karl", 3500, 1990, 5, 3);
		
		try {
			FileWriter fw = new FileWriter("test.data");
			fw.close();
			PrintWriter pw = new PrintWriter(fw);
			
		} catch (IOException e) { e.printStackTrace(); }
		
		try {
			PrintWriter out = new PrintWriter("employee.data");
			writeData(empArray, out);
			out.close();
			
			Scanner in = new Scanner(new FileReader("employee.data"));
			Employee[] tmpArray = readData(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	public static void writeData(Employee[] staff, PrintWriter out) {
		out.println(staff.length);
		for(Employee e : staff)
			e.writeData(out);
	}
	public static Employee[] readData(Scanner in) {
		int nLine = in.nextInt();
		in.nextLine();
		
		Employee[] tmpArray = new Employee[nLine];
		for(int i=0; i < nLine; i++) {
			tmpArray[i] = new Employee();
			tmpArray[i].readData(in);
		}
		return tmpArray;
	}
}
