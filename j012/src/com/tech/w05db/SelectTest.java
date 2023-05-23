package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		
		//DB의 bookinfo를 자바로 가져오기. (select)
		Statement stmt = con.createStatement();
		String sql = "select * from bookinfo"; //오라클에서 작성한 쿼리.
		ResultSet rs = stmt.executeQuery(sql); //executeQuery()
		
		
		while (rs.next()) {
			//받아서 출력
			String code = rs.getString("bb_code");
			String name = rs.getString("bb_name");
			String shop = rs.getString("bb_shop");
			String writer = rs.getString("bb_writer");
			int price = rs.getInt("bb_price");
			
			//화면에 출력
			System.out.println(code+":"+name+":"+shop+":"+writer+":"+price);
		}
		
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
