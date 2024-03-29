package core.ch14.thread.bounceball.version1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bounce {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame mainFrame = new BounceFrame();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
	}
}
class BounceFrame extends JFrame {
	private BallComponent comp;
	public static final int DEFAULT_WIDTH=450;
	public static final int DEFAULT_HEIGHT=350;
	public static final int STEPS=500;
	public static final int DELAY=3;
	
	public BounceFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle("Bounce Ball Program for Test Thread");
		
		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();		
			}
		});
		addButton(buttonPanel, "Close", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(buttonPanel, BorderLayout.SOUTH);
		System.out.println("Frame: "+Thread.currentThread().getName());
	}
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	public void addBall() {
		try {
			Ball ball = new Ball();
			comp.add(ball);
			for(int i=0; i < STEPS; i++) {
				
				ball.move(comp.getBounds());
				comp.paintComponent(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		} catch(InterruptedException e) {}
	}
}