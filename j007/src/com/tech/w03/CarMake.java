package com.tech.w03;

import java.util.Scanner;

public class CarMake {
	public static void main(String[] args) {

		//���ڸ� �Է¹޾� 1->����, 2->�ҳ�Ÿ, 3->����
		// switch case Ȱ��
		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		switch (i) {
		case 1:
			bc.carBase();
			bc.doJoripBenz();
			System.out.println();
			break;
		case 2:
			ec.carBase();
			ec.doJoripEquus();
			System.out.println();
			break;
		case 3:
			sc.carBase();
			sc.doJoripSonata();
			System.out.println();
			break;
			
		default:
			System.out.println("������� ����");
			break;
		}
	}
}
