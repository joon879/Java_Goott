package com.tech.w02;

public class Television {
//	접근지정자 private-> 자신의 클래스에서만 접근 가능
//	public-> 누구나 접근 가능
	public int channel;
	public int volume;
	public boolean onOff;
	//전역(필드)변수?는 자동 초기화.
	
	public static void main(String[] args) {
		int num = 0; //지역변수는 수동 초기화.
		boolean bool;
		
		Television tv = new Television();
		System.out.println(tv.channel);
		System.out.println(tv.volume);
		System.out.println(tv.onOff);
		
		tv.channel = 1;
		tv.volume = 9;
		tv.onOff = true;
		
		System.out.println("tv channel: "+tv.channel);
		System.out.println("tv volume: "+tv.volume);
		if(tv.onOff==true) {
			System.out.println("tv On !!");
		}else {
			System.out.println("tv Off !!");
		}
		
	}
}
