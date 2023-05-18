package com.tech.w01list;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("ȫ1");
		list.add("ȫ2");
		list.add("ȫ3");
		list.add("ȫ4");
		list.add("ȫ5");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//������ �߰� ��ġ ����
		list.add(2, "�߰�ȫ2");
		list.add(2, "�߰�ȫ");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//������ ���� by index
		list.remove(3);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//������ ��� ��� ����
		list.clear();		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
	}
}
