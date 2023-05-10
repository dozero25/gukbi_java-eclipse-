package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect_Ex2 {

	public static void main(String[] args) throws SQLException{

		Connection conn = null; // 연결 객체
		PreparedStatement pstmt = null; // 쿼리 실행 객체
		ResultSet rs = null; // 쿼리 결과 담는 객체
		
		String DB_URL = "jdbc:mysql://localhost:3306/grp?charsetEncoding=UTF-8&serverTimezone=UTC";
		String DB_USER = "root";
		String DB_PASSWD = "0000";
		
		
		try {
			// select * from register;
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			// mysql 만들어 놓은 명령어는 대문자
			String query = "SELECT * FROM register ORDER BY userid ASC";
			
			// 쿼리 실행 객체
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery(query);
			while(rs.next()) { // 객체 안에 들어있는 데이터 만큼 반복
				System.out.println("아이디 : " +rs.getString(1) +" / 비밀번호 : "+rs.getString(2)+"");
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
