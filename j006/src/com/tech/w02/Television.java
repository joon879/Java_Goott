package com.tech.w02;

public class Television {
//	���������� private-> �ڽ��� Ŭ���������� ���� ����
//	public-> ������ ���� ����
	public int channel;
	public int volume;
	public boolean onOff;
	//����(�ʵ�)����?�� �ڵ� �ʱ�ȭ.
	
	public static void main(String[] args) {
		int num = 0; //���������� ���� �ʱ�ȭ.
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
