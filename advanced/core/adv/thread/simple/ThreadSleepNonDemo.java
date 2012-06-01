package core.adv.thread.simple;

class ThreadSleepNon extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//Thread.sleep(2000);
			waitForNSec(2000);
			System.out.println("Hello, Thread!");
		}
	}
	private void waitForNSec(int millis) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + millis;
		while(System.currentTimeMillis() < endTime) {
		}
	}
}
public class ThreadSleepNonDemo {
	public static void main(String[] args) {
		ThreadSleepNon th = new ThreadSleepNon();
		th.start();
	}
}
