package com.tech.w05;

public class ContinueExam {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				continue; //������ �ݺ����� Ż���ϰ� �ݺ��� ���������� �ٽ� �ö󰣴�. break�� �ٸ�.
			}
			System.out.println("���� i: "+i);
		}
	}
}
