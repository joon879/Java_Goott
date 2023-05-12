package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent5 extends JFrame implements ActionListener{
//300 200

	private JButton button1, button2;
	private JLabel label;
	boolean flag1 = true;
	boolean flag2 = true;

	public ActionEvent5() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JPanel panel = new JPanel();
		button1 = new JButton("��ư1");
		button2 = new JButton("��ư2");
		label = new JLabel("������ ��ư�� ������ �ʾұ���!");

		
		button1.addActionListener(this);
		button2.addActionListener(this);

		// �ǳڿ� ��ư ����
		panel.add(button1);
		panel.add(button2);

		// �ǳڿ� �� ����
		panel.add(label);

		// �ǳڿ��� ���������� �ǳ��� �����ӿ� �����ؾ� ȭ�鿡 ��µȴ�.
		// �� Ŭ���� JFrame�� �������̴�. (this ���� ����)
		this.add(panel);

		setVisible(true);
	}



	public static void main(String[] args) {
		new ActionEvent5();
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		System.out.println("��ȣ ����!" + e);

		if (button.getText() == "��ư1") {
			if (flag1 == true) {
				label.setText("��ư1 ON");
				flag1 = false;
			} else {
				label.setText("��ư1 OFF");
				flag1 = true;
			}
		} else if (button.getText() == "��ư2") {
			if (flag2 == true) {
				label.setText("��ư2 ON");
				flag2 = false;
			} else {
				label.setText("��ư2 OFF");
				flag2 = true;
			}
		}
	}
}
