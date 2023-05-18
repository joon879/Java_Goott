package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;


class MyList{
	
	//<?> -> ����(����)�� ���� ���ʸ�
	public static void printList(List<?> list) { 
		for (Object elem : list) {
			System.out.print(elem +" ");
		}
		System.out.println();
	}	
}


public class GenericTest2 {

	public static void main(String[] args) {
		
		
		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
		List<String> ls = Arrays.asList("one", "two", "three");
		List<Object> lo = Arrays.asList("one", "two", "three");

		//�޼ҵ� ȣ��
		MyList.printList(li);
		MyList.printList(ls);
		MyList.printList(lo);
		
	}
}
