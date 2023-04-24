package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam3 {

	public static void main(String[] args) {
		// 윤년판단 계속
		// 연도를 계속 입력->판단
		//-1 입력시 프로그램 종료
		
		Scanner scan = new Scanner(System.in);
		

		while(true) { //무한루프
			System.out.println("연도를 입력하세요.");
			int yearNum = scan.nextInt();
			
			if(yearNum == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			if (yearNum % 4 == 0) {
				if (yearNum % 100 == 0) {
					if(yearNum % 400 == 0) {
						System.out.println(yearNum+"년은 윤년입니다.");
					}else {
						System.out.println(yearNum+"년은 평년입니다.");
					}
				} else {
					System.out.println(yearNum+"년은 윤년입니다.");
				}
			}else {
				System.out.println(yearNum+"년은 평년입니다.");
			}
			
			
		}

		scan.close();
	}
}
