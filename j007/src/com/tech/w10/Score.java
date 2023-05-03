package com.tech.w10;

public class Score {
	private String name;
	private int total;
	private double avg;
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		total = kor + eng + math;
		avg = (double)(total / 3);
	}
	
	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	
	
}
