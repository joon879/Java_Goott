package com.tech.w04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		//array list와 linked list의 데이터 삽입 속도차이.
		//array list는 매번 전체 데이터를 미루고 당기기 때문에 속도가 늦다.
		//linked list는 필요 지점으로만 데이터를 연결하여 삽입하기에 빠르다.
		
		//밀리 세컨드 -> 마이크로 세컨드 - > 나노 세컨드(각 * 1/1000)
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));
		
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));
	}
}
