package com.tech.mission;

public class AverageReturnExam {
	public static void main(String[] args) {
		/*
		 �Լ��̸� makeAvg
		 �Ķ�����(10,100,150,500,20)
		 ����� ���Ϲ޾� ���ο��� ���
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
