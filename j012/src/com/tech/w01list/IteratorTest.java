package com.tech.w01list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	//�ݺ���
	//ArrayList���� ���ҿ� �����Ͽ� ��Ҹ� �������� ����
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ϳ�1");
		list.add("�ϳ�2");
		list.add("�ϳ�3");
		list.add("�ϳ�4");
		list.add("�ϳ�5");
		list.add("�ϳ�6");
		
		
//		for (String ele : list) {
//			System.out.println(ele);
//		}
		
		
		//�ݺ��� ���
		String s;
		Iterator e = list.iterator(); //����Ʈ�� �ݺ��� ����
		while (e.hasNext()) {
			s = (String) e.next();
			System.out.println(s);
		}
	}
}
