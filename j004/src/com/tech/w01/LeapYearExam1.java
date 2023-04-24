package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam1 {

	public static void main(String[] args) {
// 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
// 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
// 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int yearNum = 0;
		yearNum = scan.nextInt();



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
		scan.close();
	}
}
