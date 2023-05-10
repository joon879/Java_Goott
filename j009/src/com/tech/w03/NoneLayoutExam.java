package com.tech.w03;

import java.awt.Color;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoneLayoutExam extends JFrame{
	public static void main(String[] args) {
		new NoneLayoutExam();
	}
	public NoneLayoutExam() {
		setTitle("NoneLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Label la = new Label("Buttons");
		la.setLocation(0, 0);
		la.setSize(200,20);
		la.setForeground(Color.blue);
//		la.setOpaque(true);		
		la.setBackground(Color.red);		
		add(la);
		
		for (int i = 0; i < 9; i++) {
			JButton b = new JButton(Integer.toString(i)); //int -> String
			int posx,posy;
			posx = (int)(Math.random()*300);
			posy = (int)(Math.random()*200);
			b.setSize(50,20);
			b.setLocation(posx,posy);
			add(b);
		}
		
		
		
		
		
		setVisible(true);
	}
}
