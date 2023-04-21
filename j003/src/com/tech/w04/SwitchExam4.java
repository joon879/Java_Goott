package com.tech.w04;

public class SwitchExam4 {

	public static void main(String[] args) {
		//1월부터 12까지 랜덤으로 숫자를 입력받아서
		//봄 345, 여름 678, 가을910, 겨울 나머지 출력 
		int num = (int)(Math.random()*12) + 1;
		System.out.println(num);
		
		switch (num) {
		case 3:	System.out.println("봄");	break;
		case 4:	System.out.println("봄");	break;
		case 5:	System.out.println("봄");	break;
		case 6:	System.out.println("여름");	break;
		case 7:	System.out.println("여름");	break;
		case 8:	System.out.println("여름");	break;
		case 9:	System.out.println("가을");	break;
		case 10:System.out.println("가을");	break;		
		default: System.out.println("겨울");	break;
		}
	}

}
