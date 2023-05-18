package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;



//class MyList2{
//
//	   //������ ���� ���ʸ�
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
		
		//�Ķ���� �ִ� ���ʸ�, �� ���� Ÿ���� ���ʸ�
		OrderVal<String, Integer> pi = new OrderVal<String, Integer>("mykey", 10000);
		System.out.println(pi.getKey()+" , "+pi.getValue());
		
		
		//<String String>�� �����ϴ�. �Լ��� ���ʸ����� �����صּ�. ps��� ��ü ���� �ÿ� ���ʸ� Ÿ���� ������.
		OrderVal<String, String> ps = new OrderVal<String, String>("mykey", "����");
		System.out.println(ps.getKey()+" , "+ps.getValue());
		
		
//		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
//		List<String> ls = Arrays.asList("one", "two", "three");
//		List<Object> lo = Arrays.asList("one", "two", "three");
//
//		//�޼ҵ� ȣ��
//		MyList2.printList(li);
//		MyList2.printList(ls);
//		MyList2.printList(lo);
	}
}
