package com.tech.w04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		//array list�� linked list�� ������ ���� �ӵ�����.
		//array list�� �Ź� ��ü �����͸� �̷�� ���� ������ �ӵ��� �ʴ�.
		//linked list�� �ʿ� �������θ� �����͸� �����Ͽ� �����ϱ⿡ ������.
		
		//�и� ������ -> ����ũ�� ������ - > ���� ������(�� * 1/1000)
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList �ɸ� �ð�: ", (endTime - startTime));
		
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList �ɸ� �ð�: ", (endTime - startTime));
	}
}
