package com.tech.w01;

public class ArrayExam5 {
	public static void main(String[] args) {
		// int[] arr = new int[5];
		// �迭���� �ٸ� ���
		int[] arr = { 10, 20, 30, 40, 53};
		
		//���� �ű��
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		float avg = (float)sum / arr.length; //����ȯ ���־�� �Ҽ��� ��Ƴ�.
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		System.out.println("�ο���: "+arr.length);
	}
}
