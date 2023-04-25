package com.tech.mission;

import java.util.Scanner;

public class ScoreExam5 {
	public static void main(String[] args) {
		//배열 사이즈는 5
		//점수를 입력받아 배열에 저장
		//평균 합계 인원 출력
		//배열의 이름은 scores
		//배열로 총점 매기기, 캡쳐해서 tbasic@daum.net
		//입력제한(0~100)
		//메일제목: 성적처리_홍길동
		
		int[] scores = new int[5];
		Scanner scores1 = new Scanner(System.in);
		
				
		int sum = 0;
		float avg = 0.0f;
		int snum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번 점수 입력: ");
			scores[i] = scores1.nextInt();
			if(!(scores[i]>=0 && scores[i]<=100)) {
				i--;
				continue;
			}
			sum = sum + scores[i];
		}
		

		
		avg = sum / (float)scores.length;
		
		System.out.println("인원: "+scores.length);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
		

		
		
	}
}
