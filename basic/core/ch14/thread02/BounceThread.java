package core.ch14.thread02;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceThread {
	public static void main(String[] args) {
		System.out.println("Main() "+Thread.currentThread().getName());
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("MainRun() "+ Thread.currentThread().getName());
				JFrame mainFrame = new BounceFrame();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
	}
}
/*
 * Make Runnable Class @^^@
 */
class BallRunnable implements Runnable {
	private Ball ball;
	private Component component;
	public static final int STEPS=1000;
	public static final int DELAY=5;
	
	public BallRunnable(Ball aBall, Component aComponent) {
		ball = aBall;
		component = aComponent;
		System.out.println("BallRunnable "+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		try {
			for(int i=0; i < STEPS; i++) {
				System.out.println("BallRun(): "+Thread.currentThread().getName());
				ball.move(component.getBounds());
				component.repaint();
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {}
	}
}
class BounceFrame extends JFrame {
	private BallComponent comp;
	public static final int DEFAULT_WIDTH=450;
	public static final int DEFAULT_HEIGHT=350;
//	public static final int STEPS=1000;
//	public static final int DELAY=3;
	
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
		System.out.println("Frame "+Thread.currentThread().getName());
	}
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	/*
	 * Adds a bouncing ball to canvas and
	 * starts a thread to make it bounce.
	 */
	public void addBall() {
		Ball b = new Ball();
		comp.add(b);
		Runnable r = new BallRunnable(b, comp);
		Thread t = new Thread(r);
		t.start();
	}
}
