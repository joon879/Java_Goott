package com.tech.w05;

import java.util.Scanner;

public class CarMake {
	public static void main(String[] args) {

		// 숫자를 입력받아 1->벤츠, 2->소나타, 3->에쿠스
		// switch case 활용
		Scanner scan = new Scanner(System.in);
		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();
		// 무한루프 무한대 생산라인

		while (true) {
			System.out.println("생산할 차량을 입력하세요.");
			System.out.println("1: 벤츠, 2: 에쿠스, 3: 소나타 (-1: 종료)");

			int num = scan.nextInt();
			if (num == -1) {
				System.out.println("생산종료");
				break;
			} else if (!(num >= 1 && num <= 3)) {
				System.out.println("입력범위 초과");
				System.out.println("1~3, 다시 입력하세요.");
				continue;
			}

			selectOne(bc, ec, sc, num);
		}
	}

	// 특정 부분 메서드로 추출.
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
