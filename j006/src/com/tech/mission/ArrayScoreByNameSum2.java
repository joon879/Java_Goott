package com.tech.mission;

public class ArrayScoreByNameSum2 {
	public static void main(String[] args) {
		
		String[][] name = {
				{"    ", "����","����"},
				{"�л�A", "10", "20"},
				{"�л�B", "30", "40"},
				{"�л�C", "50", "60"}
		};
		
		int sum = 0;
		for (int i = 1; i < name.length; i++) {
			for (int j = 1; j < name[i].length; j++) {
				sum += Integer.parseInt(name[i][j]);
			}
			if(i==1) {
				System.out.println(name[i][0]+" ���� �հ�: "+sum);
			}else if(i==2) {
				System.out.println(name[i][0]+" ���� �հ�: "+sum);
			}else {
				System.out.println(name[i][0]+" ���� �հ�: "+sum);
			}
			sum = 0;
		}		
	}
}
