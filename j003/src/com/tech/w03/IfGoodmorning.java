package com.tech.w03;

import java.util.Calendar;
import java.util.Date;

public class IfGoodmorning {
	public static void main(String[] args) {
		// ��ü����
//		Date date = new Date();
//		int currHour = date.getHours();
//		System.out.println(currHour);
//		// 12���� ������ Good mornig
//		// 12���� ũ�� Good evening
//		
//		if(currHour < 12) {
//			System.out.println("Good morning");
//		} else if(currHour > 12) {
//			System.out.println("Good evening");
//		} �̰� ������� ����.
		
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hour);
		if(hour > 12) {
			System.out.println("Good evening");
		} else if(hour < 12) {
			System.out.println("Good morning");
		}
	}
}
