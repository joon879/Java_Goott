package com.tech.w09exception;

import java.io.IOException;

public class InputStreamExam {
	
	public static void main(String[] args) throws IOException {
		System.out.println("String �Է�");
		int r = 0;
		while ((r = System.in.read()) != -1) { //�Է°� ���°� -1�̴�. �Է°� ���� ������ ���� ����.
			System.out.print("�Է°� = ");
			if(r != 10 && r != 13) {//����
				System.out.write(r); // ���ڴ����� �о����.
			}
			System.out.println("�� �ƽ�Ű �ڵ尪: "+r);
		}
		System.out.println("Enddddddd");
	}
}
