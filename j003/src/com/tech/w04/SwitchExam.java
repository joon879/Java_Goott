package com.tech.w04;

public class SwitchExam {

	public static void main(String[] args) {
		// �������ڰ� 1~6���� ������ ���� ����
		
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		
		switch (num) {
		case 1: //Ű��(num)�� ����� ���� ǥ��
			//ǥ����
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 5:
			System.out.println("5�Դϴ�.");
			break;
		case 6:
			System.out.println("6�Դϴ�.");
			break;
		default: //������
			System.out.println("������.");
			break;
		}

	}

}
