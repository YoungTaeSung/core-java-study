package core.adv.thread.interrupt;

class SleepInterrupt implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("In RUN(): About to sleep 20 sec.");
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			System.out.println("In RUN(): Interrupted while sleeping!!");
			return;
		}
		System.out.println("In RUN(): Leaving normally");
	}
}
public class SleepInterruptDemo {
	public static void main(String[] args) {
		SleepInterrupt si = new SleepInterrupt();
		Thread thread = new Thread(si, "SleepInterrupt");
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println("In Main(): Interrupting SleepThread!");
		thread.interrupt();
		System.out.println("In Main(): Exit!");
	}
}
