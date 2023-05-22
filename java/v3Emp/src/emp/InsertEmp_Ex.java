package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class InsertEmp_Ex {
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
//		DBConnect.getConnection();
		
		Employee ep = new Employee();
		
		ep.setEmpID(0);
		ep.setEmpPWD("2");
		ep.setEmpDepartmentCode(9);
		
		String query = "INSERT INTO emp VALUES (0, ?, ?);";
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			
			pstmt.setString(1, ep.getEmpPWD());
			pstmt.setInt(2, ep.getEmpDepartmentCode());
			
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				System.out.println("사원정보 입력 오류. 관리자 문의");
			} else {
				System.out.println("사원정보 등록");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
