package com.tech.mission;

import java.util.Scanner;

public class ScoreExam2 {
	public static void main(String[] args) {
		//�迭 ������� 5
		//������ �Է¹޾� �迭�� ����
		//��� �հ� �ο� ���
		//�迭�� �̸��� scores
		//�迭�� ���� �ű��, ĸ���ؼ� tbasic@daum.net
		//�Է�����(0~100)
		//��������: ����ó��_ȫ�浿
		
		int[] scores = new int[5];
		Scanner scores1 = new Scanner(System.in);
		Scanner scores2 = new Scanner(System.in);
		Scanner scores3 = new Scanner(System.in);
		Scanner scores4 = new Scanner(System.in);
		Scanner scores5 = new Scanner(System.in);
		
		System.out.println("1�� ���� �Է�: ");
		int a = scores1.nextInt();
		System.out.println("2�� ���� �Է�: ");
		int b = scores2.nextInt();
		System.out.println("3�� ���� �Է�: ");
		int c = scores3.nextInt();
		System.out.println("4�� ���� �Է�: ");
		int d = scores4.nextInt();
		System.out.println("5�� ���� �Է�: ");
		int e = scores5.nextInt();
		
		int sum = a + b + c + d + e;
		float avg = 1.0f;
		avg = sum / scores.length;
				
		System.out.println("�ο�: "+scores.length);
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		
		
		
		
		
	}
}
