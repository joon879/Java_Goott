package com.tech.w04cal_2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam extends JFrame {
	public static void main(String[] args) {
		new CalExam();
	}

	public CalExam() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 250);
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();//입력창
		JPanel panelB = new JPanel();//버튼
		
		panelB.setLayout(new GridLayout(0,5,3,3));
		
		JButton btn1 = new JButton("backspace");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("CE");
		JButton btn5 = new JButton("C");
		JButton btn6 = new JButton("7");
		JButton btn7 = new JButton("8");
		JButton btn8 = new JButton("9");
		JButton btn9 = new JButton("sqrt");
		JButton btn10 = new JButton("/");
		JButton btn11 = new JButton("4");
		JButton btn12 = new JButton("5");
		JButton btn13 = new JButton("6");
		JButton btn14 = new JButton("X");
		JButton btn15 = new JButton("%");
		JButton btn16 = new JButton("1");
		JButton btn17 = new JButton("2");
		JButton btn18 = new JButton("3");
		JButton btn19 = new JButton("-");
		JButton btn20 = new JButton("1/X");
		JButton btn21 = new JButton("0");
		JButton btn22 = new JButton("+/-");
		JButton btn23 = new JButton(".");
		JButton btn24 = new JButton("+/");
		JButton btn25 = new JButton("=");
		
		//판넬 색상변경
		panelA.setBackground(Color.blue);
		panelB.setBackground(Color.red);
		
		//버튼 판넬B에 부착
		panelB.add(btn1);
		panelB.add(btn2);
		panelB.add(btn3);
		panelB.add(btn4);
		panelB.add(btn5);
		panelB.add(btn6);
		panelB.add(btn7);
		panelB.add(btn8);
		panelB.add(btn9);
		panelB.add(btn10);
		panelB.add(btn11);
		panelB.add(btn12);
		panelB.add(btn13);
		panelB.add(btn14);
		panelB.add(btn15);
		panelB.add(btn16);
		panelB.add(btn17);
		panelB.add(btn18);
		panelB.add(btn19);
		panelB.add(btn20);
		panelB.add(btn21);
		panelB.add(btn22);
		panelB.add(btn23);
		panelB.add(btn24);
		panelB.add(btn25);
		
		JTextField field = new JTextField(55);
		panelA.add(field);
		
		//panel에 panelA,panelB를 부착
		panel.add(panelA);
		panel.add(panelB);
		
		//프레임에 panel부착
		add(panel);
		setVisible(true);
	}
}
