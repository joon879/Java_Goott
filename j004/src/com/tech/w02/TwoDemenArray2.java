package com.tech.w02;

public class TwoDemenArray2 {
	public static void main(String[] args) {
		//2���� �迭 ����
		
		//5, 4 �迭 ����
		//���� 1�� ������ ���� �迭�� ���̰�
		//�� ����� ����Ͻÿ�
		//for�� Ȱ��
		
		int[][] arr = new int[5][4];
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.println(arr[i][j]);
			}
		}
	}
}
