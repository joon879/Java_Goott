package com.tech.w03;

public class IfRandomExam {
	public static void main(String[] args) {
		//double score = Math.random();
		//double score = (Math.random()*50) + 50;
		int score = (int) ((Math.random()*50) + 50);
		System.out.println(score);
		
		// score ���� 50�̻��� �ǵ����Ͽ� ��½��Ѷ�.
		
//		���� �ű��
//		90�̻� A
//		80�̻� B
//		70�̻� C
//		60�̻� D
//		������ F
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
		System.out.println("���: "+grade);
		// ���� �߰� Ȧ¦ ����
		// ������ ������ %
		
		if(score % 2 == 1) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("¦����");
		}
	}
}
