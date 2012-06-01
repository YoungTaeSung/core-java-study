package corev.ch03.network.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8189);	
			Socket client = server.accept();
			
			try {
				//클라이언트로 부터 데이터를 받기위한 스트림
				InputStream inStream = client.getInputStream();
				Scanner in = new Scanner(inStream);
				
				//클라이언트로 데이터를 보내기 위한 스트림
				OutputStream outStream = client.getOutputStream();
				PrintWriter out = new PrintWriter(outStream, true);
				
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
