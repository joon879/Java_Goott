package com.tech.w08;

public class ProfessorMgrTest {
	public static void main(String[] args) {
//		�̸��� �����ϰ� (StudentName����)
//		�ش��ϴ� ��й�ȣ�� ���Ϲ޾� ���ο��� ���
//		ȫ�浿 �Է��ϸ� -> 1234
//		ȫ��� 5678
//		���ο��� ���: ȫ�浿 ��й�ȣ�� 1234�̴�.
		
		StudentName sn = new StudentName();
		String name = "ȫ���";
		sn.passSet(name);
		
		System.out.println(name+" ��й�ȣ�� "+sn.getPass()+"�̴�.");
	}
}
