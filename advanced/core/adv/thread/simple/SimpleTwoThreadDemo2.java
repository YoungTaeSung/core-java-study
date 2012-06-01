package core.adv.thread.simple;

class NewThread2 extends Thread {
	//#1. Field
	private Thread creatorThread;
	
	//#2. Constructor
	public NewThread2() {
		//생성자를 호출한 쓰레드는 누구인가?
		creatorThread = Thread.currentThread();
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			showMessage();
	}
	public void showMessage() {
		//showMessage()를 실행하고 있는 쓰레드는 누규?
		Thread tmpThread = Thread.currentThread();
		if(tmpThread == creatorThread)
			System.out.println("Creator Thread Message!");
		else if(tmpThread == this)
			System.out.println("NewThread2 Thread Message!");
		else
			System.out.println("Mystery Thread!!");
	}
}
public class SimpleTwoThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("Main Thread Start!");

		//run() 메서드를 통해 showMessage() 호출
		NewThread2 task = new NewThread2();
		task.start();
		
		//Main Thread에서 showMessage() 호출
		for(int i=0; i<10; i++)
			task.showMessage();
			
	}
}
