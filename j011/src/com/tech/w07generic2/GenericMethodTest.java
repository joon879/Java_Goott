package com.tech.w07generic2;


class GenericMethod{

	//���ʸ� ������ �޼ҵ� ���
	
	public static <T> T getLast(T[] a) { //�迭�� �Ķ���ͷ� �ް�.
		return a[a.length-1]; 
		//���� Ÿ��(T=String)�� �迭�� �� ���=(�迭[2]->�迭�� ��� ����.)
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
