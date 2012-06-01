package com.ASCS;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class MyReverseInteger {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog("�����ϳ��� �Է��Ͻÿ�.");

		String[] parsedInput = inputStr.split("(?<=\\G.{1})");
		
		for(String e : parsedInput) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(parsedInput));
		
		//�������� �����ϱ�
		Arrays.sort(parsedInput, new Comparator<String>() {
			@Override
			public int compare(String e1, String e2) {
				if(e1.compareTo(e2) > 0)
					return -1;
				else if(e1.compareTo(e2) == 0)
					return 0;
				else
					return 1;
			}
		});
		
		System.out.println(Arrays.toString(parsedInput));
		System.exit(0);
	}
}