package core.project.aquarium;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AquariumTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame aquarium = new Aquarium();
				aquarium.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				aquarium.setVisible(true);
				
//				aquarium.addWindowListener(new WindowAdapter(){
//					public void windowClosing(WindowEvent windowEvent){
//						System.exit(0);
//					}
//				});
			}
		});
	}

}
