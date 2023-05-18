package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;



//class MyList2{
//
//	   //제한이 없는 제너릭
//	   public static void printList(List<?> list) {
//	      for (Object elem : list) {
//	         System.out.print(elem+" ");
//	      }
//	      System.out.println();
//	   }
//	   
//	}


class OrderVal<K, V>{
	
	private K key;
	private V value;
	
	public OrderVal(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class OrderTest {
	public static void main(String[] args) {
		
		//파라미터 있는 제너릭, 두 가지 타입의 제너릭
		OrderVal<String, Integer> pi = new OrderVal<String, Integer>("mykey", 10000);
		System.out.println(pi.getKey()+" , "+pi.getValue());
		
		
		//<String String>도 가능하다. 함수를 제너릭으로 선언해둬서. ps라는 객체 생성 시에 제너릭 타입이 결정됨.
		OrderVal<String, String> ps = new OrderVal<String, String>("mykey", "만원");
		System.out.println(ps.getKey()+" , "+ps.getValue());
		
		
//		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
//		List<String> ls = Arrays.asList("one", "two", "three");
//		List<Object> lo = Arrays.asList("one", "two", "three");
//
//		//메소드 호출
//		MyList2.printList(li);
//		MyList2.printList(ls);
//		MyList2.printList(lo);
	}
}
