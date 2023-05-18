package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;

public class GenericTest1 {

	//������ �ִ� ���ʸ�
	public static void main(String[] args) {
		
		
//		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> li = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5); 
		//NumberŸ�� ���� Ŭ�����̱⿡ �Ʒ��� ������ �ִ� ���ʸ� ��� ����.
		
		System.out.println(sumOfList(li));
	}

	
	//<? extends Number> -> ������ �ִ� ���ʸ�.(Number������ ���ڴ�)
	private static double sumOfList(List<? extends Number> list) { 
		double s =0.0;
		for (Object n : list) {
			s += Double.parseDouble(n.toString());
		}
		return s;
	}
}
