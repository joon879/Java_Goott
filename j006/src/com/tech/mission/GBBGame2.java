package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame2 {
	public static void main(String[] args) {
		/*
		 출력: 컴: 가위, 유저: 바위, 유저승
		 가위 1, 바위 2, 보 3
		 컴퓨터는 랜덤.
		 두 값을 입력받기 Scanner, Random
		 */
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		int cNum = 0;
		int yNum = 0;
		
		System.out.println("가위바위보게임 시작");
		System.out.println("가위 1, 바위 2, 보 3");
		System.out.println("유저 숫자 입력");
		yNum = sc.nextInt();
		cNum = ra.nextInt(3)+1;
		System.out.println("유저: "+yNum);
		System.out.println("컴퓨터: "+cNum);
		
		if ((cNum==1 && yNum==3) || (cNum==2 && yNum==1) || (cNum==3 && yNum==2)) {
			System.out.println("컴퓨터 승리");
		}else if ((yNum==1 && cNum==3) || (yNum==2 && cNum==1) || (yNum==3 && cNum==2)) {
			System.out.println("유저 승리");
		}else {
			System.out.println("무승부");
		}
		
	}
}
