package com.tech.w06;

public class ForExam2 {
	public static void main(String[] args) {
//		for�� �ݺ���
		
		//�ݺ����� ����� �հ� ���ϱ� 1~10
		int sum = 0; // ��������
		for (int i = 0; i <= 10; i++) {
			//����
			sum = sum + i;
			System.out.println(i+"�ݺ�");
		}
		//���� ���
		System.out.println("total: "+sum);
	}
}
