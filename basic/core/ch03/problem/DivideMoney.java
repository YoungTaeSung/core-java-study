package core.ch03.problem;

import javax.swing.JOptionPane;

public class DivideMoney {
	public static void main(String[] args) {
		String inputMoney = JOptionPane.showInputDialog("���� �Է��ϼ���.(�ּ� 1����)");
		int money = Integer.parseInt(inputMoney);
		
		int remainMoney = 0;
		
		int OhChunOwn = money / 5000;
		remainMoney = money % 5000;
		int ChunOwn = remainMoney / 1000;
		remainMoney = remainMoney % 1000;
		int OhBackOwn = remainMoney / 500;
		remainMoney = remainMoney % 500;
		int BackOwn = remainMoney / 100;
		
		System.out.println("5õ�� "+OhChunOwn+"��.");
		System.out.println("1õ�� "+ChunOwn+"��.");
		System.out.println("500�� "+OhBackOwn+"��.");
		System.out.println("100�� "+BackOwn+"��.");
		
		System.exit(0);
	}
}