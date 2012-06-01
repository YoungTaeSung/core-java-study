package core.adv.thread;

import java.util.Scanner;

class RunnablePrinter implements Runnable {
	@Override
	public void run() {
		System.out.println("RunnablePrinter.run()");
		int counter = 0;
		while(counter != 3) {
			new Scanner(System.in).next();
			counter++;
		}
		System.out.println("RunnablePrinter.run() DONE!!");
	}
}
public class CreateRunnableThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread(new RunnablePrinter());
		thread.start();
		for(int i=0; i < 100; i++) {
			System.out.println("main thread run"+i);
		}
	}
}
