package com.tech.w02;

public class UnicodeExam {

	public static void main(String[] args) {
		// �����ڵ� ����
		char char1 = '��';
		char uni1 = '\uac00';
		System.out.println(char1);
		System.out.println(uni1);
		
		double vv = 3e6; // 3���ϱ� 10�� 6����
		System.out.println(vv);
		
		char uni2 = '\uc774';
		char uni3 = '\uc2b9';
		char uni4 = '\uc900';
		
		System.out.println(uni2);
		System.out.println(uni3);
		System.out.println(uni4);
		System.out.println("�̸�: "+uni2 + uni3 + uni4);
		
		
	}

}
