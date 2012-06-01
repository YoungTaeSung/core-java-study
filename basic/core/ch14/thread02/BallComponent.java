package core.ch14.thread02;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class BallComponent extends JPanel {
	private ArrayList<Ball> balls = new ArrayList<Ball>();

	public void add(Ball b) {
		balls.add(b);
	}
	public void paintComponent(Graphics g) {
		System.out.println("Paint "+Thread.currentThread().getName());
		super.paintComponent(g); //erase background
		Graphics2D g2 = (Graphics2D)g;
		for(Ball b : balls) {
			g2.fill(b.getShape());
		}
	}
}
