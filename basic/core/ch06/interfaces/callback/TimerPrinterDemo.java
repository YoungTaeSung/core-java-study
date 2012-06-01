package core.ch06.interfaces.callback;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

//내부클래스를 사용하지 않는 예제
public class TimerPrinterDemo {
	private static final int PERIOD = 2000;	//intervals, unit(ms)

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ActionListener listener = new TimerPrinter();
				Timer timer = new Timer(PERIOD, listener);
				timer.start();
				JOptionPane.showMessageDialog(null, "Quit Program?");
			}
		});
	}
}
class TimerPrinter implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("Current Time ==> "+now);
		Toolkit.getDefaultToolkit().beep();
	}
}