package com.tech.w05db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	//�ڹٿ��� ����Ŭ�� ����
	
	public static void main(String[] args) {
		//DB����
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "123456";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection(url,user,pass);
			System.out.println("DB���� ����!!");
		} catch (Exception e) {
			System.out.println("DB���� ����!!");
		}
	}
}
