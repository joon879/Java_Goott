package com.tech.w03;

public class IfMission {
	public static void main(String[] args) {
		//���������� �Է¹ް�(100~200)
		//���������� ¦���� Ȧ������ �����ϼ���.
		//�߰��� 3�� ���, 5�� ��� ����.
		//ĸ�� ��������. �ҽ�, ��� ����
		//tbasic@daum.net
		//����: �̽���_����if
		
		int score = (int)((Math.random() * 100) + 100);
		System.out.println(score);
		
		String hol = "";
		String sam ="";
		String oh ="";
		
		if(score % 2 == 0) {
			hol = "¦���Դϴ�.";
		} else {
			hol = "Ȧ���Դϴ�.";
		}
		System.out.println(hol);
		
		if(score % 3 == 0) {
			sam = "3�� ����Դϴ�.";
		} else {
			sam = "3�� ����� �ƴմϴ�.";
		}
		System.out.println(sam);
		
		if(score % 5 == 0) {
			oh = "5�� ����Դϴ�.";
		} else {
			oh = "5�� ����� �ƴմϴ�.";
		}
		System.out.println(oh);
		
		if(score % 2 == 0 && score % 3 == 0 && score % 5 == 0) {
			oh = "2, 3, 5�� ����Դϴ�.";
		} else {
			oh = "2, 3, 5�� ����� �ƴմϴ�.";
		}
		System.out.println(oh);
		
	}
}
