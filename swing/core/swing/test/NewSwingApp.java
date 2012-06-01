package core.swing.test;

import javax.swing.*;

public class NewSwingApp extends JFrame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewSwingApp inst = new NewSwingApp();
				inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
}
