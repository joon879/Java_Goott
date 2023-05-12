package com.tech.w07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackColor2 extends JFrame implements ActionListener{

	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		new ChangeBackColor2();
	}
	public ChangeBackColor2() {
		setTitle("change color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
//		JPanel panel = new JPanel();
		JButton ybutton = new JButton("노랑");
		JButton pbutton = new JButton("핑크");
		
		panel.add(ybutton);
		panel.add(pbutton);
		
		add(panel);
		
		ybutton.addActionListener(this);
		pbutton.addActionListener(this);
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호신호!!");
		if(e.getActionCommand()=="노랑") {//getActionCommand ->버튼의 글자.
			//판넬의 색상 변경
			panel.setBackground(Color.yellow);
		}else if(e.getActionCommand()=="핑크") {
			//판넬의 색상 변경
			panel.setBackground(Color.pink);
		}
	}
}
