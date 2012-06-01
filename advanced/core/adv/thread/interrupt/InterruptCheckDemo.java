package core.adv.thread.interrupt;

public class InterruptCheckDemo {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("PointA: isInterrupted ? "+thread.isInterrupted());
		thread.interrupt();
		System.out.println("PointB: isInterrupted ? "+thread.isInterrupted());
		System.out.println("PointC: isInterrupted ? "+thread.isInterrupted());
		
		try {
			Thread.sleep(2000);
			System.out.println("was NOT interrupted!!");
		} catch (InterruptedException e) {
			System.out.println("was interrupted!!");
		}
		System.out.println("PointD: isInterrupted ? "+thread.isInterrupted());
	}
}
