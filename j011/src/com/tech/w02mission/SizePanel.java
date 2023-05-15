package com.tech.w02mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SizePanel extends JPanel implements ActionListener{

	protected JRadioButton small, medium, large;
	protected ButtonGroup bg;
	protected String sizeStr = "";
	
	public SizePanel() {
		setLayout(new GridLayout(3, 1));
		small = new JRadioButton("small");
		medium = new JRadioButton("medium");
		large = new JRadioButton("large");
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);

		bg = new ButtonGroup();
		bg.add(small);
		bg.add(medium);
		bg.add(large);

		this.setBorder(BorderFactory.createTitledBorder("Size"));

		add(small);
		add(medium);
		add(large);
		
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == small) {
			sizeStr = "small";
		} else if (e.getSource() == medium) {
			sizeStr = "medium";
		} else if (e.getSource() == large) {
			sizeStr = "large";
		}
		System.out.println("Size signal: " + sizeStr);
		
	}

}
