package core.adv.thread;

import java.io.IOException;

public class T01NonBlockIOTest {

	public static void main(String[] args) {
		System.out.println("Input from STD In");
		int inputByte = 0;
		try {
			while(inputByte != 'q') {
				inputByte = System.in.read();
				System.out.println("Read one byte! : "+(char)inputByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
