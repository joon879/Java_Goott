package com.tech.w05;

import java.util.Iterator;

public class BreakExam {
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				break; //�ݺ����� Ż��. (for)
//			}
//		}
		
//		for(int i = 0; i < 10; i++) {
//			for (int j = 0; j < 3; j++) {
//				if(i==3) {
//					break; //���� ����� �ݺ���(for j++)�� Ż���Ѵ�.
//				}
//				System.out.println("i: "+i+", j: "+j);
//			}	
//		}
		
		gotolabel:
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==3) {
					//break;
					break gotolabel; //���߰� �� ����(�Ʒ���?)���� �̵��Ѵ�.
				}
				System.out.println("i: "+i+", j: "+j);
			}	
		} //�����!!
	}
}
