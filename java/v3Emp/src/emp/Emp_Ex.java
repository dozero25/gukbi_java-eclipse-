package emp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import emp.db.DBConnect;

public class Emp_Ex {
	static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		
		DBConnect dv = new DBConnect();
		
		dv.getConnection();
		
		int empID = 0;
		String empPWD = "1234";
		int empDepartmentCode = 2;

		String query = "INSERT INTO emp VALUES (0,?,?);";
		
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			pstmt.setString(1, empPWD);
			pstmt.setInt(2, empDepartmentCode);
			
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
