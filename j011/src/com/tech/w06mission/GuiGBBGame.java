package com.tech.w06mission;

import javax.swing.JFrame;

public class GuiGBBGame extends JFrame {
	
	public GuiGBBGame() {
		setTitle("GuiGBBGame");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setVisible(rootPaneCheckingEnabled);
	}
	
	public static void main(String[] args) {
		new GuiGBBGame();
	}
}
