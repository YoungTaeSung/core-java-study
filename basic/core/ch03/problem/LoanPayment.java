package core.ch03.problem;

import javax.swing.JOptionPane;

public class LoanPayment {
	public static void main(String[] args) {
		String annualInterestRateStr = JOptionPane.showInputDialog("연 대출 이자를 입력하세요.");
		double annualInterestRate = Double.parseDouble(annualInterestRateStr);
		
		String numberOfYearString = JOptionPane.showInputDialog("대출 상환 기간을 입력하세요(년).");
		double numberOfYear = Integer.parseInt(numberOfYearString);
		
		String loanString = JOptionPane.showInputDialog("대출금을 입력하세요.");
		double loanAmount = Double.parseDouble(loanString);
		
		double monthlyInterestRate = annualInterestRate/1200;
		
		double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
		double totalPayment = monthlyPayment * 12 * numberOfYear;
		
		System.out.println("월 상환 이자는 "+monthlyInterestRate+"입니다.");
		System.out.println("월 상환 금액은 "+(int)((monthlyPayment*100)/100.0)+"입니다.");
		System.out.println("총 상환 금액은 "+(int)((totalPayment*100)/100.0)+"입니다.");
		System.exit(0);
	}
}