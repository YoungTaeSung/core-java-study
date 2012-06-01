package core.ch14.thread.bounceball.version1;

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
		System.out.println("Move "+Thread.currentThread().getName());
		//���� ��ũ���� Ŭ����
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		for(Ball b : balls) {
			g2.fill(b.getShape());
		}
	}
}
