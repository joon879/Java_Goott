package com.tech.w02;

public class DenyLogicalOperExam {

	public static void main(String[] args) {
		// boolean, not �Լ� ����
		
		boolean play1 = false;
		boolean play2 = false;
		System.out.println(play1);

		//���Լ� not
		play1 =! play1;
		System.out.println(play1);
		
		// and = �� �� true�� �� ����� true (�ϳ��� false�̸� ����� false)
		// or = �ϳ��� true�̸� ����� ture (��� false�� ���� ����� false) 
		boolean result1 = play1 || play2; // or
		System.out.println(result1);
		
		boolean result2 = play1 && play2; // and
		System.out.println(result2);
		
		play1 =! (!play1);
		System.out.println(play1);
				
	}

}
