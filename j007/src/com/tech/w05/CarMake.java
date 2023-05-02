package com.tech.w05;

import java.util.Scanner;

public class CarMake {
	public static void main(String[] args) {

		// ���ڸ� �Է¹޾� 1->����, 2->�ҳ�Ÿ, 3->����
		// switch case Ȱ��
		Scanner scan = new Scanner(System.in);
		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();
		// ���ѷ��� ���Ѵ� �������

		while (true) {
			System.out.println("������ ������ �Է��ϼ���.");
			System.out.println("1: ����, 2: ����, 3: �ҳ�Ÿ (-1: ����)");

			int num = scan.nextInt();
			if (num == -1) {
				System.out.println("��������");
				break;
			} else if (!(num >= 1 && num <= 3)) {
				System.out.println("�Է¹��� �ʰ�");
				System.out.println("1~3, �ٽ� �Է��ϼ���.");
				continue;
			}

			selectOne(bc, ec, sc, num);
		}
	}

	// Ư�� �κ� �޼���� ����.
	private static void selectOne(BenzClass bc, EquusClass ec, SonataClass sc, int num) {
		switch (num) {
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
			break;
		}
	}
}
