package core.adv.thread.interrupt;

public class InterruptResetDemo {
	public static void main(String[] args) {
		System.out.println("PointX: Thread.interrupted="+Thread.interrupted());
		Thread.currentThread().interrupt();
		System.out.println("PointY: Thread.interrupted="+Thread.interrupted());
		System.out.println("PointZ: Thread.interrupted="+Thread.interrupted());
	}
}
