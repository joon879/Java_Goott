package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam1 {

	public static void main(String[] args) {
// ���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�.
// ���� ��� ������ 4, 100���� ������ �������� �ش� ������� �Ѵ�.
// ���� ��� ������ 4, 100, 400���� ������ �������� �ش� �������� �Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int yearNum = 0;
		yearNum = scan.nextInt();



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
		scan.close();
	}
}
