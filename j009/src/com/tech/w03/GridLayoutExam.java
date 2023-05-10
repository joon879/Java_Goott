package com.tech.w03;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame{
	public static void main(String[] args) {
		new GridLayoutExam();
	}
	
	public GridLayoutExam() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
//		setLayout(new GridLayout(4,2));
		setLayout(new GridLayout(4,2,5,10));
		
		//생성, 부착 동시
		add(new JButton("btn1"));
		add(new JButton("btn2"));
		add(new JButton("btn3"));
		add(new JButton("btn4"));
		add(new JButton("btn5"));
		add(new JButton("btn6"));
		add(new JButton("btn7"));
		add(new JButton("btn8"));
		
		
		setVisible(true);
	}
	
}
