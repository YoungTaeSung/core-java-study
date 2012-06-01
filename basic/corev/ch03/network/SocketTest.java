package corev.ch03.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("time-a.timefreq.bldrdoc.gov", 13);
			try {
				InputStream inStream = s.getInputStream();
				Scanner in = new Scanner(inStream);
				
				while(in.hasNextLine()) {
					String line = in.nextLine();
					System.out.println(line);
				}
			} finally {
				s.close();
			}
		} catch (IOException e) { e.printStackTrace(); }
		System.exit(0);
	}
}
