package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ο����� �Է�: ");
		int cntPerson = scan.nextInt();
//		System.out.println(cntPerson);
		String[] names = new String[cntPerson];
		
		int[] heights = new int[names.length];
		
		
		int total = 0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println("�̸��� �Է��Ͻÿ�.");
			names[i] = scan.next();
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
