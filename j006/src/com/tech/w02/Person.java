package com.tech.w02;

public class Person {
	String name;
	int age;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "ȫ�浿";
		person.laugh();
		person.name = "BTS";
		person.laugh();
		
//		�ܺ����� ����(Television class)
		Television tvp = new Television();
//		tvp.onOff = true;
		System.out.println(tvp.onOff);
		
//		===================================
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		
	}
	
	public void laugh() {
		System.out.println(name+"(��)�� ����.");
	}
}
