package core.adv.thread.simple;

//쓰레드 클래스를 구현하는 #1. Thread 상속받기, run() 구현하기
class FirstThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("FirstTh. Message - "+i);
		}
	}
}
public class FirstThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main Start!!");
		//새로운 thread 생성과 구동
		FirstThread thread = new FirstThread();
		thread.start();	//run()
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Message - "+i);
		}
		//모든 쓰레드 종료
		//System.exit(0);
	}
}
