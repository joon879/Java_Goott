package com.tech.w02;

public class Mission4 {
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
		
		float resultsquare = 0;
		String sname = "";

		if (stype == 4) {
			resultsquare = width * height;
			sname = "�簢��";
			
		} else if (stype == 3) {
			resultsquare = width * height / 2.0f;
			sname = "�ﰢ��";
		}
		System.out.println(sname+"����: "+resultsquare);
	}
}
