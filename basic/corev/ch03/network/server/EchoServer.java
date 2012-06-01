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
				//Ŭ���̾�Ʈ�� ���� �����͸� �ޱ����� ��Ʈ��
				InputStream inStream = client.getInputStream();
				Scanner in = new Scanner(inStream);
				
				//Ŭ���̾�Ʈ�� �����͸� ������ ���� ��Ʈ��
				OutputStream outStream = client.getOutputStream();
				PrintWriter out = new PrintWriter(outStream, true);
				
				out.println("�ȳ��ϼ���. ����� \"bye\"�� �Է��ϼ���!");
				boolean done = false;
				
				while(!done && in.hasNextLine()){
					String line = in.nextLine();
					out.println("[����]"+line);
					if(line.trim().equals("bye")) done = true;
				}
			} finally {
				client.close();
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}
