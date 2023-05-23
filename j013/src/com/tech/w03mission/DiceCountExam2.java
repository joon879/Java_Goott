package com.tech.w03mission;

import java.util.Arrays;

public class DiceCountExam2 {
	
	public static void main(String[] args) {
		//주사위를 1만번 던져서 1이 몇회, 2가 몇회 ... 출력되도록.
		
		int size = 6;
		int dice[] = new int[size];
		
		
		for(int i=0; i<10000; i++) {
			int val = (int)(Math.random()*6);
//			
			switch (val) {
			case 0:
				++dice[0];
				break;
			case 1:
				++dice[1];
				break;

			case 2:
				++dice[2];
				break;

			case 3:
				++dice[3];
				break;

			case 4:
				++dice[4];
				break;

			case 5:
				++dice[5];
				break;


			default:
				break;
			}
		}
		
		System.out.println(Arrays.toString(dice));
		
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i+1)+"의 횟수: "+dice[i]);
		}
	}
}
