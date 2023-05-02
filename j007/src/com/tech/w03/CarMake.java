package com.tech.w03;

import java.util.Scanner;

public class CarMake {
	public static void main(String[] args) {

		//숫자를 입력받아 1->벤츠, 2->소나타, 3->에쿠스
		// switch case 활용
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
			System.out.println("생산라인 없음");
			break;
		}
	}
}
