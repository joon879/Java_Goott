package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;


class MyList3{
	
	// <? super XXXX> -> ������ �ִ� ���ʸ�
	public static void printList(List<? super Number> list) { //�������� Number������ ����ϰڴ�. (Object - Number - Double����)
		for (Object elem : list) {
			System.out.print(elem +" ");
		}
		System.out.println();
	}	
}


public class GenericTest3 {

	public static void main(String[] args) {
		
		
		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
		List<String> ls = Arrays.asList("one", "two", "three");
		List<Number> ln = Arrays.asList(1, 2, 3);
		List<Double> ld = Arrays.asList(1.1, 2.2, 3.3);		
		List<Object> lo = Arrays.asList("one", "two", "three");

		//�޼ҵ� ȣ��
		MyList3.printList(li);
//		MyList3.printList(ls);  //���Ѱ� ������� String
		MyList3.printList(ln);
//		MyList3.printList(ld);  //double�� number�� ������ ���ѵ�.
		MyList3.printList(lo);
		
	}
}
