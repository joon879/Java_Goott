package com.tech.w03mission;

public class DiceCountExam {
	
	public static void main(String[] args) {
		//�ֻ����� 1���� ������ 1�� ��ȸ, 2�� ��ȸ ... ��µǵ���.
		
		int dNum;
//		int[] cnt = {0,0,0,0,0,0};
		int[] cnt = new int[6]; //0���� �ʱ�ȭ�� �⺻
		
		
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
			System.out.println((i+1)+"�� Ƚ��: "+cnt[i]);
		}
	}
}
