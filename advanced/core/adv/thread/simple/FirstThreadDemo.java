package core.adv.thread.simple;

//������ Ŭ������ �����ϴ� #1. Thread ��ӹޱ�, run() �����ϱ�
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
		//���ο� thread ������ ����
		FirstThread thread = new FirstThread();
		thread.start();	//run()
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Message - "+i);
		}
		//��� ������ ����
		//System.exit(0);
	}
}
