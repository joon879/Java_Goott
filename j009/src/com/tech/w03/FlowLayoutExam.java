package com.tech.w03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{
	public static void main(String[] args) {
		new FlowLayoutExam();
	}
	
	public FlowLayoutExam() {
		setTitle("FlowLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		add(btn1);add(btn2);add(btn3);
		add(btn4);add(btn5);add(btn6);
		add(btn7);add(btn8);add(btn9);
			
		
		setVisible(true);
	}
}
