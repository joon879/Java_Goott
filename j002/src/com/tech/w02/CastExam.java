package com.tech.w02;

public class CastExam {
	public static void main(String[] args) {
		//형변환 casting
		int intValue = 300;
		char charValue = (char) intValue; // 강제형변환, 명시적형변환: 큰 사이즈 -> 작은 사이즈에 넣을 때. 직접 해줘야 함.
		
		// 아스키코드 10, 13 의미 있다?
//		byte < char < short < int < long < float < double
		System.out.println(charValue);
		System.out.println(intValue);
		
		char charValue2 = 'a';
		int intValue2 = charValue2; //자동형변환, 묵시적형변환 -> 큰 사이즈에 넣을 때.
		System.out.println(charValue2);
		System.out.println(intValue2);
		
		
	}
}
