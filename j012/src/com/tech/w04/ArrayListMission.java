package com.tech.w04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMission {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�浿1");
		list.add("�浿2");
		list.add("�浿1");
		list.add("�浿3");
		list.add("�浿1");
		list.add("�浿1");
		list.add("�浿4");
		list.add("�浿1");

		// remove by value
//		list.remove("�浿4");

		// remove by index
//		int a = list.indexOf("�浿4");
//		list.remove(a);		
		list.remove(list.indexOf("�浿4"));

		
		
		
		
		
		// �浿1�� ��� ����
//		System.out.println(list.indexOf("�浿6")); // ����Ʈ�� ���� �ε����� ����ϸ� <<-1>>�� �����Ѵ�.
		while (list.indexOf("�浿1") != -1) {
			list.remove("�浿1");
		}
		
		//���ٽ��� ����Ͽ� �浿1�� ��� ����
		list.removeIf(listss -> listss.equals("�浿1"));
		
		//removeall�� ����Ͽ� �浿1�� ��� ����
		list.removeAll(Arrays.asList("�浿1"));
		

		for (String ele : list) {
			System.out.println(ele + " ");
		}
	}
}
