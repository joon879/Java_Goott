package com.tech.w02;

import java.util.Arrays;

public class TwoDemenArray3 {
	public static void main(String[] args) {
		// 2���� �迭 ����

		// 5, 4 �迭 ����
		// ���� 1�� ������ ���� �迭�� ���̰�
		// �� ����� ����Ͻÿ�
		// for�� Ȱ��

		int[][] arr = new int[5][4];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
