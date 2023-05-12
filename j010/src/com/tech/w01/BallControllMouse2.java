package com.tech.w01;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyMousePanel2 extends JPanel implements MouseListener {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;

	public MyMousePanel2() {
		try {
			img = ImageIO.read(new File("src/ball.png"));
		} catch (IOException e) {
			System.out.println("no file ¿·Ω√¥Î±‚");
//			e.printStackTrace();
		}
		addMouseListener(this);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("release");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("press");

		System.out.println("x¡¬«•: " + e.getX());
		System.out.println("y¡¬«•: " + e.getY());
		img_x = e.getX();
		img_y = e.getY();
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exit");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("enter");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

public class BallControllMouse2 extends JFrame {

	public BallControllMouse2() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyMousePanel3());
		setVisible(true);
	}

	public static void main(String[] args) {
		new BallControllMouse2();
	}
}
