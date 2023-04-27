package com.tech.mission;

public class AverageReturnExam {
	public static void main(String[] args) {
		/*
		 함수이름 makeAvg
		 파람전달(10,100,150,500,20)
		 평균을 리턴받아 메인에서 출력
		 */ 
		AverageReturnExam ar = new AverageReturnExam();
		float result = ar.makeAvg(10, 100, 150, 500, 20);
		System.out.println(result);
		
	}
	
	public float makeAvg(int a, int b, int c, int d, int e) {
		int ma = a;
		int mb = b;
		int mc = c;
		int md = d;
		int me = e;
		float avg = (ma+mb+mc+md+me) / 5;
		
		return avg;
	}

}
