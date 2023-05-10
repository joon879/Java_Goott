package com.tech.w04cal_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam3 extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {"Backspace","","","CE","C",   
	         "7","8","9","/","sqrt",   
	         "4","5","6","x","%",   
	         "1","2","3","-","1/x",   
	         "0","+/-",".","+","=" 			
	};
	
	public static void main(String[] args) {
		new CalExam3();
	}

	public CalExam3() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		
		setLayout(new BorderLayout());//���⿡ 2���� ��ġ�Ѵ�.
		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		
		buttons = new JButton[25];
		
		int index = 0;
		//�ݺ������� ��ư ����
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				buttons[index] = new JButton(labels[index]);
				
				if(col >= 3) {
					buttons[index].setForeground(Color.red);
					
				}else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.cyan);
				panel.add(buttons[index]);
				index++;
			}
		}
		
//		add(panel);
		//�������̾ƿ��� �ؽ�Ʈ�ʵ��ǳڰ� ��ư�ǳ� ���!! �̰� ������ ȭ�鿡 �ȳ���!!
		add(tField,"North");
		add(panel,"Center");
		
		setVisible(true);
	}
}
