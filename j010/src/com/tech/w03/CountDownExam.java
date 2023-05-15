package com.tech.w03;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownExam extends JFrame{
	private JLabel label;
	
	
	//����Ŭ����
	class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("������ ȣ�� ����.");
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(1000);// �и������� = 1/1000��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				label.setText(i+"");
				
			}
		}
	}
	
		
	public CountDownExam() {
		//300 200
		setTitle("Countdown");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		label = new JLabel("Start");
		label.setFont(new Font("impact", Font.BOLD, 100));
		
		
		add(label);		
		
		//����Ŭ���� ȣ��.
		new MyThread().start();
		
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CountDownExam();
	}
}
