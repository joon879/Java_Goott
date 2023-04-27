package com.tech.mission;

public class ArrayScoreByNameSum2 {
	public static void main(String[] args) {
		
		String[][] name = {
				{"    ", "국어","영어"},
				{"학생A", "10", "20"},
				{"학생B", "30", "40"},
				{"학생C", "50", "60"}
		};
		
		int sum = 0;
		for (int i = 1; i < name.length; i++) {
			for (int j = 1; j < name[i].length; j++) {
				sum += Integer.parseInt(name[i][j]);
			}
			if(i==1) {
				System.out.println(name[i][0]+" 점수 합계: "+sum);
			}else if(i==2) {
				System.out.println(name[i][0]+" 점수 합계: "+sum);
			}else {
				System.out.println(name[i][0]+" 점수 합계: "+sum);
			}
			sum = 0;
		}		
	}
}
