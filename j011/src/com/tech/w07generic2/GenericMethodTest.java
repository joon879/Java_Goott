package com.tech.w07generic2;


class GenericMethod{

	//제너릭 형식의 메소드 사용
	
	public static <T> T getLast(T[] a) { //배열을 파라미터로 받고.
		return a[a.length-1]; 
		//리턴 타입(T=String)은 배열의 한 요소=(배열[2]->배열의 요소 리턴.)
	}
	
}

public class GenericMethodTest {
	public static void main(String[] args) {
		String[] language = new String[3];
		language[0] = "C#";
		language[1] = "C++";
		language[2] = "Java";
		
		String last = GenericMethod.getLast(language);
		System.out.println(last);
	}
}
