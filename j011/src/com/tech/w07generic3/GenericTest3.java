package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;


class MyList3{
	
	// <? super XXXX> -> 하한이 있는 제너릭
	public static void printList(List<? super Number> list) { //하한으로 Number까지는 허용하겠다. (Object - Number - Double순서)
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

		//메소드 호출
		MyList3.printList(li);
//		MyList3.printList(ls);  //하한과 상관없는 String
		MyList3.printList(ln);
//		MyList3.printList(ld);  //double는 number의 하위로 제한됨.
		MyList3.printList(lo);
		
	}
}
