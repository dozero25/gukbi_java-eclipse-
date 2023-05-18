package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;

public class InsertEmp {

	public static void main(String[] args) {
		DBConnect dbc = new DBConnect();
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
		
		dbc.getConnection();
		
		String query = "INSERT INTO emp(emp_name, emp_salary, emp_group, emp_regdate) VALUES(?, ?, ?, now());";
		
		try {
			pstmt = dbc.getConnection().prepareStatement(query);
			
			pstmt.setString(1, "윤영영");
			pstmt.setInt(2, 78000000);
			pstmt.setString(3, "개발과");
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("사원 등록이 완료 되었습니다.");
				System.out.println("EMP_ID\tEMP_NAME\tEMP_SALARY\tEMP_GROUP\tEMP_REGDATE");
				
				String sql = "SELECT * FROM emp ORDER BY emp_id DESC";
				
				pstmt = dbc.getConnection().prepareStatement(sql);
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
