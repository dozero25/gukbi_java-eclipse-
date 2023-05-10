package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect_Ex2 {

	public static void main(String[] args) throws SQLException{

		Connection conn = null; // 연결 객체
		Connection conn2 = null; 
		
		PreparedStatement pstmt = null; // 쿼리 실행 객체
		PreparedStatement pstmt2 = null; 
		
		ResultSet rs = null; // 쿼리 결과 담는 객체
		ResultSet rs2 = null;
		
		String DB_URL = "jdbc:mysql://localhost:3306/grp?charsetEncoding=UTF-8&serverTimezone=UTC";
		String DB_USER = "root";
		String DB_PASSWD = "0000";
		
		
		try {
			// select * from register;
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			conn2 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			// mysql 만들어 놓은 명령어는 대문자
			String query = "SELECT * FROM register ORDER BY userid ASC";
			String query2 = "SELECT * FROM board ORDER BY id DESC";
			
			// 쿼리 실행 객체
			pstmt = conn.prepareStatement(query);
			pstmt2 = conn2.prepareStatement(query2);
			
			rs = pstmt.executeQuery(query);
			rs2 = pstmt2.executeQuery(query2);
			while(rs.next()) { // 객체 안에 들어있는 데이터 만큼 반복
				System.out.println("아이디 : " +rs.getString(1) +" / 비밀번호 : "+rs.getString(2)+"");
			}
			while(rs2.next()) {
				System.out.println("번호 : "+rs2.getInt(1)
				+" / 공지사항 : "+rs2.getString(2)
				+" / 작성자 : "+rs2.getString(3)
				+" / 내용 : "+rs2.getString(4)
				+" / 등록일 : "+rs2.getDate(5));
			}
			
			
		} catch (SQLException sqle) {
			//SQL 구문
			sqle.getStackTrace();
			
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	}

}
