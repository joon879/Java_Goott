package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame {
	public static void main(String[] args) {
		/*
		 출력: 컴: 가위, 유저: 바위, 유저승
		 가위 1, 바위 2, 보 3
		 컴퓨터는 랜덤.
		 두 값을 입력받기 Scanner, Random
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("GBB Game Start!!");
		System.out.println("================");
		System.out.println("사용자님 1(가위), 2(바위), 3(보) 중 하나를 입력하세요.");
		System.out.println("================");
		
		int user = scan.nextInt();
		int com = ran.nextInt(3)+1;
		
		String user_result ="";
		
		
		if(user==1) {
			user_result = "가위";
		}else if(user==2) {
			user_result = "바위";
		}else {
			user_result = "보";
		}
		
		String com_result ="";
		if(com==1) {
			com_result = "가위";
		}else if(com==2) {
			com_result = "바위";
		}else {
			com_result = "보";
		}
		
		System.out.println("사용자: "+user_result);
		System.out.println("컴퓨터: "+com_result);
		
		
		if(user==1) {
			if(com==1) {
				System.out.println("비겼습니다");
			}else if(com==2) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("사용자가 이겼습니다.");
			}
		}else if(user==2) {
			if(com==1) {
				System.out.println("사용자가 이겼습니다");
			}else if(com==2) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}else {
			if(com==1) {
				System.out.println("컴퓨터가 이겼습니다");
			}else if(com==2) {
				System.out.println("사용자가 이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}		
	}
}
