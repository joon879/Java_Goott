package com.tech.w03net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class UriConnectNaverExam {

	//���̹� �ҽ� ũ�Ѹ�
	public static void main(String[] args) throws Exception {
		URL site = new URL("https://dict.naver.com");
		URLConnection url = site.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(),"utf-8"));
		String inLine;
		
		while ((inLine=in.readLine()) != null) {//���پ� �����ͼ� �� ���� ���� �ƴ϶��.
			System.out.println(inLine);
		}
		in.close();
	}
}
