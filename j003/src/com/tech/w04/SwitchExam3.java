package com.tech.w04;

public class SwitchExam3 {

	public static void main(String[] args) {
		//랜덤으로 12개만 가져오고 65부터 시작
		int num = (int)(Math.random()*12) + 65;
		System.out.println(num);
		
		switch (num) {
		case 65:	System.out.println("문자는 A");		break;
		case 66:	System.out.println("문자는 B");		break;
		case 67:	System.out.println("문자는 C");		break;
		case 68:	System.out.println("문자는 D");		break;
		case 69:	System.out.println("문자는 E");		break;
		case 70:	System.out.println("문자는 F");		break;
		case 71:	System.out.println("문자는 G");		break;
		case 72:	System.out.println("문자는 H");		break;
		case 73:	System.out.println("문자는 I");		break;
		case 74:	System.out.println("문자는 J");		break;
		default:	System.out.println("없는 숫자입니다.");	break;
		}
	}

}
