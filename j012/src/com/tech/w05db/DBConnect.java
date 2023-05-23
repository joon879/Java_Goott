package com.tech.w05db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	//자바에서 오라클에 접속
	
	public static void main(String[] args) {
		//DB연결
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "123456";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection(url,user,pass);
			System.out.println("DB연결 성공!!");
		} catch (Exception e) {
			System.out.println("DB연결 실패!!");
		}
	}
}
