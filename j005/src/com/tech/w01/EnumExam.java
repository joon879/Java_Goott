package com.tech.w01;

enum Season{
	��, ����, ����, �ܿ�, �ܿ�2
}

public class EnumExam {
	public static void main(String[] args) {
		//Enum classȰ�� ������ Ŭ����
		
		//foreach
		for (Season sea : Season.values()) {
			System.out.println(sea);
		}
		//��������
		Season season23 = Season.����;
		System.out.println("���̷�Ʈ ����: "+season23);
	}
}
