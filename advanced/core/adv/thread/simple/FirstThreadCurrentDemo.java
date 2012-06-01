package core.adv.thread.simple;

//API: currentThread()
class FirstThreadCurrent extends Thread {
	private Thread creatorThread;
	
	public FirstThreadCurrent() {
		//생성자를 호출한 쓰레드는 누규?
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
		
		//FirstThreadCurrent를 통해 showMessage() 실행
		FirstThreadCurrent th = new FirstThreadCurrent();
		th.setName("MyFirstThread");
		th.start();
		
		//main 쓰레드에서 직접 showMessage() 실행
		for(int i=0; i<5; i++)
			th.showMessage();
	}
}




