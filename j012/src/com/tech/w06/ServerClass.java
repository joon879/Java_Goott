package com.tech.w06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5005); //1. 서버를 먼저 준비한다.(포트넘버 5005, 객체 생성)
		System.out.println("서버 준비");
		
		try {
			while (true) {
				Socket socket = ss.accept(); //3. 클라이언트의 연결요청에 대한 응답.
				
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("홍길동 메시지 전달"); //4. 서버에서 텍스트를 출력(전달, 클라이언트로).
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("서버 종료");
			ss.close();
		}
		
	}
}
