package core.adv.thread;

//Thread 클래스를 확장한 클래스
class NewTask extends Thread {
	private final int MAX=1000;
	@Override
	public void run() {
		for(int i=0; i < MAX; i++) {
			System.out.println("---> NewTask Message");
		}
	}
}
public class ExtendsThreadClass {
	private final static int MAX=1000;
	public static void mainThreadTask() {
		for(int i=0; i<MAX; i++) {
			System.out.println("-> MainTask Message");
		}
	}
	public static void main(String[] args) {
		NewTask t = new NewTask();
		t.start();
		mainThreadTask();
		System.exit(0);
	}
}
