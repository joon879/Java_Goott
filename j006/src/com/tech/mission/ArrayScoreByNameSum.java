package com.tech.mission;

public class ArrayScoreByNameSum {
	public static void main(String[] args) {
		/*
		 �л� 3���� ����, ���� ����.
		 2���� �迭
		 �̸�, ���� ���� �Է¹ޱ�
		 ���: 
		 �̸� ����+���� ������ ��:����
		 �̸� ����+���� ������ ��:����
		 �̸� ����+���� ������ ��:����
		 */
		
		
//		String[][] name = {
//				{"A", "10", "20"},
//				{"B", "30", "40"},
//				{"C", "50", "60"}
//		};
		
		
		int[][] student = {
				{10, 20},
				{30, 40},
				{50, 60}
		};
		
		int sum = 0;
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				sum += student[i][j];			
			}
			if(i==0) {
				System.out.println("�л�A ���� �հ�: "+sum);
			}else if(i==1) {
				System.out.println("�л�B ���� �հ�: "+sum);
			}else {
				System.out.println("�л�C ���� �հ�: "+sum);
			}
			sum = 0;
		}
		
			
		
		
		

//		for (int i = 0; i < name.length; i++) {
//			for (int j = 1; j < name[i].length; j++) {
//				//System.out.println(student[i][j]);
//				sum += Integer.parseInt(name[i][j]);
//			}
//			System.out.println(name[0][0]);
//			System.out.println(name[i]+"�� ��: "+sum);
//			sum = 0;
//		}
		
		
//		int A_kor = Integer.parseInt(name[0][1]);
//		int A_eng = Integer.parseInt(name[0][2]);
//		
//		System.out.println(A_kor);
//		System.out.println(A_eng);
//		System.out.println(A_kor+A_eng);
//		
		

	
		
	}

}
