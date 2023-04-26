package com.tech.w01;

enum Season{
	봄, 여름, 가을, 겨울, 겨울2
}

public class EnumExam {
	public static void main(String[] args) {
		//Enum class활용 열거형 클래스
		
		//foreach
		for (Season sea : Season.values()) {
			System.out.println(sea);
		}
		//직접접근
		Season season23 = Season.가을;
		System.out.println("다이렉트 접근: "+season23);
	}
}
