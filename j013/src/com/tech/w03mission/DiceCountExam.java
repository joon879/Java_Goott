package com.tech.w03mission;

public class DiceCountExam {
	
	public static void main(String[] args) {
		//주사위를 1만번 던져서 1이 몇회, 2가 몇회 ... 출력되도록.
		
		int dNum;
//		int[] cnt = {0,0,0,0,0,0};
		int[] cnt = new int[6]; //0으로 초기화가 기본
		
		
		for(int i=0; i<10000; i++) {
			dNum = (int)(Math.random()*6)+1;
//			System.out.println(dNum);
			
			if(dNum == 1) {
				cnt[0]++;
			}
			else if(dNum == 2) {
				cnt[1]++;
			}
			else if(dNum == 3) {
				cnt[2]++;
			}
			else if(dNum == 4) {
				cnt[3]++;
			}
			else if(dNum == 5) {
				cnt[4]++;
			}
			else if(dNum == 6) {
				cnt[5]++;
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.println((i+1)+"의 횟수: "+cnt[i]);
		}
	}
}
