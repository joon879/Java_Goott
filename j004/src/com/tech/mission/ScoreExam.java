package com.tech.mission;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		//�迭 ������� 5
		//������ �Է¹޾� �迭�� ����
		//��� �հ� �ο� ���
		//�迭�� �̸��� scores
		//�迭�� ���� �ű��, ĸ���ؼ� tbasic@daum.net
		//�Է�����(0~100)
		//��������: ����ó��_ȫ�浿
		
		int[] scores = new int[5];
		int sum = 0;
		float avg = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�л� "+(i+1)+"���� ������ �Է����ּ���.");
			scores[i] = scan.nextInt();
			if(scores[i]<0 || scores[i]>100) {
				System.out.println("0~100������ �Է����ֽʽÿ�.");
				i = i - 1; //�߸��� �Է��� ���� �� �ٽ� �ѹ� �Է�.
			}else {
				sum = sum + scores[i];
			}
		}
		
		avg = (float)sum / scores.length;
		
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+avg);
		System.out.println("���ο�: "+scores.length);
		
		
		
		
		
	}
}
