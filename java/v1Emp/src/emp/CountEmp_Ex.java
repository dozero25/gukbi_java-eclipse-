package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountEmp_Ex {

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
			
			// 부서별 급여 할계 출력
			String query = "SELECT count(emp_id) as 사원수 FROM emp;";
			
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					System.out.println("사원수 : "+rs.getInt(1)+"명");
				}while(rs.next()); 
			}else {
				System.out.println("등록된 사원이 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
