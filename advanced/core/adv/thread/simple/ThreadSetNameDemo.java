package core.adv.thread.simple;

class NamedThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			printMessage();
	}
	public void printMessage() {
		Thread tmpThread = Thread.currentThread();
		String name = tmpThread.getName();
		System.out.println("Thread Name = "+name);
	}
}
public class ThreadSetNameDemo {
	public static void main(String[] args) {
		//Main Thread ÄÚµå
		System.out.println("Main Thread Start!");

		//NamedThread
		NamedThread2 task = new NamedThread2();
		task.setName("MyWorker Thread");
		task.start();
		
		for(int i=0; i<10; i++)
			task.printMessage();
	}
}
