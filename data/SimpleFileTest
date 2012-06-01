package core.library.file;

import java.io.File;

public class SimpleFileTest {
	public static void main(String[] args) {
		String work_dir = System.getProperty("user.dir");
		File file = new File(work_dir+"\\data\\test.in");
		System.out.println("File Name: " + file);
		
		System.out.println("Does it exist?	" + file.exists());
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it a hidden? " + file.isHidden());
		
		System.exit(0);
	}
}
