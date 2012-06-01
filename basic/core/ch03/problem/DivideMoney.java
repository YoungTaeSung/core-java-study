package core.ch03.problem;

import javax.swing.JOptionPane;

public class DivideMoney {
	public static void main(String[] args) {
		String inputMoney = JOptionPane.showInputDialog("돈을 입력하세요.(최소 1만원)");
		int money = Integer.parseInt(inputMoney);
		
		int remainMoney = 0;
		
		int OhChunOwn = money / 5000;
		remainMoney = money % 5000;
		int ChunOwn = remainMoney / 1000;
		remainMoney = remainMoney % 1000;
		int OhBackOwn = remainMoney / 500;
		remainMoney = remainMoney % 500;
		int BackOwn = remainMoney / 100;
		
		System.out.println("5천원 "+OhChunOwn+"개.");
		System.out.println("1천원 "+ChunOwn+"개.");
		System.out.println("500원 "+OhBackOwn+"개.");
		System.out.println("100원 "+BackOwn+"개.");
		
		System.exit(0);
	}
}