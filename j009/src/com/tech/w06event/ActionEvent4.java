package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent4 extends JFrame {
//300 200

	private JButton button1, button2;
	private JLabel label;

	public ActionEvent4() {
		setTitle("event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JPanel panel = new JPanel();
		button1 = new JButton("��ư1");
		button2 = new JButton("��ư2");
		label = new JLabel("������ ��ư�� ������ �ʾұ���!");

		// MyListener2��� Ŭ������ ����. ���� Ŭ������ ����
		button1.addActionListener(new MyListener4());
		button2.addActionListener(new MyListener4());

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

	// ����Ŭ����. �������̽��� ��������� �߻�޼ҵ� ������ �ʿ��ϴ�.
	private class MyListener4 implements ActionListener {

		boolean flag1 = true;
		boolean flag2 = true;

		@Override
		public void actionPerformed(ActionEvent e) {
			//jbutton�������� ����ȯ�ؾ� ��ư�� �ؽ�Ʈ���� �о����.
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

	public static void main(String[] args) {
		new ActionEvent4();
	}
}
