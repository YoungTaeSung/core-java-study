package core.library.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindMaxFromFile {
	public static void main(String[] args) {
		String inFileName = System.getProperty("user.dir")+"\\data\\input.data";
		File inFile = new File(inFileName);
		
		try {
			Scanner in = new Scanner(inFile);
			int total = in.nextInt();
			System.out.println("Total #Lines = "+total);
			for(int i=0; i<total; i++) {
				System.out.println(i+", max="+findMax(in));
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
	public static int findMax(Scanner in) {
		int max = in.nextInt();
		int tmp = 0;
		for(int i=0; i<5; i++) {
			tmp = in.nextInt();
			if(max < tmp) max = tmp;
		}
		return max;
	}
}
