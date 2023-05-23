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
		setTitle("ä�� Ŭ���̾�Ʈ");
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
		btn_connect = new JButton("���� ����");
		btn_connect.addActionListener(this);
		txt_server_ip = new JTextField("192.168.1.115", 15);
		txt_name = new JTextField("ȫ�浿", 15);
		JPanel connect_sub = new JPanel();
		connect_sub.add(new Label("���� ������(IP) : "));
		connect_sub.add(txt_server_ip);
		connect_sub.add(new Label("��      ȭ      ��  :  "));
		connect_sub.add(txt_name);

		// ä�� ȭ��(�ǳ�) ����
		JPanel chat = new JPanel();
		chat.setLayout(new BorderLayout());
		JLabel lblChat = new JLabel("ä�� ���� ȭ��", JLabel.CENTER);
		connect.add(lblChat, BorderLayout.NORTH);
		connect.add(connect_sub, BorderLayout.CENTER);
		connect.add(btn_connect, BorderLayout.SOUTH);

		// ä��â ȭ�� ����
		txt_list = new JTextArea();
		txt_input = new JTextField("", 12);
		btn_exit = new JButton("����");
		btn_send = new JButton("����");
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this);
		txt_input.addActionListener(this);
		Panel chat_sub = new Panel();
		chat_sub.add(txt_input);
		chat_sub.add(btn_send);
		chat_sub.add(btn_exit);
		Label lblChatTitle = new Label("ä�� ���α׷� v 1", Label.CENTER);
		chat.add(lblChatTitle, BorderLayout.NORTH);
		chat.add(txt_list, BorderLayout.CENTER);
		chat.add(chat_sub, BorderLayout.SOUTH);
		c.add(connect, "����â");
		c.add(chat, "ä��â");
		cl.show(c, "����â");// ***
		setBounds(250, 250, 300, 300);
		setVisible(true);
	}

	@Override
	public void run() {
		System.out.println("������ ���� ��ȣ");

		try {
			client = new Socket(server_ip, port);
			InputStream is = client.getInputStream(); // �Է�
			br = new BufferedReader(new InputStreamReader(is));

			OutputStream os = client.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(os));

			String msg = txt_name.getText();
			pw.println(msg);
			pw.flush();// ����
			txt_input.requestFocus();// ��� �Է��� �� �ֵ��� Ŀ���� �� ��ġ�� ��ġ��Ŵ.

			while (true) {// �ޱ�
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
		System.out.println("��ȣ");

		Object obj = e.getSource();
		if (obj == btn_connect) { // ����
			server_ip = txt_server_ip.getText();
			Thread th = new Thread(this);
			th.start();
			cl.show(c, "ä��â");
		} else if (obj == btn_exit) { // ����
//			pw.close();
//			br.close();
			System.exit(0);
		} else if (obj == btn_send || obj == txt_input) { // ä��
			// �޽��� ����
			String msg = txt_input.getText();
			pw.println(msg);// ä�ó��� ����
			pw.flush();

			txt_input.setText("");
			txt_input.requestFocus();// Ŀ�� ��ġ
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
