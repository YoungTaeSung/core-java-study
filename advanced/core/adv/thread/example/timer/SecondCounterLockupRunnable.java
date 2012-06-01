package core.adv.thread.example.timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DecimalFormat;

import javax.swing.JComponent;

public class SecondCounterLockupRunnable extends JComponent
								implements Runnable {
	private boolean keepRunning;
	private Font paintFont;
	private String timeMessage;
	private int arcLength;
	
	public SecondCounterLockupRunnable() {  
		paintFont = new Font("SansSerif", Font.BOLD, 14);  
		timeMessage = "Time Here";
		arcLength = 0;  
	}
	@Override
	public void run() {
		runClock();
	}
	public void runClock() {
		System.out.println("Thread running runClock() is "+
					Thread.currentThread().getName());
		DecimalFormat format = new DecimalFormat("0.000");
		long normalSleepTime = 100;
		
		int counter = 0;
		keepRunning = true;
		
		while(keepRunning) {
			try {
				Thread.sleep(normalSleepTime);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
			
			counter++;
			double countSecs = counter/10.0;
			timeMessage = format.format(countSecs);
			arcLength = (((int)countSecs)%60) * 360 / 60;
			
			repaint();
		}
	}
	public void stopClock() {
		System.out.println("Thread stopping runClock() is "+
				Thread.currentThread().getName());
		keepRunning = false;
	}
	@Override
	public void paint(Graphics g) {
		System.out.println("Thread that invoked paint() is " +  
					Thread.currentThread().getName());  
		g.setColor(Color.black);  
	    g.setFont(paintFont);  
	    g.drawString(timeMessage, 0, 15);  
		g.fillOval(0, 20, 100, 100);  
		g.setColor(Color.white);  
		g.fillOval(3, 23, 94, 94);  
		g.setColor(Color.blue);  
		g.fillArc(2, 22, 96, 96, 90, -arcLength); 
	}
}
