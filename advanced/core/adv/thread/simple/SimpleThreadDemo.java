package core.adv.thread.simple;

class PrintThread extends Thread {
	private boolean isRunning = true;
	
	public void setStop() {
		isRunning = false;
	}
	@Override
	public void run() {
		while(isRunning) {
			System.out.println(this.getClass().
							getSimpleName()+": RUN()");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class SimpleThreadDemo {
	public static void main(String[] args) {
		PrintThread demo = new PrintThread();
		demo.start();
		
		System.out.println("Terminate main()");
		for(int i=0; i<5; i++) {
			System.out.println(SimpleThreadDemo.class.
							getSimpleName()+": For()-"+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		demo.setStop();
		System.out.println("Main Thread Terminated!");
		System.exit(0);
	}
}
