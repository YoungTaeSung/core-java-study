package com; //��Ű�� �� 

import java.util.Scanner; //Scanner ����� ����ϱ� ���� ���̺귯��.

public class Test { //Ŭ���� ��
	
	public static void main(String[] args) { // ���� �Լ� ����
		/* �������� ������ �ణ �ٸ�����, ū ��&���� �� ���ϴ� if�� �����ϰ���  �ٽ� �˰������� �״�� �����߽��ϴ�. */
		/* ���̾�α״� ���߿� �����ص� �Ǳ⶧����, �ϴ� ���ϰ� Scanner�� �̿��߽��ϴ�. */
		
		Scanner in = new Scanner(System.in); //�Է� ���� �ޱ� ���� Scanner in  ����.

		int Input_Num1, Input_Num2; // ���� �Է°� 1�� 2.
		int GCD=1; //�ִ������� �������� ���� ������ �� GCD ����. 
		int i, tmp; //for���� �ʿ��� ���� i , �Է��� �� ���� ũ�� �񱳸� ���� tmp ����.
		int result_num1, result_num2; //�Է��� �� ���� ���� ��Ų �����Դϴ�. for���ȿ��� ���� ���ϱ� ������...
		int even_num=0; //Input_Num1�� �����Ų ���� �Դϴ�.

		System.out.print("ù ��° ���� �Է� : ");
		Input_Num1 = in.nextInt(); //ù ��° �Է� ���ڸ� Input_Num1�� ����.

		System.out.print("�� ��° ���� �Է� : ");
		Input_Num2 = in.nextInt(); //�� ��° �Է� ���ڸ� Input_Num2�� ����.

		/* �Է� �� �� ���� ���� Input_Num1�� �ǵ��� �ϴ� ���ǽ��� �� �ʿ��մϴ�. */
		if(Input_Num1 > Input_Num2){ //ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
			tmp = Input_Num1; //ù��° ���ڸ� �ٸ����� �Űܳ���
			Input_Num1 = Input_Num2; //�ι�° ���ڸ� ù��°������ ������ ����.
			Input_Num2 = tmp; //�Űܳ��� ù��° ���ڰ��� �ι�° ������ ������ ����.
		}//if�� ����

		even_num = Input_Num1; //for���ȿ��� Input_Num1���� ���ϹǷ�, �̸� even_num ������ ����
		result_num1 = Input_Num1; //Input_Num1�� ���� ���� ������, ���� ��¹��� �ٲ� Input_Num1���� �����Ƿ�
		result_num2 = Input_Num2; //Input_Num2�� ���� ���� ������, ���� ��¹��� �ٲ� Input_Num2���� �����Ƿ�
		
		/*������ �Ǵ� for���Դϴ�.��� �̹����� �׷��� �����ϰų� ������ ������ �ƴϾ��� �� �����ϴ�.
		�׷��� ���� �տ��� Ÿ�л��� ��ǥ�ߴ� for�� �ӿ� ��û�� ������ �־����ϴ�.
		��� ���� �� �κж����� �� Ǯ�� ���ߴٰ� �����Ǽ� ���� �ȵ�����ϴ�. 
		�Է°��� ���࿡ 16�� 20�̶��, �ִ������� 2�� 2�� ���� �� �ֱ⶧����, 4�� �˴ϴ�.
		������ ���ܰ迡�� �̹� i���� 2�϶� ����� ������, 3���� ������ �����̱⶧����, 2�� �ٽ� ���� �� �����ϴ�.
		�����ε� 16�� 20�� ������ �ִ������� �͹��Ͼ��� 2��� ���ɴϴ�. 
		�� ������ �ִ����� �˰����򺸴ٵ� ��Ժ��� �ξ� �߿��� Ű����Ʈ��� �����մϴ�.*/
		
		for(i=1; i<=even_num; i++){ //i�� �ִ������� �⺻�� 1�� ���ؼ� 0�� �ƴ� 1���� �����ؼ� �� ���� ���� ���� ������ �� ���� ����.
			if((result_num1%i == 0)&&(result_num2%i == 0)){	//ù��° ���� �ι�° �� ��δ� i�� ���������� �� �������ٸ�...
				result_num1 /= i; //result_num1���� i�� ���� ���� result_num1�� ����.
				result_num2 /= i; //result_num2���� i�� ���� ���� result_num2�� ����.
				GCD *= i; //GCD�� i�� ���� ����� GCD�� ����.	
				i=1; //���� �߿��� �κ��Դϴ�. �ٽ� i���� 1�� �ʱ�ȭ ���� ��� ����� �� ���� ���ɴϴ�.
			} //if�� ����
		}//for�� ����
		
		System.out.println(""+Input_Num1+","+Input_Num2+" �ִ� ����� : "+GCD+" \n");
		System.exit(0); //0���� ��ȯ�ϰ�, ���� �Լ� ����
	}
}