package com.tech.w04;

public class SwitchExam5 {

	public static void main(String[] args) {
		//1������ 12���� �������� ���ڸ� �Է¹޾Ƽ�
		//�� 345, ���� 678, ����910, �ܿ� ������ ��� 
		int num = (int)(Math.random()*12) + 1;
		System.out.println(num);
		
		switch (num) {
		case 3:	
		case 4:	
		case 5:	System.out.println("��");	break;
		case 6:	
		case 7:	
		case 8:	System.out.println("����");	break;
		case 9:	
		case 10:System.out.println("����");	break;		
		default: System.out.println("�ܿ�");	break;
		}
	}

}
