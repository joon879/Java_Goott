package com.tech.w01;

public class ArrayExam1 {

	public static void main(String[] args) {
//		int score1 = 0;
//		int score2 = 0;
//		int score3 = 100;
//		int score4 = 200;
//		int score5 = 20;
//		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
		
// 		�迭����
		int[] scores = new int[10];
		//Index number�� 0���� ����.
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
				
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
//		System.out.println(scores[5]); -> Index 5 out of bounds.
		
		//�ݺ����� Ȱ���� ���
		for (int i = 0;  i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println(scores.length);
	}
}
