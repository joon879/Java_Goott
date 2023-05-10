package com.tech.w03;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExam extends JFrame {
	public static void main(String[] args) {
		new CardLayoutExam();
	}
	public CardLayoutExam() {
		setTitle("CardLayout");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����̳� �غ�
		Container c = getContentPane(); //��� �׸� ����
		CardLayout cc = new CardLayout();
		c.setLayout(cc);
		
		//�ǳ� �غ�
		JPanel p1,p2,p3; //����
		
		//���� ��ü ����
		p1 = new JPanel(); //��ü ����
		p1.setBackground(Color.yellow);
		p1.add(new JLabel("p111"));
		
		p2 = new JPanel(); //��ü ����
		p2.setBackground(Color.cyan);
		p2.add(new JLabel("p222"));
		
		p3 = new JPanel(); //��ü ����
		p3.setBackground(Color.blue);
		p3.add(new JLabel("p333"));
		
		c.add("3",p3);
		c.add(p2,"2");
		c.add(p1,"1");
	
		
		cc.show(c, "2");//Ư�� ī�带 (�󺧷�)�����Ͽ� ���.		
		
		
		
		
		setVisible(true);
	}
	
}
