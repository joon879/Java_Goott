package com.tech.w02Lunch2;

public class LunchTest {
	public static void main(String[] args) {
//		�޴��̸�(����), ����, ����, ���η�(Ŭ������ �ٸ���) �����Ͽ� + ���
//		��Ż �ݾ� ���� + ���
		Lunch[] lunch = new Lunch[3];
		lunch[0] = new ChinaLunch("������",10000,3,0.4);
		lunch[1] = new OrientLunch("�Ұ���",20000,5,0.3);
		lunch[2] = new WestLunch("�Ƚɽ�",30000,4,0.15);
		
		for (int i = 0; i < lunch.length; i++) {
			System.out.println("=================");
			System.out.println(lunch[i]);
			System.out.println(lunch[i].getTotal());
		}
	}
}
