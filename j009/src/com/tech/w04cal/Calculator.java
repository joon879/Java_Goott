package com.tech.w04cal;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	public static void main(String[] args) {
		new Calculator();
	}

	public Calculator() {
		setTitle("°è»ê±â");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

		JPanel p1, p2;
		p1 = new JPanel();
		p2 = new JPanel();
		
		p1.setLayout(null);
		p2.setLayout(new GridLayout(5, 5, 5, 5));
		
		p2.add(new JButton("btn1"));
		p2.add(new JButton(""));
		p2.add(new JButton(""));
		p2.add(new JButton("btn1"));
		p2.add(new JButton("btn1"));
		

		JTextField tf1 = new JTextField();

		p1.add(tf1);
		p2.setLayout(new GridLayout(5,5,5,5));


		

		setVisible(true);
	}
}
