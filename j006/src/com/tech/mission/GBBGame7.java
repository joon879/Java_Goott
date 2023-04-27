package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame7 {
//	final 상수활용, 숫자를 문자화
	static final int GAWI = 1;
	static final int BAWI = 2;
	static final int BO = 3;
	static String str;
	static int cNum;
	static int yNum;
	static Scanner sc;
	
	public static void main(String[] args) {
//		가위 바위 보의 인식을 편리하게
		Random ra = new Random();
		sc = new Scanner(System.in);
		GBBGame7 g3 = new GBBGame7();
//		int cNum = 0;
//		int yNum = 0;
		
		System.out.println("가위바위보게임 시작");
		System.out.println("가위 1, 바위 2, 보 3");
		System.out.println("유저 숫자 입력");
		yNum = sc.nextInt();
		
		g3.goAction(yNum);
		System.out.println("유저: "+str);
		cNum = ra.nextInt(3)+1;
		g3.goAction(cNum);
		System.out.println("컴퓨터: "+str);
		
		//예외처리
		if(!(yNum==1 || yNum==2 || yNum==3)) {
			g3.reType();
		}else {
			g3.judge(cNum, yNum);
		}
	}
	
	public void reType() {
		GBBGame7 g3 = new GBBGame7();
		System.out.println("다시입력하시오.");
		yNum = sc.nextInt();
		if(!(yNum==1 || yNum==2 || yNum==3)) {
			g3.reType();
		}else {
			g3.judge(cNum, yNum);
		}
	}
	
	public void goAction(int Num) {
		if(Num==GAWI) {
			str = "가위";
		}else if(Num==BAWI) {
			str = "바위";
		}else {
			str = "보";
		}
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
