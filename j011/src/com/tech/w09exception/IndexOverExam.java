package com.tech.w09exception;

public class IndexOverExam {
	//����ó��
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		try {
			System.out.println(array[99]);
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
//			e.printStackTrace();
		}
	}
}
//���ܻ�Ȳ
//����� �Է¿���: ����ڰ� ���ڸ� �߸� �Է�, ���ڷ� �Է� ��
//��ġ ����: ��Ʈ��ũ ����, ��ũ ���� ��
//�ڵ����: �Է��ڵ� ����, �迭�� �ε��� ��ȣ ��