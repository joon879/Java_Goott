package com.tech.w14;

public class HobbyTest {
	public static void main(String[] args) {
//		��� ���1 ���2 ���3
//		������ ���: ������
//		����� Hobby���� ����
//		�����ڸ� ���ؼ� �������
		
//		Hobby hb = new Hobby("���ڹ�", "�౸", "�߱�", "��");
		Hobby hb = new Hobby();
		
		//setter�� Ȱ���� ������ ����
		hb.setName("����");
		hb.setHob1("��");
		hb.setHob2("�ٵ�");
		hb.setHob3("����");
		
		System.out.println(hb.getName()+"�� ��̴� "+hb.getHob1()+
				", "+hb.getHob2()+
				", "+hb.getHob3());
	}
}
