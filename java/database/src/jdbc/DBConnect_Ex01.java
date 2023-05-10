package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect_Ex01 {

	public static void main(String[] args) throws SQLException {
		// java < jdbc > mysql 연결해서 연결이 되면 "연결 되었습니다."

		Connection conn = null; // 연결 객체 사용 준비
		
		String DB_URL = "jdbc:mysql://localhost:3306/grp?charsetEncoding=UTF-8&serverTimezone=UTC";
		String DB_USER = "root";
		String DB_PASSWD = "0000";
		
		
		//드라이브 매니저에 등록
		try {
			// 정상적으로 연결이 된다면...
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			System.out.println("Mysql Database에 연결 되었습니다.");
		} catch (SQLException e) {
			// 예외가 생긴다면
			e.printStackTrace();
			System.out.println("Mysql Database에 연결할 수 없습니다. \n 관리자에게 문의하세요.");
		} finally {
			// 정상적으로 실행이 되는지 예외가 생기든지 상관없이 무조건 마지막에 실행
			conn.close();
		}
	}

}
