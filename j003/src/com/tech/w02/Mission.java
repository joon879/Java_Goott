package com.tech.w02;

public class Mission {
	public static void main(String[] args) {
//		���� ���ϱ�
//		���� 100 width
//		���� 50 height
//		�簢�� ���� recsquare
//		�ﰢ�� ���� trisquare
		
		int width = 5;
		int height = 5;
		
		float recsquare = width * height;
		float trisquare = width * height / 2.0f;
		
		System.out.println("�簢�� ����: "+recsquare);
		System.out.println("�ﰢ�� ����: "+trisquare);
	}
}
