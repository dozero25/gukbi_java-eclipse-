package emp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class EmployeeDao {
	
	DBConnect dbc = new DBConnect();
	
	Employee ep = new Employee();
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void insertEmp() {
		ep.setEmpID(0);
		ep.setEmpPWD("48688");
		ep.setEmpDepartmentCode(2);
		
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
			
			e.printStackTrace();
		}
	}
	
	public void selectEmp() {
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
	
	public void updateEmp() {
		String query = "UPDATE emp SET emp_pwd = ?, emp_department_code = ? where emp_id = ?;";
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			
			pstmt.setString(1, "8888");
			pstmt.setInt(2, 1);
			pstmt.setInt(3, 5);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("사원 수정이 완료 되었습니다.");
				String show = "SELECT * FROM emp ORDER BY emp_id DESC";
				rs = pstmt.executeQuery(show);
				if(rs.next()) {
					do {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
					}while(rs.next()); 
				}else {
					System.out.println("등록된 사원이 없습니다.");
				}
			} else {
				System.out.println("에러");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteEmp() {
		String query = "DELETE FROM emp where emp_id = ?";
		
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			pstmt.setInt(1, 7);
			
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				System.out.println("사원정보 삭제 오류. 관리자 문의");
			} else {
				System.out.println("사원정보 삭제");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
