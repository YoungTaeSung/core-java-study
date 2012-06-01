package core.library.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimpleFileWriter {
	public static void main(String[] args) {
		String outFileName = System.getProperty("user.dir")+"\\data\\test.out";
		File outFile = new File(outFileName);
		
		try {
			PrintWriter writer = new PrintWriter(outFile);
			writer.print("This is Simple Text File");
			writer.println(", PrintWriter Testing!");
			writer.printf("%d %d %d", 2011, 7, 1);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
