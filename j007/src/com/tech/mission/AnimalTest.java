package com.tech.mission;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		// tbasic@daum.net
		// Animal_이승준

		Scanner scan = new Scanner(System.in);
		Cat cat = new Cat();
		Dog dog = new Dog();
		Elephant elp = new Elephant();
		boolean tag = true;
		
		while (tag) {
			System.out.println("1. 고양이 2. 강아지 3. 코끼리 (0: 종료)");
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
				System.out.println("종료");
				tag = false;
				break;
			default:
				System.out.println("1~3을 다시 입력해 주십시오.");
				break;
			}
		}

	}

}
