package com.tech.w05db;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DatabaseViewer extends JFrame{
		
	//swing으로 db컨트롤
	
	JTextField code, name, shop, writer, price;
	JButton privButton, nextButton, insertButton, deleteButton, clearButton;
	ResultSet rs;
	Statement stmt;
	
	public DatabaseViewer() throws SQLException {
		Connection con = makeConnection();
		String sql = "select * from bookinfo";
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql); //생성자에서 전체 디비를 가져와 둔다.
						
		
		setTitle("Database Viewer");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,2));
		add(new JLabel("Code"));
		add(code = new JTextField());
		add(new JLabel("Name"));
		add(name = new JTextField());
		add(new JLabel("Shop"));
		add(shop = new JTextField());
		add(new JLabel("Writer"));
		add(writer = new JTextField());
		add(new JLabel("Price"));
		add(price = new JTextField());
		
		privButton = new JButton("priv");
		privButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("priv");
				try {
					rs.previous();
					code.setText(rs.getString("bb_code"));
					name.setText(rs.getString("bb_name"));
					shop.setText(rs.getString("bb_shop"));
					writer.setText(rs.getString("bb_writer"));
					price.setText(""+rs.getInt("bb_price"));
					
					
				} catch (SQLException e1) {
					System.out.println("자료 없음 priv");
				}
				
			}
		});
		nextButton = new JButton("next");
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("next");
				try {
					rs.next();
					code.setText(rs.getString("bb_code"));
					name.setText(rs.getString("bb_name"));
					shop.setText(rs.getString("bb_shop"));
					writer.setText(rs.getString("bb_writer"));
					price.setText(""+rs.getInt("bb_price"));
					
					
				} catch (SQLException e1) {
					System.out.println("자료 없음 next");
				}
			}
		});
		insertButton = new JButton("insert");
		insertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insert");
				String ecode = code.getText();
				String ename = name.getText();
				String eshop = shop.getText();
				String ewriter = writer.getText();
				int eprice = Integer.parseInt(price.getText()); //int로 변환.
								
				
				String sql = "insert into bookinfo values("+"'"+ecode+"','"+ename+"','"+eshop+"','"+ewriter+"',"+eprice+")";
				
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql); //실행
					rs = stmt.executeQuery("select * from bookinfo");
					
				} catch (SQLException e1) {
					
					System.out.println("실패");
				}
			}
		});
		deleteButton = new JButton("delete");
		deleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("delete");
				String ecode = code.getText();
				String sql = "delete from bookinfo where bb_code='"+ecode+"'";
				try {
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery("select from bookinfo");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		clearButton = new JButton("clear");
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clear");
				code.setText("");
				name.setText("");
				shop.setText("");
				writer.setText("");
				price.setText("");
				
			}
		});
		
		add(privButton);
		add(nextButton);
		add(insertButton);
		add(deleteButton);
		add(clearButton);
		
		
		setVisible(true);
	}
	
	private Connection makeConnection() {
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

	public static void main(String[] args) throws SQLException {
		new DatabaseViewer();
						

	}	
}
