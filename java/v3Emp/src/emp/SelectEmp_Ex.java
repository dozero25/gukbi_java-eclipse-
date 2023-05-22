package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class SelectEmp_Ex {

	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
		String query = "SELECT * FROM emp ORDER BY emp_id ASC, emp_department_code DESC;";
		
		try {
			pstmt =  DBConnect.getConnection().prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "\t"+ rs.getString(2)+"\t"+ rs.getInt(3));
				} while(rs.next());
			} else {
				System.out.println("등록된 사원이 없습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
