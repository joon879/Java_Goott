package com.tech.w01;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyMousePanel3 extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
		
	public MyMousePanel3() {
		try {
			img = ImageIO.read(new File("src/ball.png"));
		} catch (IOException e) {
			System.out.println("no file 잠시대기");
//			e.printStackTrace();
		}
		
		//마우스리스너 메소드
		addMouseListener(new MouseAdapter() {
			
			//MouseAdapter MouseMotionAdpter KeyAdapter FocusAdapter WindowAdapter
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("press");
				
				System.out.println("x좌표: "+e.getX());
				System.out.println("y좌표: "+e.getY());
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			
		});
	
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class BallControllMouse3 extends JFrame {

	public BallControllMouse3() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyMousePanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new BallControllMouse3();
	}
}
