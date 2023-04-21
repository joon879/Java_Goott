package com.tech.w02;

public class DenyLogicalOperExam {

	public static void main(String[] args) {
		// boolean, not 함수 이해
		
		boolean play1 = false;
		boolean play2 = false;
		System.out.println(play1);

		//역함수 not
		play1 =! play1;
		System.out.println(play1);
		
		// and = 둘 다 true일 때 결과가 true (하나라도 false이면 결과는 false)
		// or = 하나라도 true이면 결과는 ture (모두 false일 때만 결과가 false) 
		boolean result1 = play1 || play2; // or
		System.out.println(result1);
		
		boolean result2 = play1 && play2; // and
		System.out.println(result2);
		
		play1 =! (!play1);
		System.out.println(play1);
				
	}

}
