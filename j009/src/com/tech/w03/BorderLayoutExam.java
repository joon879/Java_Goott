package com.tech.w03;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame {
	public static void main(String[] args) {
		new BorderLayoutExam(); //������ ȣ��
		
	}
	
	public BorderLayoutExam() {//������
		System.out.println("�ʱ�ȭ �۾� ������ �����");
		setTitle("BorderLayout");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); //��ġ�����ڸ� �������̾ƿ��� ����Ѵ�.
		
//		��ư����
		 JButton btn1 = new JButton("ȣ��1");//��ư ������Ʈ ����.
		 JButton btn2 = new JButton("ȣ��2");//��ư ������Ʈ ����.
		 JButton btn3 = new JButton("ȣ��3");//��ư ������Ʈ ����.
		 JButton btn4 = new JButton("ȣ��4");//��ư ������Ʈ ����.
		 JButton btn5 = new JButton("ȣ��5");//��ư ������Ʈ ����.
		 
//		 ������Ʈ �����ӿ� ����
		 add(btn1,"North");//ù���ڸ� �빮�ڷ�
		 add(btn2,"West");
		 add(btn3,"East");
		 add(btn4,"South");
		 add(btn5,"Center");
		 
		 setVisible(true);
		 
		 
	}
}
