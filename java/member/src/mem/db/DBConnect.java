package mem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/koreait12?";
			String user = "koreait2";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, user, pwd);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
}
