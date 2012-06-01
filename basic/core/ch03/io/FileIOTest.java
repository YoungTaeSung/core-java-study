package core.ch03.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOTest {
	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		try {
			Scanner in = new Scanner(new File(dir+"\\data\\test.data"));
			PrintWriter out = new PrintWriter(dir+"\\data\\test.out");
			String tmpStr = null;
			
			System.out.println(dir);
			while(in.hasNext()) {
				tmpStr = in.nextLine();
				System.out.println(tmpStr);
				out.print(tmpStr);
			}
			in.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
