package core.library.file;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReplaceAndNewFile {
	public static String readInput() {
		return JOptionPane.showInputDialog("Enter: FileName, oldText, newText");
	}
	public static void main(String[] args) throws Exception {
		String[] inputStrArray = readInput().split(" ");
		String userDir = System.getProperty("user.dir");
		
		if(inputStrArray.length != 4) {
			System.out.println("Input Error!");
			System.exit(0);
		}
		File sourceFile = new File(userDir+"\\data\\"+inputStrArray[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + inputStrArray[0] + " does not exist");
			System.exit(0);
		}

		File targetFile = new File(userDir+"\\data\\"+inputStrArray[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + inputStrArray[1] + " already exists");
			System.exit(0);
		}

		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(targetFile);

		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(inputStrArray[2], inputStrArray[3]);
			output.println(s2);
		}
		input.close();
		output.close();
		System.out.println("Replace Done!!");
		System.exit(0);
	}
}
