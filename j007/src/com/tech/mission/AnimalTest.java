package com.tech.mission;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		// tbasic@daum.net
		// Animal_�̽���

		Scanner scan = new Scanner(System.in);
		Cat cat = new Cat();
		Dog dog = new Dog();
		Elephant elp = new Elephant();
		boolean tag = true;
		
		while (tag) {
			System.out.println("1. ����� 2. ������ 3. �ڳ��� (0: ����)");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				cat.common();
				cat.catChar();
				System.out.println();
				break;
			case 2:
				dog.common();
				dog.dogChar();
				System.out.println();
				break;
			case 3:
				elp.common();
				elp.eleChar();
				System.out.println();
				break;
			case 0:
				System.out.println("����");
				tag = false;
				break;
			default:
				System.out.println("1~3�� �ٽ� �Է��� �ֽʽÿ�.");
				break;
			}
		}

	}

}
