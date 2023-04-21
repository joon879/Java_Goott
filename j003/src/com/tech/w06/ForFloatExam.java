package com.tech.w06;

public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print: "+x);
//		}
		
		//printf
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print: %.2f \n",x); //.2: 소숫점 둘째자리까지 표현하라. x를 %에 대입하라.
		}
		
		//printf2
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print: %5.2f \n",x);
		}
		
		int num = 100;
		float score = 100.0f;
		String str = "구디역";
		char ch = '굳';
		
		//printf사용 출력
		System.out.printf("num: %d \n", num);
		System.out.printf("num: %f \n", score);
		System.out.printf("num: %s \n", str);
		System.out.printf("c: %c \n", ch);
		
		System.out.printf("구트는 %s에 있는 %d%% %c %.1f%% \n", str, num, ch, score);
		//%를 출력하고 싶을 때 %를 두 개 입력한다!!
		
	}
}
