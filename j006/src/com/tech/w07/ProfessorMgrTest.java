package com.tech.w07;

public class ProfessorMgrTest {
	public static void main(String[] args) {
//		�̸��� �����ϰ� (StudentName����)
//		�ش��ϴ� ��й�ȣ�� ���Ϲ޾� ���ο��� ���
//		ȫ�浿 �Է��ϸ� -> 1234
//		ȫ��� 5678
//		���ο��� ���: ȫ�浿 ��й�ȣ�� 1234�̴�.
		
		StudentName st_name = new StudentName();
		st_name.Judge("ȫ�浿");
		System.out.println("ȫ�浿�� PASS�� "+st_name.getPass());
		
		st_name.Judge("ȫ���");
		System.out.println("ȫ����� PASS�� "+st_name.getPass());
	}
}
