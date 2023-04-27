package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame5 {
//	final 상수활용, 숫자를 문자화
	static final int GAWI = 1;
	static final int BAWI = 2;
	static final int BO = 3;
	
	public static void main(String[] args) {
//		가위 바위 보의 인식을 편리하게
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
		
		GBBGame5 g3 = new GBBGame5();
		g3.judge(cNum, yNum);
				
	}
	
	public void judge(int cNum, int yNum) {
		if ((cNum==GAWI && yNum==BO) || 
				(cNum==BAWI && yNum==GAWI) || 
				(cNum==BO && yNum==BAWI)) {
			System.out.println("컴퓨터 승리");
		}else if ((yNum==GAWI && cNum==BO) || 
				(yNum==BAWI && cNum==GAWI) || 
				(yNum==BO && cNum==BAWI)) {
			System.out.println("유저 승리");
		}else {
			System.out.println("무승부");
		}
	}
}
