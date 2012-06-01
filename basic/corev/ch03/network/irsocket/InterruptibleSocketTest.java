package corev.ch03.network.irsocket;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class InterruptibleSocketTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame mainFrame = new InterruptibleSocketFrame();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
	}
}
