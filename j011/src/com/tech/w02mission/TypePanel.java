package com.tech.w02mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TypePanel extends JPanel implements ActionListener{
	protected JRadioButton hot, ice;
	protected ButtonGroup bg;
	protected String typeStr = "";
	
	public TypePanel() {
		setLayout(new GridLayout(2,1));
		hot = new JRadioButton("hot");
		ice = new JRadioButton("ice");
		
		hot.addActionListener(this);
		ice.addActionListener(this);
		
		bg = new ButtonGroup();
		bg.add(hot);
		bg.add(ice);
		this.setBorder(BorderFactory.createTitledBorder("Type"));
		
		add(hot);
		add(ice);
		
		
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hot) {
			typeStr = "hot";
		}else if(e.getSource() == ice) {
			typeStr = "ice";
		}
		System.out.println("Type signal: "+ typeStr);
	}
	
	
}
