package com.tech.w11;

public class ScoreTest {
	public static void main(String[] args) {
//		���� ���� ���� ����
//		������ ���� 300
//		������ ��� 100
//		����� Score���� ����
//		�����ڸ� ���ؼ� ��������
		
//		ȫ�浿�� ���� getTotal: 240
//		ȫ�浿�� ��� getAvg: 80
		Score sc = new Score("ȫ�浿", 50, 50, 100);
		
		System.out.println(sc.getName()+"�� ����: "+sc.getTotal());
		System.out.println(sc.getName()+"�� ���: "+sc.getAvg());
		
	}
}
