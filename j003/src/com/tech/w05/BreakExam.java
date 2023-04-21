package com.tech.w05;

import java.util.Iterator;

public class BreakExam {
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				break; //반복문을 탈출. (for)
//			}
//		}
		
//		for(int i = 0; i < 10; i++) {
//			for (int j = 0; j < 3; j++) {
//				if(i==3) {
//					break; //가장 가까운 반복문(for j++)을 탈출한다.
//				}
//				System.out.println("i: "+i+", j: "+j);
//			}	
//		}
		
		gotolabel:
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==3) {
					//break;
					break gotolabel; //멈추고 라벨 다음(아래단?)으로 이동한다.
				}
				System.out.println("i: "+i+", j: "+j);
			}	
		} //여기로!!
	}
}
