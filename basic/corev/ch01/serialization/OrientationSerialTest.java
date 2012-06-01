package corev.ch01.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OrientationSerialTest {
	public static void main(String[] args) {
		Orientation orientation = Orientation.HORIZONTAL;
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("orientation.dat"));
			out.writeObject(orientation);
			out.close();
		
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("orientation.dat"));
			Orientation restored = (Orientation)in.readObject();
			
			if(restored == orientation)
				System.out.println("Same Ori.");
			else
				System.out.println("Diff Ori.");
			
		} catch (Exception e) { e.printStackTrace(); }
		System.exit(0);
	}

}
