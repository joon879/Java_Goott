package com.tech.w07chat;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ChatServer extends JFrame implements ActionListener{
	
	JButton btnExit;
	TextArea ta;
	Vector vChatList;
	ServerSocket ss;
	Socket sockClient;
	
	
	public ChatServer() {
		setTitle("Gui ä�� ���� Ver. 1.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		vChatList = new Vector();
		btnExit = new JButton("���� ����");
		btnExit.addActionListener(this);
		ta = new TextArea();
		add(ta,BorderLayout.CENTER);
		add(btnExit, BorderLayout.SOUTH);
		
		setBounds(250,250,400,200);		
		setVisible(true);
		
		
		chatStart();
		
	}
	
	public void chatStart() {
		//������ ��ŸƮ
		
		try {
			ss = new ServerSocket(5011);
			while (true) {
				sockClient = ss.accept(); //Ŭ���̾�Ʈ ����
				ta.append(sockClient.getInetAddress().getHostAddress()+"������\n");
				//Ŭ���̾�Ʈ�� ���� �������ּҸ� ����.
				
				ChatHandle threadChat = new ChatHandle(); //������ ȣ��.
				vChatList.add(threadChat); //Ŭ���̾�Ʈ�� ������ ������ ȣ��. Ŭ���̾�Ʈ���� �ڽ��� �����带 ���´�.
				threadChat.start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	class ChatHandle extends Thread{//����Ŭ������ ����. ������ Ŭ����.
		
		BufferedReader br = null; //�Է��غ�
		PrintWriter pw = null; //����غ�
		
		public ChatHandle() {
			try {
				InputStream is = sockClient.getInputStream();//�Է�
				br = new BufferedReader(new InputStreamReader(is));
				OutputStream os = sockClient.getOutputStream();
				pw  = new PrintWriter(new OutputStreamWriter(os));
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void sendAllClient(String msg) {
			//��� Ŭ���̾�Ʈ�� �޽��� ����.
			int size = vChatList.size(); //Ŭ���̾�Ʈ�� ����. Ŭ���̾�Ʈ���� �ڽ��� �����带 ������.
			for (int i = 0; i < size; i++) {
				ChatHandle chr = (ChatHandle) vChatList.elementAt(i);
				chr.pw.println(msg); //�޽��� ���.
				chr.pw.flush(); //��� ����.
				
			}
		}
		
		@Override
		public void run() {
			try {
				String name = br.readLine();
				sendAllClient(name+"�Բ��� ���� ����");
				
				while (true) {
					String msg = br.readLine();
					String str = sockClient.getInetAddress().getHostName(); //��ǻ�� �̸�
					ta.append(msg+"\n");
					if (msg.equals("@@exit")) {
						break;
					}else {
						sendAllClient(name+": "+msg);
						//��� Ŭ���̾�Ʈ�� �޽��� ����.
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				vChatList.remove(this);
				
				try {
					br.close();
					pw.close();
					sockClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("���� ����");
		
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
