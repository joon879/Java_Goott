package com.tech.w01;

public class StringConcatExam {
	public static void main(String[] args) {
		String str1 = "JKD" + 6.0;
		// 6.0�� float�� double�� �ϳ��ε� f �� ������ double��
		// double�� d�� ���� �����ص� ��.
		// float�� f ���� �Ұ�.
		
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		System.out.println();
		
		String str3 = "jdk"+3+3+3+3.0; // ������ ��Ʈ���̶� �ܼ��ϰ� �̾. ��ü ��Ʈ������!
		String str4 = 3+3+3.0+"jdk"; // ������ ���ڶ� ���ڳ��� ���ϴٰ� ���ڿ��� �̾.
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str1.concat(str4); // �� ���ڿ� ����.
		System.out.println(str5);
	}
}
