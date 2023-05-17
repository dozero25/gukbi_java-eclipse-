package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteEmp_Ex {

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
			int delEmpId = 3;
			
			String query = "DELETE FROM emp WHERE emp_id = ?;";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, delEmpId);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			if(result > 0) {
				System.out.println(delEmpId+"번 사원을 삭제합니다.");
				
				String sql = "SELECT * FROM emp ORDER BY emp_id DESC";
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(sql);
				
				if(rs.next()) {
					do {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getDate(5));
					}while(rs.next()); 
				}else {
					System.out.println("등록된 사원이 없습니다.");
				}
			} else {
				System.out.println("오류");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
