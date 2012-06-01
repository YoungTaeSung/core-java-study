package core.adv.thread.simple;

class NewThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println("New Thread Loop: "+i);
	}
}
public class SimpleTwoThreadDemo1 {
	public static void main(String[] args) {
		//Main Thread 코드(1)
		System.out.println("Main Thread Start!");

		//New Thread 코드
		Thread task = new NewThread();
		task.start();
		
		//Main Thread 코드(2)
		for(int i=0; i<10; i++)
			System.out.println("Main Thread Loop: "+i);
	}
}
