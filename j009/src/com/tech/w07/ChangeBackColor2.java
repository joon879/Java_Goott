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
		JButton ybutton = new JButton("���");
		JButton pbutton = new JButton("��ũ");
		
		panel.add(ybutton);
		panel.add(pbutton);
		
		add(panel);
		
		ybutton.addActionListener(this);
		pbutton.addActionListener(this);
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ȣ��ȣ!!");
		if(e.getActionCommand()=="���") {//getActionCommand ->��ư�� ����.
			//�ǳ��� ���� ����
			panel.setBackground(Color.yellow);
		}else if(e.getActionCommand()=="��ũ") {
			//�ǳ��� ���� ����
			panel.setBackground(Color.pink);
		}
	}
}
