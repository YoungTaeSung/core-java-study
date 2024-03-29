package core.ch03.problem;

import java.util.Random;

import javax.swing.JOptionPane;

public class MathLearner {
	public static void main(String[] args) {
    
	// 1. Generate two random single-digit integers
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);

	Random r = new Random();
	int n = r.nextInt(10);
	System.out.println(n);
	
     // 2. If number1 < number2, swap number1 with number2
    if (number1 < number2) {
    	int temp = number1;
        number1 = number2;
        number2 = temp;
    }
    
    String answerString = JOptionPane.showInputDialog("What is "+number1+" - "+number2+"?");
    int answer = Integer.parseInt(answerString);
    
    // 4. Grade the answer and display the result
    String replyString;
    if (number1 - number2 == answer)
    	replyString = "You are correct!";
    else
    	replyString = "Your answer is wrong.\n" + number1 + " - "
         		+ number2 + " should be " + (number1 - number2);
    JOptionPane.showMessageDialog(null, replyString);
     
    System.exit(0);
  }
}
