package com.tech.w02;

import java.util.Arrays;

public class TwoDemenArray4 {
	public static void main(String[] args) {
		// 2���� �迭 ����

		// 5, 4 �迭 ����
		// ���� 1�� ������ ���� �迭�� ���̰�
		// �� ����� ����Ͻÿ�
		// for�� Ȱ��

		// int[][] arr = new int[5][4];
		int[][] arr = new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[8];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
				
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}
}
