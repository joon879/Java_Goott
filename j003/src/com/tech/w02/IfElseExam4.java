package com.tech.w02;

public class IfElseExam4 {
	public static void main(String[] args) {
//		point�� �ޱ� = 800.
//		point�� 900�̻� = level1
//		point�� 800�̻� = level2
//		point�� 700�̻� = level3
//		�������� level0
		
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
