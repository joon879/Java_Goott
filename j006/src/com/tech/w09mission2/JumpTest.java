package com.tech.w09mission2;

public class JumpTest {
	public static void main(String[] args) {
//		getItem�̶�� �޼ҵ带 �����
//		����(�ϸ�) -- 1000 ����
//		�������� -- 3000
//		���� ų -- 5000
//		
//		���ο��� ����� ���
//		����Ʈ: 1000
//		����Ʈ: 3000
//		����Ʈ: 5000
		
		ItemTrans it = new ItemTrans();
		it.getItem("����");
		System.out.println("����Ʈ "+it.getPoint()+" ȹ��.");
//		System.out.println("���� ����Ʈ: "+it.getTotal());
		
		it.getItem("��������");
		System.out.println("����Ʈ "+it.getPoint()+" ȹ��.");
//		System.out.println("���� ����Ʈ: "+it.getTotal());
		
		it.getItem("ų");
		System.out.println("����Ʈ "+it.getPoint()+" ȹ��.");
		System.out.println("���� ����Ʈ: "+it.getTotal());
		
		
	}
}
