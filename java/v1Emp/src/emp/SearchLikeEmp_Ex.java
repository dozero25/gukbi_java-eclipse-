package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchLikeEmp_Ex {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mysql://localhost:3306/employees?charsetEncoding=UTF-8&serverTimezone=UTC";
		String dbUser = "employees";
		String dbPwd = "0000";
		
		try {
			conn = DriverManager.getConnection(dbURL, dbUser, dbPwd);
			System.out.println("Mysql "+dbUser+"에 접속이 가능합니다.");
			System.out.println();
			
//			String serarchWord = "도";
//			String query = "SELECT emp_name, emp_salary FROM emp WHERE emp_name LIKE '%"+serarchWord+"%';";
			
			String searchWrod = "홍";
			String query = "SELECT emp_name, emp_salary FROM emp WHERE emp_name LIKE '"+searchWrod+"%%';";
			
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					System.out.println(rs.getString(1) + "\t"+ rs.getInt(2));
				}while(rs.next()); 
			}else {
				System.out.println("등록된 사원이 없습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
