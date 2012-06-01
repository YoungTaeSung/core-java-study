package core.adv.thread.simple;

//API: currentThread()
class FirstThreadCurrent extends Thread {
	private Thread creatorThread;
	
	public FirstThreadCurrent() {
		//�����ڸ� ȣ���� ������� ����?
		creatorThread = Thread.currentThread();
		System.out.println("CreatorThread = "+creatorThread.getName());
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++)
			showMessage();
	}
	public void showMessage() {
		Thread tmpThread = Thread.currentThread();
		System.out.println("Message : "+tmpThread.getName());
//		if(tmpThread == creatorThread)
//			System.out.println("Message: CreatorThread!");
//		else if(tmpThread == this)
//			System.out.println("Message: FirstThread!");
//		else
//			System.out.println("Message: somethingWrong!!");
	}
}
public class FirstThreadCurrentDemo {
	public static void main(String[] args) {
		System.out.println("Main Start!!");
		
		//FirstThreadCurrent�� ���� showMessage() ����
		FirstThreadCurrent th = new FirstThreadCurrent();
		th.setName("MyFirstThread");
		th.start();
		
		//main �����忡�� ���� showMessage() ����
		for(int i=0; i<5; i++)
			th.showMessage();
	}
}




