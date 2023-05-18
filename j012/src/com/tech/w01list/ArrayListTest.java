package com.tech.w01list;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//List�� �迭ó�� ����� �̸� ������ �ʴ´�.
		list.add("Milk");
		list.add("Milk2");
		list.add("Butter");
		list.add("Apple");
		list.add("Grape");
		list.add("Bread");
		
		//���
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//���� by index
		list.remove(2);		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//���� by value
		list.remove("Apple");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//�߰�(�������� �߰���)
		list.add("Apple");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//��ġ���� �߰�
		list.add(1, "Bread2");		
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("-----------------------");
		
		//����Ʈ�� .size()��!! / �迭�� .length()
		System.out.println("�������: "+list.size());
		System.out.println("�˻�: "+list.get(1));
		System.out.println("Milk2�� �ε����ѹ�: "+list.indexOf("Milk2"));
	}
}
