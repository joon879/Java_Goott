package com.tech.w07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeRedBlueGreen extends JFrame implements ActionListener{
	JPanel panel = new JPanel();
	private JButton rbutton, bbutton, gbutton, rgbbutton;
	
	public static void main(String[] args) {
		new ChangeRedBlueGreen();
	}

	public ChangeRedBlueGreen() {
		setTitle("change red blue green");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		rbutton = new JButton("»¡°­»ö");
		bbutton = new JButton("ÆÄ¶û»ö");
		gbutton = new JButton("³ì»ö");
		rgbbutton = new JButton("rgb");
		
		rbutton.addActionListener(this);
		bbutton.addActionListener(this);
		gbutton.addActionListener(this);
		rgbbutton.addActionListener(this);
		
		panel.add(rbutton);
		panel.add(bbutton);
		panel.add(gbutton);
		panel.add(rgbbutton);
		
		this.add(panel);
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rbutton) {
			panel.setBackground(Color.red);
		}else if(e.getSource()==bbutton) {
			panel.setBackground(Color.blue);
		}else if(e.getSource()==gbutton) {
			panel.setBackground(Color.green);
		}else if(e.getSource()==rgbbutton) {//RGBÄÃ·¯ ³Ö±â
			panel.setBackground(new Color(232, 39, 200));
//			panel.setBackground(Color.decode("#ff0000"));
		}
		
	}
}
