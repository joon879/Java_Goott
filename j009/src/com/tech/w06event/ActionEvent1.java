package com.tech.w06event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent1 extends JFrame{
//300 200
	
	private JButton button;
	private JLabel label;
	public ActionEvent1() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ��������!");
		label = new JLabel("������ ��ư�� ������ �ʾұ���!");
		
		//�ǳڿ� ��ư ����
		panel.add(button);	
				
		//�ǳڿ� �� ����
		panel.add(label);
		
		//�ǳڿ��� ���������� �ǳ��� �����ӿ� �����ؾ� ȭ�鿡 ��µȴ�.
		//�� Ŭ���� JFrame�� �������̴�. (this ���� ����)
		this.add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent1();
	}
}
