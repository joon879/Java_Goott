package com.tech.w07chat;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {

	JButton btn_exit;
	JButton btn_send;
	JButton btn_connect;
	JTextArea txt_list;
	JTextField txt_server_ip;
	JTextField txt_name;
	JTextField txt_input;
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	String server_ip;
	final int port = 5011;
	CardLayout cl;
	Container c = getContentPane();

	public ChatClient() {
		setTitle("채팅 클라이언트");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		cl = new CardLayout();
		c.setLayout(cl);

		Panel connect = new Panel();
		connect.setBackground(Color.LIGHT_GRAY);
		connect.setLayout(new BorderLayout());

		////////////////////////////////////////////
		btn_connect = new JButton("서버 접속");
		btn_connect.addActionListener(this);
		txt_server_ip = new JTextField("192.168.1.115", 15);
		txt_name = new JTextField("홍길동", 15);
		JPanel connect_sub = new JPanel();
		connect_sub.add(new Label("서버 아이피(IP) : "));
		connect_sub.add(txt_server_ip);
		connect_sub.add(new Label("대      화      명  :  "));
		connect_sub.add(txt_name);

		// 채팅 화면(판넬) 구성
		JPanel chat = new JPanel();
		chat.setLayout(new BorderLayout());
		JLabel lblChat = new JLabel("채팅 접속 화면", JLabel.CENTER);
		connect.add(lblChat, BorderLayout.NORTH);
		connect.add(connect_sub, BorderLayout.CENTER);
		connect.add(btn_connect, BorderLayout.SOUTH);

		// 채팅창 화면 구성
		txt_list = new JTextArea();
		txt_input = new JTextField("", 12);
		btn_exit = new JButton("종료");
		btn_send = new JButton("전송");
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this);
		txt_input.addActionListener(this);
		Panel chat_sub = new Panel();
		chat_sub.add(txt_input);
		chat_sub.add(btn_send);
		chat_sub.add(btn_exit);
		Label lblChatTitle = new Label("채팅 프로그램 v 1", Label.CENTER);
		chat.add(lblChatTitle, BorderLayout.NORTH);
		chat.add(txt_list, BorderLayout.CENTER);
		chat.add(chat_sub, BorderLayout.SOUTH);
		c.add(connect, "접속창");
		c.add(chat, "채팅창");
		cl.show(c, "접속창");// ***
		setBounds(250, 250, 300, 300);
		setVisible(true);
	}

	@Override
	public void run() {
		System.out.println("스레드 동작 신호");

		try {
			client = new Socket(server_ip, port);
			InputStream is = client.getInputStream(); // 입력
			br = new BufferedReader(new InputStreamReader(is));

			OutputStream os = client.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(os));

			String msg = txt_name.getText();
			pw.println(msg);
			pw.flush();// 전송
			txt_input.requestFocus();// 계속 입력할 수 있도록 커서를 그 위치에 위치시킴.

			while (true) {// 받기
				msg = br.readLine();
				txt_list.append(msg + "\n");
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");

		Object obj = e.getSource();
		if (obj == btn_connect) { // 접속
			server_ip = txt_server_ip.getText();
			Thread th = new Thread(this);
			th.start();
			cl.show(c, "채팅창");
		} else if (obj == btn_exit) { // 종료
//			pw.close();
//			br.close();
			System.exit(0);
		} else if (obj == btn_send || obj == txt_input) { // 채팅
			// 메시지 전송
			String msg = txt_input.getText();
			pw.println(msg);// 채팅내용 전송
			pw.flush();

			txt_input.setText("");
			txt_input.requestFocus();// 커서 위치
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
