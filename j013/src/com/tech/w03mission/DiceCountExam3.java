package com.tech.w03mission;

import java.util.Arrays;

public class DiceCountExam3 {
	
	public static void main(String[] args) {
		//�ֻ����� 1���� ������ 1�� ��ȸ, 2�� ��ȸ ... ��µǵ���.
		
		int size = 6;
		int dice[] = new int[size];
		
		
		for(int i=0; i<10000; i++) {
			++dice[(int)(Math.random()*6)];
		}
		
		System.out.println(Arrays.toString(dice));
		
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i+1)+"�� Ƚ��: "+dice[i]);
		}
	}
}
