package com.tech.w02;

public class CastExam {
	public static void main(String[] args) {
		//����ȯ casting
		int intValue = 300;
		char charValue = (char) intValue; // ��������ȯ, ���������ȯ: ū ������ -> ���� ����� ���� ��. ���� ����� ��.
		
		// �ƽ�Ű�ڵ� 10, 13 �ǹ� �ִ�?
//		byte < char < short < int < long < float < double
		System.out.println(charValue);
		System.out.println(intValue);
		
		char charValue2 = 'a';
		int intValue2 = charValue2; //�ڵ�����ȯ, ����������ȯ -> ū ����� ���� ��.
		System.out.println(charValue2);
		System.out.println(intValue2);
		
		
	}
}
