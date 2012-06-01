package core.ch03.problem;

public class CurrentTime {
	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		System.out.println("총 ms: "+totalMilliSeconds);
		long totalSeconds = totalMilliSeconds / 1000;
		System.out.println("총 seconds: "+totalSeconds);
		
		int currentSeconds = (int)(totalSeconds % 60);
		System.out.println("현재 "+currentSeconds+"초 입니다.");
		
		long totalMinutes = totalSeconds / 60;
		int currentMinutes = (int)(totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		int currentHours = (int)(totalHours % 24);
		
		System.out.println("현재 시간은 "+currentHours+":"+currentMinutes+":"+currentSeconds+"(GMT)입니다.");
		System.exit(0);
	}

}
