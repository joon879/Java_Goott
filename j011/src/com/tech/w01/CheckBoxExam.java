package com.tech.w01;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxExam extends JPanel implements ItemListener, ActionListener {

	private JCheckBox[] buttons = new JCheckBox[3];
	private String[] fruits = { "apple", "grape", "orange" };
	private JLabel[] labels = new JLabel[3];
	private ImageIcon[] icon = new ImageIcon[3];

	public CheckBoxExam() {
		
		setLayout(new GridLayout(0,4));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
//			buttons[i].addActionListener(this);
			buttons[i].addItemListener(this);
			buttons[i].setBackground(Color.green);
			labels[i] = new JLabel(fruits[i]+".gif");
			icon[i] = new ImageIcon(fruits[i]+".gif");
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		add(checkPanel);
		add(labels[0]);
		add(labels[1]);
		add(labels[2]);
	}

	public static void main(String[] args) {
		// 500 200
		JFrame frame = new JFrame();

		frame.setTitle("checkbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		CheckBoxExam panel = new CheckBoxExam();
		
		
		frame.add(panel);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("체크박스신호신호");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("아이템체인지신호신호");
		Object source = e.getItemSelectable();
		for (int i = 0; i < buttons.length; i++) {
			if(source == buttons[i]) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {//check none
					labels[i].setIcon(null);
				}else if(e.getStateChange() == ItemEvent.SELECTED){
					labels[i].setIcon(icon[i]);
				}
			}
		}
	}
}
