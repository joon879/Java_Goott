package com.tech.w03;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinForm2 extends JFrame{
	public static void main(String[] args) {
		new JoinForm2();
	}
	public JoinForm2() {
		setTitle("JoinForm");
		setSize(400,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�ǳ��غ�
		JPanel p = new JPanel();
		p.setLayout(null);
		
		//�ǳ� �÷� ����
		p.setBackground(Color.cyan);
		
		//�� �غ�
		JLabel ltitle = new JLabel("Member Join");
		JLabel l1 = new JLabel("ID");
		JLabel l2 = new JLabel("PW");
		JLabel l3 = new JLabel("NAME");
		
		//Ÿ��Ʋ ����
		ltitle.setFont(new Font("impact",Font.BOLD,20));
		
		//textField �غ�
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(15);
		JTextField tf3 = new JTextField(15);
		
		//button �غ�
		JButton b1 = new JButton("join");
		JButton b2 = new JButton("modify");
		JButton b3 = new JButton("del");
		
		//�ǳڿ� �غ�� ������Ʈ ����
		p.add(ltitle);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		
		//�ǳ� ��ġ ����(setBounds -> set location + size)
		int y1 = 30;
		int x1 = 100;
		ltitle.setBounds(120, 20, 200, 20);
		l1.setBounds(20,50,50,20);
		l2.setBounds(20,50+y1*1,50,20);
		l3.setBounds(20,50+y1*2,50,20);
		
		tf1.setBounds(20+x1,50,150,20);
		tf2.setBounds(20+x1,50+y1*1,150,20);
		tf3.setBounds(20+x1,50+y1*2,150,20);
		
		b1.setBounds(20,150,100,30);
		b2.setBounds(20+x1,150,100,30);
		b3.setBounds(20+x1*2,150,100,30);
				
		
		//�ǳ��� �����ӿ� ����
		add(p);
		
				
		setVisible(true);
	}
}
