package com.tech.mission;

import java.util.Scanner;

public class ScoreExam2 {
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
		Scanner scores2 = new Scanner(System.in);
		Scanner scores3 = new Scanner(System.in);
		Scanner scores4 = new Scanner(System.in);
		Scanner scores5 = new Scanner(System.in);
		
		System.out.println("1번 점수 입력: ");
		int a = scores1.nextInt();
		System.out.println("2번 점수 입력: ");
		int b = scores2.nextInt();
		System.out.println("3번 점수 입력: ");
		int c = scores3.nextInt();
		System.out.println("4번 점수 입력: ");
		int d = scores4.nextInt();
		System.out.println("5번 점수 입력: ");
		int e = scores5.nextInt();
		
		int sum = a + b + c + d + e;
		float avg = 1.0f;
		avg = sum / scores.length;
				
		System.out.println("인원: "+scores.length);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
		
		
		
		
	}
}
