package corev.ch03.network.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedEchoServer {
	public static void main(String[] args) {
		try {
			int i=1;
			ServerSocket server = new ServerSocket(8189);
			
			while(true) {
				Socket client = server.accept();
				Runnable r = new ThreadedEchoHandler(client, i);
				Thread t = new Thread(r);
				t.start();
				i++;
			}
		} catch (IOException e) {e.printStackTrace(); }
	}
}
