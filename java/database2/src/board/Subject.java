package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class Subject {
	private int bId;
	private String title;
	private String writer;
	private String content;
	private LocalDate regdate;
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getRegdate() {
		return regdate;
	}
	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/groupware?charsetEncoding=UTF-8&serverTimezone=UTC";
		String uid = "root";
		String upwd = "0000";
		
		try {
			conn = DriverManager.getConnection(url, uid, upwd);
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.out.println("연결 실패");
		}
		
		return conn;
	}
	
	

}
