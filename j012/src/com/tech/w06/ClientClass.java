package com.tech.w06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientClass {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.115", 5005); //2. ������ �����û
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//5. �����κ��� ���޹��� �ؽ�Ʈ�� input�� �޴´�.
		
		String res = input.readLine();
		System.out.println("���䳻��: "+res);
		System.exit(0);
	}
}
