package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

public class FindSetTest2 {
	public static void main(String[] args) {
		
		//� �����Ͱ� �ߺ��Ǵ��� ����غ���!!
		
		
		Set<String> s = new HashSet<String>(); //set: ����.
		String[] sample = {"Butter", "Apple", "Orange", "Butter", "Apple"};
		System.out.println(s);
		
		//sample�� �����͸� s�� �߰�
		for (String ele : sample) {
			//�����Ͱ� �ߺ��Ǹ� �ڵ�� ����.
			if (!s.add(ele)) {
				//�ߺ��Ǿ� ������!�� �����̴�. �Ʒ��� ���Ǻ������ �̵�
				//if�� ���ǹ�(��ȣ��)�� ������ true�� ����Ʈ.
				//Set�� �̹� ����ִ�(�ߺ�) �������̸� false�� ��ȯ�Ѵ�.
				//(!s.add(ele))��
				//(s.add(ele) == false)�� ������ �����̴�.
	
				System.out.println("�ߺ�������: "+ele);
			}
		}
		
		//set�� �ߺ� �����.
		System.out.println(s);
	}
}
