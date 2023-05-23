package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest2 {
	public static void main(String[] args) throws SQLException {
		
		addBook("0007", "java8", "goott미디어", "갓창제", 20000); //인서트 기능을 함수로 뻈음.
				
	}
	
	public static void addBook(String code, String name, String shop, String writer, int price) throws SQLException {
		Connection con = makeConnection();
		
		//DB에 데이터 삽입. (insert)
//		String code;
//		String name;
//		String shop;
//		String writer;
//		int price;
		
		
		String sql = "insert into bookinfo values("+"'"+code+"','"+name+"','"+shop+"','"+writer+"',"+price+")";
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql); //executeUpdate()
		System.out.println("실행결과: "+count);
	}

	private static Connection makeConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "123456";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
		}

		return con;
	}
}
