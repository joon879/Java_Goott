package com.tech.w02;

public class IfElseExam2 {
	public static void main(String[] args) {
//		point�� �ޱ� = 800.
//		point�� 900�̻� = level1
//		point�� 800�̻� = level2
//		point�� 700�̻� = level3
//		�������� level0
		
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
