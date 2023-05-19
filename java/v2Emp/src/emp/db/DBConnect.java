package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	static Connection conn = null;
	
		public static Connection getConnection() {
			try {
				String url = "jdbc:mysql://localhost:3306/car?charsetEncoding=UTF-8&serverTimezone=UTC";
				String userId = "root";
				String userPw = "0000";
				
				conn = DriverManager.getConnection(url, userId, userPw);
				
			} catch(SQLException sqle) {
				sqle.printStackTrace();
			}
			return conn;
		}

}
