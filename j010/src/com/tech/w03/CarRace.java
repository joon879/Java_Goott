package com.tech.w03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarRace extends JFrame {
	
	
	
	//내부 클래스
	class MyCarThread extends Thread{
		private JLabel label;
		private int x, y;//자동차 좌표값
		
		public MyCarThread(String fname, int x, int y) {
			//스타트라인에 이미지 올리기, 좌표값을 필드로 전달
			this.x = x;
			this.y = y;
			label = new JLabel();
			label.setIcon(new ImageIcon("src/"+fname));
			label.setBounds(x, y, 50, 50);
			add(label);
			
		}
		@Override
		public void run() {
			System.out.println("Thread Run!!");
			
			//좌표값을 바꿔주는 스레드 동작.
			for (int i = 0; i < 200; i++) {
//				System.out.println(Math.random()*10);
				if(x <=500) {//화면밖으로 안 넘어가는 조건.
					x += Math.random()*10;
				}
				label.setBounds(x, y, 50, 50);
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
	}
	
	
	public CarRace() {
		setTitle("Car Race");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,200);
		setLayout(null);
		
		new MyCarThread("car1.png",100,0).start();
		new MyCarThread("car2.png",100,50).start();
		new MyCarThread("car3.png",100,100).start();
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CarRace();
	}
}
