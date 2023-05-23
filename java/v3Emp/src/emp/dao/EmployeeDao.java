package emp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import emp.EmpView;
import emp.db.DBConnect;
import emp.domain.Employee;

public class EmployeeDao {
	Scanner sc = new Scanner(System.in);
	
	DBConnect dbc = new DBConnect();
	
	Employee ep = new Employee();
	EmpView ev = new EmpView();
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void insertEmp() {
		System.out.print("비밀번호 : ");
		ep.setEmpPWD(sc.nextLine());
		System.out.print("부서 : ");
		ep.setEmpDepartmentCode(sc.nextInt());
		
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
		System.out.println();
	}
	
	public void selectEmp() {
		String query = "SELECT * FROM emp ORDER BY emp_id ASC, emp_department_code DESC;";
		
		try {
			pstmt =  DBConnect.getConnection().prepareStatement(query);
			rs = pstmt.executeQuery();
			
			ev.empInfor();
			
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
		System.out.println();
	}
	
	public void selectOneEmp() {
		String query = "SELECT * FROM emp WHERE emp_id = ?;";
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			System.out.print("사원 번호 : ");
			pstmt.setInt(1, sc.nextInt());
			rs = pstmt.executeQuery();
			
			ev.empInfor();
			
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
		System.out.println();
	}
	
	public void updateEmp() {
		String query = "UPDATE emp SET emp_pwd = ?, emp_department_code = ? where emp_id = ?;";
		
		System.out.print("사원 번호 : ");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String b = sc.nextLine();
		
		System.out.print("부서 : ");
		int c = sc.nextInt();
		
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			
			pstmt.setInt(3, a);
			
			pstmt.setString(1, b);
			
			pstmt.setInt(2, c);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("사원 수정이 완료 되었습니다.");
			} else {
				System.out.println("에러");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void deleteEmp() {
		String query = "DELETE FROM emp where emp_id = ?";
		
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			System.out.print("사원 번호: ");
			pstmt.setInt(1, sc.nextInt());
			
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
		System.out.println();
	}
	
	

}
