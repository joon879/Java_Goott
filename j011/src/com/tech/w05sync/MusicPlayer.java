package com.tech.w05sync;

public class MusicPlayer extends Thread{
	
	int type;
	MusicBox musicBox;
		
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1:
			System.out.println("������ ����: "+ Thread.currentThread().getName()+
					" : "+Thread.currentThread().getPriority());
			musicBox.PlayMusicA();
			break;
		case 2:
			System.out.println("������ ����: "+ Thread.currentThread().getName()+
					" : "+Thread.currentThread().getPriority());
			musicBox.PlayMusicB();
			break;
		case 3:
			System.out.println("������ ����: "+ Thread.currentThread().getName()+
					" : "+Thread.currentThread().getPriority());
			musicBox.PlayMusicC();
			break;

		default:
			break;
		}
	}
	
}
