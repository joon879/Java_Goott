package com.tech.mission;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		//배열 사이즈는 5
		//점수를 입력받아 배열에 저장
		//평균 합계 인원 출력
		//배열의 이름은 scores
		//배열로 총점 매기기, 캡쳐해서 tbasic@daum.net
		//입력제한(0~100)
		//메일제목: 성적처리_홍길동
		
		int[] scores = new int[5];
		int sum = 0;
		float avg = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생 "+(i+1)+"번의 점수를 입력해주세요.");
			scores[i] = scan.nextInt();
			if(scores[i]<0 || scores[i]>100) {
				System.out.println("0~100까지만 입력해주십시오.");
				i = i - 1; //잘못된 입력이 들어올 시 다시 한번 입력.
			}else {
				sum = sum + scores[i];
			}
		}
		
		avg = (float)sum / scores.length;
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("총인원: "+scores.length);
		
		
		
		
		
	}
}
