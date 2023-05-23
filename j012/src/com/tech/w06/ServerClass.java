package com.tech.w06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5005); //1. ������ ���� �غ��Ѵ�.(��Ʈ�ѹ� 5005, ��ü ����)
		System.out.println("���� �غ�");
		
		try {
			while (true) {
				Socket socket = ss.accept(); //3. Ŭ���̾�Ʈ�� �����û�� ���� ����.
				
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("ȫ�浿 �޽��� ����"); //4. �������� �ؽ�Ʈ�� ���(����, Ŭ���̾�Ʈ��).
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("���� ����");
			ss.close();
		}
		
	}
}
