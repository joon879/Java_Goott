package com.tech.w02mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class SidePanel extends JPanel implements ActionListener {
	
	protected JCheckBox cookie, banana, sandwich, chocolate;
	protected ButtonGroup bg;
	protected String sideStr = "";
	
	public SidePanel() {
		setLayout(new GridLayout(4,1));
		cookie = new JCheckBox("cookie");
		banana = new JCheckBox("banana");
		sandwich = new JCheckBox("sandwich");
		chocolate = new JCheckBox("chocolate");
		
		cookie.addActionListener(this);
		banana.addActionListener(this);
		sandwich.addActionListener(this);
		chocolate.addActionListener(this);
		
		bg = new ButtonGroup();
		bg.add(cookie);
		bg.add(banana);
		bg.add(sandwich);
		bg.add(chocolate);
		this.setBorder(BorderFactory.createTitledBorder("Side"));
		
		add(cookie);
		add(banana);
		add(sandwich);
		add(chocolate);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cookie) {
			sideStr = "cookie";
		} else if (e.getSource() == banana) {
			sideStr = "banana";
		} else if (e.getSource() == sandwich) {
			sideStr = "sandwich";
		} else if (e.getSource() == chocolate) {
			sideStr = "chocolate";
		}
		System.out.println("Side signal: " + sideStr);
		
	}
}
