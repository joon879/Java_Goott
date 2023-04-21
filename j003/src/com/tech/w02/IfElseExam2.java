package com.tech.w02;

public class IfElseExam2 {
	public static void main(String[] args) {
//		point를 받기 = 800.
//		point가 900이상 = level1
//		point가 800이상 = level2
//		point가 700이상 = level3
//		나머지는 level0
		
		int point = 800;
		
		if(point >= 900) {
			System.out.println("Level 1");
		} else if(point >= 800) {
			System.out.println("Level 2");
		} else if(point >= 700) {
			System.out.println("Level 3");
		} else {
			System.out.println("Level 0");
		}
	}
}
