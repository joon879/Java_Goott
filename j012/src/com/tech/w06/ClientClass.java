package com.tech.w06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientClass {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.115", 5005); //2. 서버에 연결요청
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//5. 서버로부터 전달받은 텍스트를 input에 받는다.
		
		String res = input.readLine();
		System.out.println("응답내용: "+res);
		System.exit(0);
	}
}
