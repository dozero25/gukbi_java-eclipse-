package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/employees?";
			String user = "employees";
			String pwd = "0000";
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
