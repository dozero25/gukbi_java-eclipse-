package emp2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	// 데이터베이스 연결 객체를 하나만 만들어 공유해서 사용
	// static => 클래스명.메소드명() - new 사용 x
	
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/emp?charsetEncoding=UTF-8&serverTimezone=UTC";
			String userId = "root";
			String userPw = "0000";
			
			conn = DriverManager.getConnection(url, userId, userPw);
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		return conn;
	}
	
}
