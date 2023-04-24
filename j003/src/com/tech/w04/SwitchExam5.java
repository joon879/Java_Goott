package com.tech.w04;

public class SwitchExam5 {

	public static void main(String[] args) {
		//1월부터 12까지 랜덤으로 숫자를 입력받아서
		//봄 345, 여름 678, 가을910, 겨울 나머지 출력 
		int num = (int)(Math.random()*12) + 1;
		System.out.println(num);
		
		switch (num) {
		case 3:	
		case 4:	
		case 5:	System.out.println("봄");	break;
		case 6:	
		case 7:	
		case 8:	System.out.println("여름");	break;
		case 9:	
		case 10: System.out.println("가을");	break;	
		case 1://위에서부터 아래로 그룹이라 생각해라. 3~5, 6~8, 1~12.
		case 2:
		case 11:
		case 12: System.out.println("겨율"); break;
		//default: System.out.println("겨울");	break;
		}
	}

}
