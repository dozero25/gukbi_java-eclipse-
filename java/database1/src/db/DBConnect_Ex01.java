package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect_Ex01 {

	public static void main(String[] args) throws SQLException{
		// 연결 Connection
		// 쿼리 PrepareStatement
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "localhost";
		String port = "3306";
		String dbName = "grp";
		String enc = "charsetEncoding=UTF-8";
		String timezone = "ServerTimezone=UTC";
		
		String dbURL = "jdbc:mysql://"+url+":"+port+"/"+dbName+"?"+enc +"&"+ timezone;
		String dbUser = "root";
		String dbPwd = "0000";
		
		try {
			//성공
			conn = DriverManager.getConnection(dbURL, dbUser, dbPwd);
			
//			String query1 = "INSERT INTO board(subject, writer, content, upload, visit, regdate) "
//					+ "VALUES(?, ?, ?, ?, ?, now())";
//			
//			// pstmt.executeQuery() : 검색
//			// pstmt.executeUpdate() : 저장/수정
//			
//			
//			pstmt = conn.prepareStatement(query1);
//			pstmt.setString(1, "공지사항입니다.");
//			pstmt.setString(2, "관리자.");
//			pstmt.setString(3, "공지합니다. 오늘 새벽에 데이터 점검으로 컴퓨터 사용이 불가합니다.");
//			pstmt.setString(4, "korea.hwp");
//			pstmt.setInt(5, 1);
//			pstmt.executeUpdate();
			
			String delDB = "grp";
			
			String query1 = "DROP DATABASE " + delDB;
			
			pstmt = conn.prepareStatement(query1);
			// 정상동작하면 1 아니면 0
			int result =  pstmt.executeUpdate();
			System.out.println(result);
			
			if(result > 0) {
				System.out.println("데이터베이스가 삭제되었습니다.");
			} else {
				System.out.println("데이터베이스를 삭제할 수 없습니다 \n관리자에게 문의하세요");
			}
			
		} catch (SQLException sqle) {
			// 실패
			sqle.printStackTrace();
			System.out.println("오류");
			
		} finally {
			// 마지막에 무조건 실행
			pstmt.close();
			conn.close();
			
			
			
		}

	}

}
