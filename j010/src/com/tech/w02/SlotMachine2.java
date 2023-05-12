package com.tech.w02;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter2 extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	
	
	public MyCounter2(){
		setTitle("slotmachine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		numbers = new int[3];
		
		for (int i = 0; i < labels.length; i++) {
//			int num = (int)(Math.random()*9+1);
//			numbers[i] = num;
		
	
			labels[i] = new JLabel(numbers[i]+"");
			labels[i].setFont(new Font("impact", Font.BOLD, 100));
			labels[i].setSize(100,100);
			labels[i].setLocation(100+100*i, 20);
			
			//판넬에 추가
			panel.add(labels[i]);
		}
		//버튼 추가
		button = new JButton("땡겨!");
		button.setSize(250,50);
		button.setLocation(100, 150);
		panel.add(button);
		
		button.addActionListener(this);
		
		add(panel);
		
		
		
		setVisible(true);
		
	}

	int cnt = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("dddd");
//		int num = (int)(Math.random()*10);
//		System.out.println(num);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*10);
			labels[i].setText(numbers[i]+"");
			System.out.print(numbers[i]);
		}
		System.out.println();
		//같은 숫자일 경우 축하메시지
		if(numbers[0]==numbers[1] && numbers[1]==numbers[2]) {
			button.setText("축하합니다"+cnt);
			System.out.println("축하합니다"+cnt);
		}
		cnt++;
	}
}


public class SlotMachine2 {
		
	public SlotMachine2() {
		
	}
	
	
	public static void main(String[] args) {
		new MyCounter2();
	}
}
