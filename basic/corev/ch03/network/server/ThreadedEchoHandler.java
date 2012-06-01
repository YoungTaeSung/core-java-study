package corev.ch03.network.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ThreadedEchoHandler implements Runnable {
	private Socket client;
	private int counter=0;
	
	public ThreadedEchoHandler(Socket incoming, int c) {
		client = incoming;
		counter = c;
	}
	@Override
	public void run() {
		try {
			try {
				InputStream inStream = client.getInputStream();
				Scanner in = new Scanner(inStream);
					
				OutputStream outStream = client.getOutputStream();
				PrintWriter out = new PrintWriter(outStream, true);
			
				out.println("["+counter+"]번째 클라이언트");
				out.println("안녕하세요. 종료시 \"bye\"를 입력하세요!");
				boolean done = false;
				
				while(!done && in.hasNextLine()){
					String line = in.nextLine();
					out.println("[서버]"+line);
					if(line.trim().equals("bye")) done = true;
				}
			} finally {
				client.close();
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}
