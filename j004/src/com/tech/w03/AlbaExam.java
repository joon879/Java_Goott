package com.tech.w03;

import java.util.Scanner;

public class AlbaExam {
	public static void main(String[] args) {
		//시급 일한 시간수 입력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("시급 시수 입력하세요");
		int basePay = scanner.nextInt();
		int workHours = scanner.nextInt();
		int pay = basePay * workHours;
		System.out.println("총임금: "+pay);
	}
}
