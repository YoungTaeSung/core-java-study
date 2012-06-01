package core.adv.thread.simple;

class NewThread0 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println("New Thread Loop: "+i);
	}
}
public class SimpleTwoThreadDemo {
	public static void main(String[] args) {
		//Main Thread �ڵ�(1)
		System.out.println("Main Thread Start!");

		//New Thread �ڵ�
		NewThread0 task = new NewThread0();
		task.start();
		
		//Main Thread �ڵ�(2)
		for(int i=0; i<10; i++)
			System.out.println("Main Thread Loop: "+i);
	}
}
