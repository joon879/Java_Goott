package com.tech.w07generic2;

public class BoxTest {
	public static void main(String[] args) {
//		Box bx = new Box();
		
		//���ʸ� Ȱ��
//		Box<String > bx = new Box<String>();
		
		//���� <��Ʈ��> ���� ����. ��ȣ�� ����
		Box<String> bx = new Box<>();
		bx.setData("Hello");
		
		String str = bx.getData();
		System.out.println(str);
		
		
		
		
		Box<Integer> bx2 = new Box<Integer>();
		bx2.setData(200);
		
		Integer num = bx2.getData();
		System.out.println(num);
		
		

	}
}
