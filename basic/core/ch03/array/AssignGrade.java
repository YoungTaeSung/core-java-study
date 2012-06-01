package core.ch03.array;

import javax.swing.JOptionPane;

public class AssignGrade {
	public static void main(String[] args) {
		// 학생 수 입력 받기
		String numberOfStudentsString = JOptionPane.showInputDialog(
					"Please enter number of students:");
		// 문자열을 정수로 변환
		int numberOfStudents = Integer.parseInt(numberOfStudentsString);
		
		int[] scores = new int[numberOfStudents];
		int best = 0;
		char grade;
		
		// 점수를 입력 받고 가장 큰 수 저장
		for (int i = 0; i < scores.length; i++) {
			String scoreString = JOptionPane.showInputDialog(
					"Please enter a score:");
		       
			// Convert string into integer
		    scores[i] = Integer.parseInt(scoreString);
		    if (scores[i] > best)
		    	best = scores[i];
		}
		
		String output = "";
		
		// 등급 산출
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best - 10)
				grade = 'A';
			else if (scores[i] >= best - 20)
				grade = 'B';
			else if (scores[i] >= best - 30)
				grade = 'C';
			else if (scores[i] >= best - 40)
				grade = 'D';
			else
				grade = 'F';
		
			output += "Student " + i + " score is " +
		    scores[i] + " and grade is " + grade + "\n";
		}
		// 결과 출력 및 종료
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}

}
