package com.tech.w05sync;

public class MusicBox {
	
	//synchronized적용
	public synchronized void PlayMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("가가가가요");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void PlayMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("파파파팝송");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void PlayMusicC() {
		for (int i = 0; i < 10; i++) {
			//synchronized block처리
			synchronized (this) {
				System.out.println("히히히히팝");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
