package com.tech.w02;

public class Mission2 {
	public static void main(String[] args) {
//		���� ���ϱ�
//		���� 100 width
//		���� 50 height
//		�簢�� ���� recsquare
//		�ﰢ�� ���� trisquare
//		Ÿ�� ���� stype = 4, 3 -> 4�̸� �簢��, 3�̸� �ﰢ��		
		
		int width = 5;
		int height = 5;
		int stype = 3;
		
		float recsquare = width * height;
		float trisquare = width * height / 2.0f;
		
		if(stype == 4) {
			System.out.println("�簢�� ����: "+recsquare);
		} else if(stype == 3) {
			System.out.println("�ﰢ�� ����: "+trisquare);
		}
		
	}
}
