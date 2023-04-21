package com.tech.w02;

public class IfElseExam4 {
	public static void main(String[] args) {
//		point를 받기 = 800.
//		point가 900이상 = level1
//		point가 800이상 = level2
//		point가 700이상 = level3
//		나머지는 level0
		
		int point = 500;
		String level = "";
		
		if(point >= 900) {
			level = "Level 1";
		} else if(point >= 800) {
			level = "Level 2";
		} else if(point >= 700) {
			level = "Level 3";
		} else {
			level = "Level 0";
		}
		System.out.println(level);
	}
}
