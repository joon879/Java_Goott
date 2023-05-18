package com.tech.w01list;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("全1");
		list.add("全2");
		list.add("全3");
		list.add("全4");
		list.add("全5");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//单捞磐 眠啊 困摹 瘤沥
		list.add(2, "眠啊全2");
		list.add(2, "眠啊全");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//单捞磐 昏力 by index
		list.remove(3);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		
		//单捞磐 葛电 夸家 昏力
		list.clear();		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
	}
}
