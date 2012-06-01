package core.adv.thread;

public class SimpleThreadCreation {
	public static void main(String[] args) {
		Thread newTask = new Thread();
		newTask.start();
		System.out.println("Main Thread Exit!");
		System.exit(0);
	}
}
