package com.tech.mission;

public class AverageReturnExam2 {
	public static void main(String[] args) {
		
		AverageReturnExam2 ar2 = new AverageReturnExam2();
		int result = ar2.intAvg(100, 100.7f, 150, 500.5f);
		System.out.println(result);
	}
	
	public int intAvg(float a, float b, float c, float d) {
		float ma = a;
		float mb = b;
		float mc = c;
		float md = d;
		
		float avg = (ma+mb+mc+md) / 4;
		
		return (int) avg;
	}
}
