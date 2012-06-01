package corev.ch03.network.irsocket;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InterruptibleSocketFrame extends JFrame {
	public static final int WIDTH=300;
	public static final int HEIGHT=300;
	
	private Scanner in;
	private JButton interruptibleButton;
	private JButton blockingButton;
	private JButton cancelButton;
	private JTextArea messageArea;
	
	private TestServer server;
	private Thread connectThread;
	
	/*
	 * Constructor
	 */
	public InterruptibleSocketFrame() {
		setSize(WIDTH, HEIGHT);
		setTitle("Interruptible Server Socket Test");
		
		//ADD northPanel
		JPanel northPanel = new JPanel();
		interruptibleButton = new JButton("Interruptible");
		blockingButton = new JButton("Blocking");
		cancelButton = new JButton("Cancel");
		cancelButton.setEnabled(false);
		
		northPanel.add(interruptibleButton);
		northPanel.add(blockingButton);
		northPanel.add(cancelButton);
		add(northPanel, BorderLayout.NORTH);
		
		//ADD messageArea
		messageArea = new JTextArea();
		add(new JScrollPane(messageArea));
		
		//Main Job of This Frame
		server = new TestServer();
		new Thread(server).start();
		
		//ADD button click event handler
		interruptibleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				interruptibleButton.setEnabled(false);
				blockingButton.setEnabled(false);
				cancelButton.setEnabled(true);
				connectThread = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							connectInterruptibly();
						} catch (IOException e) {
							messageArea.append("\nInterruptibleSocketTest.connectInterruptibly: "+e);
						}
					}
				});
				connectThread.start();
			}
		});
		blockingButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				interruptibleButton.setEnabled(false);
				blockingButton.setEnabled(false);
				cancelButton.setEnabled(true);
				connectThread = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							connectBlocking();
						} catch (IOException e) {
							messageArea.append("\nInterruptibleSocketTest.connectBlocking: "+e);
						}
					}
				});
				connectThread.start();
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				connectThread.interrupt();
				cancelButton.setEnabled(false);
			}
		});
	}
	public void connectInterruptibly() throws IOException {
		
	}
	public void connectBlocking() throws IOException {
		
	}
	class TestServer implements Runnable {
		@Override
		public void run() {
			try {
				ServerSocket s = new ServerSocket(8189);
				while(true) {
					Socket client = s.accept();
					Runnable r = new TestServerClientHandler(client);
					Thread t = new Thread(r);
					t.start();
				}
			} catch (IOException e) { messageArea.setText("\nTestServer.run: "+e); }
		}
	}
	class TestServerClientHandler implements Runnable {
		private Socket incoming;
		private int count=0;
		
		public TestServerClientHandler(Socket s) { incoming = s; }
		@Override
		public void run() {
			try {
				OutputStream outStream = incoming.getOutputStream();
				PrintWriter out = new PrintWriter(outStream, true);
				while(count < 100) {
					count++;
					if(count <= 10) out.println(count);
					Thread.sleep(100);
				}
				incoming.close();
				messageArea.append("Closing server\n");
			} catch (Exception e) { 
				messageArea.append("\nTestServerClientHandler.run: "+e);
			}
		}		
	}
}