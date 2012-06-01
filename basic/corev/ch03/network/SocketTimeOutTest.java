package corev.ch03.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTimeOutTest {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("time-a.timefreq.bldrdoc.gov", 13);
			s.setSoTimeout(10000);
			
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
		} catch (InterruptedIOException e) {
			//react to timeout
		} catch (IOException e) { e.printStackTrace(); }
		System.exit(0);
	}
}
