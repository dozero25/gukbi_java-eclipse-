package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import emp2.db.DBConnect;
import emp2.model.Employee;

// Dao = Repository = 비즈니스 로직 처리 => 데이터베이스 입출력
public class EmployeeDaoImpl implements EmployeeDaoInter{

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	@Override
	public void addEmployee(Employee employee) {
		String sql = "INSERT INTO employees(userId, username, passwd, regdate, age, address) VALUES(?, ?, ?, now(), ?, ?)";
		conn = DBConnect.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, employee.getUserId());
			pstmt.setString(2, employee.getUsername());
			pstmt.setString(3, employee.getPasswd());
			pstmt.setInt(4, employee.getAge());
			pstmt.setString(5, employee.getAddress());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("Add Employee Successfully.");
			} else {
				System.out.println("Error!! Contact the manager");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void viewEmployee(int id) {
		String sql = "SELECT * FROM employees WHERE id = "+id;
		conn = DBConnect.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print("ID : "+rs.getInt(1) +"\t");
				System.out.print("/ UserId : "+rs.getString(2)+"\t");
				System.out.print("/ Username : "+rs.getString(3)+"\t");
				System.out.print("/ Passwd : "+rs.getString(4)+"\t");
				System.out.print("/ Regdate : "+rs.getDate(5)+"\t");
				System.out.print("/ Age : "+rs.getInt(6)+"\t");
				System.out.println("/ Address : "+rs.getString(7)+"\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void viewAllEmployee() {
		String sql = "SELECT * FROM employees ORDER BY id DESC";
		
		conn = DBConnect.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print("ID : "+rs.getInt(1) +"\t");
				System.out.print("UserId : "+rs.getString(2)+"\t");
				System.out.print("Username : "+rs.getString(3)+"\t");
				System.out.print("Passwd : "+rs.getString(4)+"\t");
				System.out.print("Regdate : "+rs.getDate(5)+"\t");
				System.out.print("Age : "+rs.getInt(6)+"\t");
				System.out.println("Address : "+rs.getString(7)+"\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		String sql = "UPDATE employees SET userId = ?, username = ?, passwd = ?, age = ?, address = ? WHERE id = ?";
		
		conn = DBConnect.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, employee.getUserId());
			pstmt.setString(2, employee.getUsername());
			pstmt.setString(3, employee.getPasswd());
			pstmt.setInt(4, employee.getAge());
			pstmt.setString(5, employee.getAddress());
			pstmt.setInt(6, employee.getId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("Update Employee Successfully.");
			} else {
				System.out.println("Error!! Contact the manager");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		String sql = "DELETE FROM employees WHERE id="+id;
		
		conn = DBConnect.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("Delete Employee Successfully.");
			} else {
				System.out.println("Error!! Contact the manager");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
