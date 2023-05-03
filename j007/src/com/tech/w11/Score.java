package com.tech.w11;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int mat;
		
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public float getTotal() {
		float tot = kor + eng + mat;
		return tot;
	}
	
	public float getAvg() {
		float avg = (kor + eng + mat) / (float)3;
		return avg;
	}

	public String getName() {
		return name;
	}


	
	
}
