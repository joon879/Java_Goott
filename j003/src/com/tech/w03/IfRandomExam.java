package com.tech.w03;

public class IfRandomExam {
	public static void main(String[] args) {
		//double score = Math.random();
		//double score = (Math.random()*50) + 50;
		int score = (int) ((Math.random()*50) + 50);
		System.out.println(score);
		
		// score 값이 50이상이 되도록하여 출력시켜라.
		
//		평점 매기기
//		90이상 A
//		80이상 B
//		70이상 C
//		60이상 D
//		나머지 F
		String grade = "";
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80){
			grade = "B";
		} else if(score >= 70){
			grade = "C";
		} else if(score >= 60){
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("등급: "+grade);
		// 내용 추가 홀짝 구분
		// 나머지 연산자 %
		
		if(score % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("짝수다");
		}
	}
}
