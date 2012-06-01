package core.ch03.problem;

import javax.swing.JOptionPane;

public class LoanPayment {
	public static void main(String[] args) {
		String annualInterestRateStr = JOptionPane.showInputDialog("�� ���� ���ڸ� �Է��ϼ���.");
		double annualInterestRate = Double.parseDouble(annualInterestRateStr);
		
		String numberOfYearString = JOptionPane.showInputDialog("���� ��ȯ �Ⱓ�� �Է��ϼ���(��).");
		double numberOfYear = Integer.parseInt(numberOfYearString);
		
		String loanString = JOptionPane.showInputDialog("������� �Է��ϼ���.");
		double loanAmount = Double.parseDouble(loanString);
		
		double monthlyInterestRate = annualInterestRate/1200;
		
		double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
		double totalPayment = monthlyPayment * 12 * numberOfYear;
		
		System.out.println("�� ��ȯ ���ڴ� "+monthlyInterestRate+"�Դϴ�.");
		System.out.println("�� ��ȯ �ݾ��� "+(int)((monthlyPayment*100)/100.0)+"�Դϴ�.");
		System.out.println("�� ��ȯ �ݾ��� "+(int)((totalPayment*100)/100.0)+"�Դϴ�.");
		System.exit(0);
	}
}