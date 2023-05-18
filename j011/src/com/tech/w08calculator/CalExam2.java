package com.tech.w08calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam2 extends JFrame {
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
		new CalExam2();
	}

	public CalExam2() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		
		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		
		buttons = new JButton[25];
		
		int index = 0;
		//반복문으로 버튼 생성
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				buttons[index] = new JButton(labels[index]);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		add(panel);
		setVisible(true);
	}
}
