package com.ASCS;
// 2011.05.24.  Jaegon Song. 
import javax.swing.JOptionPane;

public class ReverseInteger {
	public static void main(String[] args){
		//Ű���忡�� ���� ������ �Է¹޾� �Է¹��� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		/*------------------------------
		|			���̾�α� ȣ�� 		|
		 ------------------------------*/
		String input = JOptionPane.showInputDialog(null,
				"���� ���� �Է��ϼ��� : ",
				"Request",
				JOptionPane.QUESTION_MESSAGE);
		int number = Integer.parseInt(input);
	
		
		int standard = 1;
		int tempstandard = 10;
		int length=0; // ������ ����
		

		/*------------------------------
		|			���� 				 		|
		 ------------------------------*/
		boolean condition = true;
		while(condition){
			condition = number/tempstandard != 0 ? true : false ;
			tempstandard *= 10;
			standard = tempstandard /100;  // ���� temp �� 10 �ε��ٰ�, ������ ����ÿ��� tempstandard �� 10�� �������Ƿ� 
			length++;
		}

		/*------------------------------
		|					��ȯ				|
		 ------------------------------*/
		
		int loader = 1;
		int counter = 0;
		condition = true;
		int result = 0;
	
		while(condition){
			result +=((number / standard) %10)	*	loader ;
			loader *=10;
			counter++;
			standard /= 10;
			condition = counter < length ? true : false ;
		}
		JOptionPane.showMessageDialog(null, number+ "�� �Ųٷ� �ϸ�   " +result);
		
		System.exit(0);
	}
}

// �� ���α׷��� 1000 ���� �Է� �Ͽ�������  0001 �� �ƴ� 1�� ������� �� �� �ִ�.
// �Էµ� ���� int �� �Ľ����� �ʰ� �����ϴ� �������� �ϼ��ϰ��� �� ���� Ȱ�� �� �� �ִ� method ���� �˰� �ͽ��ϴ�. 
