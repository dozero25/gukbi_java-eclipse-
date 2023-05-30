package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test8 {
	
	public static void main(String[] args) {
		// DB 입출력
		// 1. 연결 -> Connection 객체(연결 정보가 필요) -> DriverManager
		// 2. 쿼리 실행 : PreparedStatement 객체
		// 3. (출력) : ResultSet 객체
		
		String url ="jdbc:mysql://localhost:3306/koreaitdb";
		String id ="koreadb";
		String pw ="0000";

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			
			// primary key 없을 경우 : insert into member values (1, '도제로', '0000');
			
			// primary key 있을 경우
			String query = "INSERT INTO member(mem_n, mem_pw) VALUES(?, ?);";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "dozero");
			pstmt.setString(2, "0000");
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("회원가입 완료");
			}
			else {
				System.out.println("오류");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
