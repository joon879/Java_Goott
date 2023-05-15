package com.tech.w05sync;

public class MusicBoxTest {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer musicThread1 = new MusicPlayer(1,box);
		MusicPlayer musicThread2 = new MusicPlayer(2,box);
		MusicPlayer musicThread3 = new MusicPlayer(3,box);
		
		System.out.println("���ν�����: "+Thread.currentThread().getName());
		
		musicThread1.setPriority(1);
		musicThread2.setPriority(1);
		musicThread3.setPriority(10);
		
		musicThread1.start();
		musicThread2.start();
		musicThread3.start();
	}
}
