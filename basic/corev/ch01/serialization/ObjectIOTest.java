package corev.ch01.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTest {
	public static void main(String[] args) {
		Employee sam = new Employee("Sam", 2000, 2011,12,1);
		
		Manager tony = new Manager("Tony", 3000, 1999, 1, 1);
		tony.setSecretary(sam);
		
		Manager bob = new Manager("Bob", 5000, 1990, 11, 5);
		bob.setSecretary(sam);
		
		Employee[] staff = new Employee[3];
		staff[0] = sam;
		staff[1] = tony;
		staff[2] = bob;
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employeeobj.dat"));
			out.writeObject(staff);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeeobj.dat"));
			Employee[] tmpStaff = (Employee[])in.readObject();
			in.close();
			
			for(Employee e : tmpStaff)
				System.out.println(e);
		} catch (Exception e) { e.printStackTrace(); }
		System.exit(0);
	}
}
