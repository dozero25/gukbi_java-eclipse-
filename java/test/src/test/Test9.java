package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test9 {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/koreaitdb";
		String id ="koreadb";
		String pw ="0000";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pw);

			String query = "SELECT * FROM member ORDER BY mem_id DESC";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t이름\t비밀번호");
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				} while(rs.next());
			} else {
				System.out.println("정보가 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
