package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam {
	public static void main(String[] args) {
		//�迭1 names�� �̸� 5���� �̸� �Է��ϰ�
		//�迭2 heights ���� �̸��� Ű�� �Է¹޾�
		//�迭1�� �̸��� �ش��ϴ� Ű�� ����Ͻÿ�
		//���� ��Ż, ��ս��� ���
		Scanner scan = new Scanner(System.in);
		
				
//		String[] names = {"tom1", "tom2", "tom3", "tom4", "tom5"};
		String[] names = new String[5];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("�̸��� �Է��Ͻÿ�: ");
			names[i] = scan.next();
			
		}
		
		int[] heights = new int[names.length];
		
		int total = 0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println("Ű�� �Է��Ͻÿ�.");
			heights[i] = scan.nextInt();
			total += heights[i];			
		}
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(names[i]+"�� Ű��: "+heights[i]);
		}
		System.out.println("Ű�� �հ�: "+total);
		System.out.println("Ű�� ���: "+total/(float)heights.length);
		
	}
}
