package com.tech.w01;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelExam2 extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	private boolean flag = true;
	
	
	public ImageLabelExam2() {
		
		setTitle("imagecontroll");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 버튼을 클릭하세요!");
		button = new JButton("이미지버튼");
		
		ImageIcon icon = new ImageIcon("src/icon2.png");
		button.setIcon(icon);
		button.setPreferredSize(new Dimension(200,30));
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(this);
		
		add(panel);
		
				
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageLabelExam2();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호신호");
//		ImageIcon dog = new ImageIcon("src/dog.gif");
//		label.setIcon(dog);
//		label.setText("");
		
		//toggle
		if(flag==true) {
			ImageIcon dog = new ImageIcon("src/dog.gif");
			label.setIcon(dog);
			label.setText("");
			flag = false;
		}else if(flag==false) {
			ImageIcon dog = new ImageIcon("");
			label.setIcon(dog);
			label.setText("이미지를 보려면 버튼을 클릭하세요!");
			flag = true;
		}
		
		
	}
}
