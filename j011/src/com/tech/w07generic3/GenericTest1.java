package com.tech.w07generic3;

import java.util.Arrays;
import java.util.List;

public class GenericTest1 {

	//상한이 있는 제너릭
	public static void main(String[] args) {
		
		
//		List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> li = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5); 
		//Number타입 하위 클래스이기에 아래의 상한이 있는 제너릭 사용 가능.
		
		System.out.println(sumOfList(li));
	}

	
	//<? extends Number> -> 상한이 있는 제너릭.(Number까지만 쓰겠다)
	private static double sumOfList(List<? extends Number> list) { 
		double s =0.0;
		for (Object n : list) {
			s += Double.parseDouble(n.toString());
		}
		return s;
	}
}
