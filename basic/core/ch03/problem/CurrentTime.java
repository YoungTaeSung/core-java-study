package core.ch03.problem;

public class CurrentTime {
	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		System.out.println("�� ms: "+totalMilliSeconds);
		long totalSeconds = totalMilliSeconds / 1000;
		System.out.println("�� seconds: "+totalSeconds);
		
		int currentSeconds = (int)(totalSeconds % 60);
		System.out.println("���� "+currentSeconds+"�� �Դϴ�.");
		
		long totalMinutes = totalSeconds / 60;
		int currentMinutes = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		int currentHours = (int)(totalHours % 24);
		
		System.out.println("���� �ð��� "+currentHours+":"+currentMinutes+":"+currentSeconds+"(GMT)�Դϴ�.");
		System.exit(0);
	}

}
