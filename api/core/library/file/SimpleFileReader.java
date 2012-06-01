package core.library.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReader {
	public static void main(String[] args) {
		String inFileName = System.getProperty("user.dir")+"\\data\\test.in";
		try {
			Scanner reader = new Scanner(new File(inFileName));
			while(reader.hasNext()) {
				System.out.println(reader.next());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
