package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertEmp_Ex {

	public static void main(String[] args) {
		// INSERT INTO 테이블명(컬럼1, 컬럼2,  ) VALUES(값1, 값2..);
		// INSERT INTO 테이블명 SET 컬럼1 = 값1, 칼럼2 = 값2...
		
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
			
			String query = "INSERT INTO emp(emp_name, emp_salary, emp_group, emp_regdate) VALUES(?, ?, ?, now());";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "윤도육");
			pstmt.setInt(2, 55000000);
			pstmt.setString(3, "인사과");
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("사원 등록이 완료 되었습니다.");
				System.out.println("EMP_ID\tEMP_NAME\tEMP_SALARY\tEMP_GROUP\tEMP_REGDATE");
				
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
				System.out.println("에러");
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	}

}
