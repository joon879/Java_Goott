package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam3 {

	public static void main(String[] args) {
		// �����Ǵ� ���
		// ������ ��� �Է�->�Ǵ�
		//-1 �Է½� ���α׷� ����
		
		Scanner scan = new Scanner(System.in);
		

		while(true) { //���ѷ���
			System.out.println("������ �Է��ϼ���.");
			int yearNum = scan.nextInt();
			
			if(yearNum == -1) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			if (yearNum % 4 == 0) {
				if (yearNum % 100 == 0) {
					if(yearNum % 400 == 0) {
						System.out.println(yearNum+"���� �����Դϴ�.");
					}else {
						System.out.println(yearNum+"���� ����Դϴ�.");
					}
				} else {
					System.out.println(yearNum+"���� �����Դϴ�.");
				}
			}else {
				System.out.println(yearNum+"���� ����Դϴ�.");
			}
			
			
		}

		scan.close();
	}
}
