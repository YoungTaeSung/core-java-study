package core.adv.thread.simple;

class NamedThread3 extends Thread {
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
public class ThreadAliveDemo {
	public static void main(String[] args) {
		//Main Thread ÄÚµå
		System.out.println("Main Thread Start!");

		//NamedThread
		NamedThread3 task = new NamedThread3();
		
		System.out.println("Before task start: "+(task.isAlive() ? "Alive" : "Die"));
		task.setName("MyWorker Thread");
		task.start();
		System.out.println("After task start: "+(task.isAlive() ? "Alive" : "Die"));
		
		for(int i=0; i<10; i++)
			task.printMessage();
		
		System.out.println("End of Main: "+(task.isAlive() ? "Alive" : "Die"));
		
	}
}
