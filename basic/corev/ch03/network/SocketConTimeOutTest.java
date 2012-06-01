package corev.ch03.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketConTimeOutTest {
	public static void main(String[] args) {
		try {
			Socket s = new Socket();
			s.connect(new InetSocketAddress("time-a.timefreq.bldrdoc.gov", 13), 10000);
				
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
			System.out.println("Socket connection timed out!");
		} catch (IOException e) { e.printStackTrace(); }
		System.exit(0);
	}
}
