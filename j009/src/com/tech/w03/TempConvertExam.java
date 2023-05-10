package com.tech.w03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TempConvertExam extends JFrame{
	public static void main(String[] args) {
		new TempConvertExam();
	}
	public TempConvertExam() {
		setTitle("¿Âµµº¯È¯±â");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JLabel l1 = new JLabel("È­¾¾ ¿Âµµ");
		JLabel l2 = new JLabel("¼·¾¾ ¿Âµµ");
		
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(15);
		
		JButton b1 = new JButton("º¯È¯");
		
		p.add(l1);
		p.add(l2);
		p.add(tf1);
		p.add(tf2);
		p.add(b1);
		
		l1.setBounds(20, 50, 200, 20);
		l2.setBounds(20, 100, 200, 20);
		tf1.setBounds(100, 50, 200, 20);
		tf2.setBounds(100, 100, 200, 20);
		b1.setBounds(150, 150, 100, 20);
		
		
		add(p);
		setVisible(true);
	}
}
