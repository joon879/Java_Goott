package com.tech.w06;

public class ForExam4 {
	public static void main(String[] args) {
//		for�� �ݺ���

		// �ݺ����� ����� �հ� ���ϱ�
		// ¦���� �հ� even
		// Ȧ���� �հ� odd

		int even = 0, odd = 0; // ��������
		for (int i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}

		// ���� ���
		System.out.println("¦���� �հ�: " + even);
		System.out.println("Ȧ���� �հ�: " + odd);

		even = 0;
		odd = 0; // ��������
		for (int i = 0; i <= 10000; i = i + 2) {
			even += i;
		}
		for (int i = 1; i <= 10000; i = i + 2) {
			odd += i;
		}

		// ���� ���
		System.out.println("¦���� �հ�: " + even);
		System.out.println("Ȧ���� �հ�: " + odd);
	}
}
