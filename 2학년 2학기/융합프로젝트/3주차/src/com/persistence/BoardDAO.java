package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.oracle.DBConnection;

public class BoardDAO {
			
	public BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		}
	}
	public ArrayList<BoardDTO> selectAll(){
		ArrayList<BoardDTO> dtos = new ArrayList<BoardDTO>();
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String SQL = "SELECT * FROM BOARD";
		try {
			conn = getConnection();												
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {				
				int no = rs.getInt("NO");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String id = rs.getString("ID");
				LocalDateTime regDateTime = rs.getTimestamp("REGDATE").toLocalDateTime();				
				BoardDTO dto = new BoardDTO(no,title,content,id,regDateTime);
				dtos.add(dto);
			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return dtos;		
	}
	public int insert(BoardDTO dto) {
		return 0;
	}
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "TEST3";
			String pw = "123";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);			

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}
}
