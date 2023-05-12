package com.tech.w02;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	
	
	public MyCounter(){
		setTitle("slotmachine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		numbers = new int[3];
		
		for (int i = 0; i < labels.length; i++) {
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
		
		add(panel);
		
		setVisible(true);
		
	}
}


public class SlotMachine {
	
	
	
	public SlotMachine() {
		
	}
	
	
	public static void main(String[] args) {
		new MyCounter();
	}
}
