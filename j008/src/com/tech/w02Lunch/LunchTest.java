package com.tech.w02Lunch;

public class LunchTest {
	public static void main(String[] args) {
//		�޴��̸�(����), ����, ����, ���η�(Ŭ������ �ٸ���) �����Ͽ� + ���
//		��Ż �ݾ� ���� + ���
		
		
		Lunch lun1 = new ChinaLunch("¥���",10000,1,10);
		Lunch lun2 = new OrientLunch("ī��",15000,2,20);
		Lunch lun3 = new WestLunch("������ũ",30000,3,30);
		//�ڽ��� �Լ��� �θ� Ÿ���� ��ü���� ��� �Ұ�.
	
		System.out.println(lun1);
		System.out.println();
		System.out.println(lun2);
		System.out.println();
		System.out.println(lun3);
		
		System.out.println(lun2.dcPrice());
		
	
	}
}
