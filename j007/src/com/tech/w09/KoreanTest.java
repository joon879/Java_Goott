package com.tech.w09;

public class KoreanTest {
	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "123456-123456");
		
		//������ ������ ���(private�̶� �ٷ� ���� �Ұ�)
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);
		
		//�޼ҵ带 ���� ����
		System.out.println(k1.getName());
		System.out.println(k1.getSsn());
	}
}
