package com.tech.w02mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;
	
	WelcomePanel wlecomePanel = new WelcomePanel();
	TypePanel typePanel = new TypePanel();
	SidePanel sidePanel = new SidePanel();
	SizePanel sizePanel = new SizePanel();
	
	public MyFrame() {
		setTitle("Coffee Order");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		order_button = new JButton("주문");
		cancel_button = new JButton("취소");
		
		order_button.addActionListener(this);
		cancel_button.addActionListener(this);
		
		text = new JTextField();
		text.setEditable(false);
		text.setColumns(25);
		
		down_panel = new JPanel();
		down_panel.add(order_button);
		down_panel.add(cancel_button);
		down_panel.add(text);
		
		JPanel centerJPanel = new JPanel(new GridLayout(0, 3));
		centerJPanel.add(typePanel);
		centerJPanel.add(sidePanel);
		centerJPanel.add(sizePanel);
		
		add(wlecomePanel, "North");
		add(centerJPanel, "Center");
		add(down_panel, "South");
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int kindPrice = 0;
		int sidePrice = 0;
		if (e.getSource() == order_button) {
			if (typePanel.typeStr == "hot") {
				switch (sizePanel.sizeStr) {
				case "small":	kindPrice = 4000;	break;
				case "medium":	kindPrice = 5000;	break;
				case "large":	kindPrice = 60000;	break;
				default:	break;
				}
			} else if (typePanel.typeStr == "ice") {
				switch (sizePanel.sizeStr) {
				case "small":	kindPrice = 5000;	break;
				case "medium":	kindPrice = 6000;	break;
				case "large":	kindPrice = 7000;	break;
				default:	break;
				}
			} 
			switch (sidePanel.sideStr) {
			case "cookie":		sidePrice = 1000;	break;
			case "banana":		sidePrice = 2000;	break;
			case "sandwich":	sidePrice = 3000;	break;
			case "chocolate":	sidePrice = 4000;	break;
			default:		break;
			}
			text.setText("price: "+(kindPrice + sidePrice));
		}else if (e.getSource() == cancel_button) {
			kindPrice = 0;
			sidePrice = 0;
			typePanel.typeStr = "";
			sidePanel.sideStr = "";
			sizePanel.sizeStr = "";
			
			typePanel.bg.clearSelection();
			sidePanel.bg.clearSelection();
			sizePanel.bg.clearSelection();
			
			text.setText("");
		}
		
	}
	
}
