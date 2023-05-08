package com.tech.w02;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
//		/j009/src/com/tech/w02/apple.png
		Image img = kit.getImage("src\\com\\tech\\w02\\apple.png");
		setIconImage(img);
				
		
		//컴포넌트 추가
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("btn1");
		this.add(btn1);
		setLayout(new FlowLayout());
		JButton btn2 = new JButton("btn2");
		this.add(btn2);
		setLayout(new FlowLayout());
		JButton btn3 = new JButton("btn3");
		this.add(btn3);
		setLayout(new FlowLayout());
		JButton btn4 = new JButton("btn4");
		this.add(btn4);
		setLayout(new FlowLayout());
		JButton btn5 = new JButton("btn5");
		this.add(btn5);
		setLayout(new FlowLayout());
		JButton btn6 = new JButton("btn6");
		this.add(btn6);
		
		
		setVisible(true);
		
	}
}
