package com.tech.w03;

import java.util.Scanner;

public class AlbaExam {
	public static void main(String[] args) {
		//�ñ� ���� �ð��� �Է�
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ñ� �ü� �Է��ϼ���");
		int basePay = scanner.nextInt();
		int workHours = scanner.nextInt();
		int pay = basePay * workHours;
		System.out.println("���ӱ�: "+pay);
	}
}
