package com.tech.mission;

import java.util.Scanner;

public class ScoreExam4 {
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
		
				
		int sum = 0;
		float avg = 0.0f;
		boolean flag;
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"�� ���� �Է�: ");
			scores[i] = scores1.nextInt();
			flag = scores[i]>=0 && scores[i]<=100;
//			System.out.println(flag);
			if(!flag) {
				i--;
			}
			sum = sum + scores[i];
		}
		

		
		avg = sum / scores.length;
		
		System.out.println("�ο�: "+scores.length);
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		
		

		
		
	}
}
