package com.tech.w05sync;

public class MusicBox {
	
	//synchronized����
	public synchronized void PlayMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("����������");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void PlayMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������˼�");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void PlayMusicC() {
		for (int i = 0; i < 10; i++) {
			//synchronized blockó��
			synchronized (this) {
				System.out.println("����������");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
