package com.tech.w08;

public class ConstructClass {
	//������(Constructor) ����
	//(����Ÿ�� ���� Ŭ���� �̸��� ������ �޼ҵ� ����)
	
	
	
	//�⺻ �����ڴ� ���� ����, �ڵ����� ���ο� �����Ǿ� ����.
	//but! ����� �����ڰ� ���� �ÿ� �⺻ ������ �ۼ� ���� �Ұ�?
	
	public ConstructClass() {//�⺻ ������
		System.out.println("�⺻ ������ ȣ��!!");
	}
	
	public ConstructClass(String name) {//����� ������1
		System.out.println(name+" ȣ��(����� ������1 ȣ��)");
	}
	
	public ConstructClass(String name, float score) {//����� ������2
		System.out.println(name+"�� ������(����� ������2 ȣ��): "+score);
	}
	
	public ConstructClass(String string, int i, int j) {//����� ������3
		
	}

	//�Ϲ� �޼ҵ�
	public void aaa() {
		
	}
	
	public static void main(String[] args) {
		new ConstructClass(); //������ ȣ��
		
		new ConstructClass("ȫ�浿"); //����� ������1 ȣ��
				
		new ConstructClass("ȫ�浿", 100.0f);//����� ������2 ȣ��
		
		new ConstructClass("ȫ�浿", 100, 100);//����� ������3 ȣ��
		
	}
}
