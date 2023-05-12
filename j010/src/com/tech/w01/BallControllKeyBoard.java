package com.tech.w01;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MyPanel extends JPanel{
	
	BufferedImage img = null;
	int img_x = 100, img_y = 100;//좌표값
	
	public MyPanel() {
		//화면 구성
		try {
			img = ImageIO.read(new File("src/ball.png"));
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("no image");
		}
		//키보드 리스너 추가
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key press");
				int keycode = e.getKeyCode();
//				System.out.println(keycode);
				switch (keycode) {
				case KeyEvent.VK_UP:
					img_y -=10;
					System.out.println("up");
					break;
				case KeyEvent.VK_DOWN:
					img_y +=10;
					System.out.println("down");
					break;
				case KeyEvent.VK_LEFT:
					img_x -=10;
					System.out.println("left");
					break;
				case KeyEvent.VK_RIGHT:
					img_x +=10;
					System.out.println("right");
					break;

				default:
					break;
				}
				repaint();//화면에 다시 그리기.
								
			}
		});
		this.requestFocus();
		setFocusable(true);
	}//
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	};
}


public class BallControllKeyBoard extends JFrame{
	
	public BallControllKeyBoard() {
		
		setTitle("ball controll keyboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		//판넬 추가해서 판넬에 버튼 추가.
		
		
		//판넬을 프레임에 추가
		add(new MyPanel());
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BallControllKeyBoard();
	}
}
