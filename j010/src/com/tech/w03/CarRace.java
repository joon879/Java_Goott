package com.tech.w03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarRace extends JFrame {
	
	
	
	//���� Ŭ����
	class MyCarThread extends Thread{
		private JLabel label;
		private int x, y;//�ڵ��� ��ǥ��
		
		public MyCarThread(String fname, int x, int y) {
			//��ŸƮ���ο� �̹��� �ø���, ��ǥ���� �ʵ�� ����
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
			
			//��ǥ���� �ٲ��ִ� ������ ����.
			for (int i = 0; i < 200; i++) {
//				System.out.println(Math.random()*10);
				if(x <=500) {//ȭ������� �� �Ѿ�� ����.
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
