package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent2 extends JFrame{
//300 200
	
	private JButton button;
	private JLabel label;
	
	public ActionEvent2() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ��������!");
		label = new JLabel("������ ��ư�� ������ �ʾұ���!");
		
		//MyListener2��� Ŭ������ ����. ���� Ŭ������ ����
		button.addActionListener(new MyListener2());
		
		
		
		//�ǳڿ� ��ư ����
		panel.add(button);	
				
		//�ǳڿ� �� ����
		panel.add(label);
		
		//�ǳڿ��� ���������� �ǳ��� �����ӿ� �����ؾ� ȭ�鿡 ��µȴ�.
		//�� Ŭ���� JFrame�� �������̴�. (this ���� ����)
		this.add(panel);
		
		
		
		
		
		
		
		setVisible(true);
	}
	//����Ŭ����. �������̽��� ��������� �߻�޼ҵ� ������ �ʿ��ϴ�.
	private class MyListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("��ȣ ����!"+e);
			button.setText("���� Ŭ��");
			label.setText("��ư�� ���ȱ���");
			
		}
		
	}
	
	public static void main(String[] args) {
		new ActionEvent2();
	}
}
