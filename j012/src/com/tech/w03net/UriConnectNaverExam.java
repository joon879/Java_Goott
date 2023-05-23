package com.tech.w03net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class UriConnectNaverExam {

	//네이버 소스 크롤링
	public static void main(String[] args) throws Exception {
		URL site = new URL("https://dict.naver.com");
		URLConnection url = site.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(),"utf-8"));
		String inLine;
		
		while ((inLine=in.readLine()) != null) {//한줄씩 가져와서 그 값이 널이 아니라면.
			System.out.println(inLine);
		}
		in.close();
	}
}
