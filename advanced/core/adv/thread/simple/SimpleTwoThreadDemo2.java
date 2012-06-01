package core.adv.thread.simple;

class NewThread2 extends Thread {
	//#1. Field
	private Thread creatorThread;
	
	//#2. Constructor
	public NewThread2() {
		//�����ڸ� ȣ���� ������� �����ΰ�?
		creatorThread = Thread.currentThread();
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			showMessage();
	}
	public void showMessage() {
		//showMessage()�� �����ϰ� �ִ� ������� ����?
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

		//run() �޼��带 ���� showMessage() ȣ��
		NewThread2 task = new NewThread2();
		task.start();
		
		//Main Thread���� showMessage() ȣ��
		for(int i=0; i<10; i++)
			task.showMessage();
			
	}
}
