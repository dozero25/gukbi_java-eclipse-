package mem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import mem.db.DBConnect;
import mem.domain.Member;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	
	DBConnect dc = new DBConnect();
	Member mb = new Member();
	
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void insertMem() {
		System.out.print("이름 : ");
		mb.setMemName(sc.nextLine());
		System.out.print("비밀번호 : ");
		mb.setMemPw(sc.nextLine());
		System.out.print("성별 : ");
		mb.setGender(sc.nextLine());
		System.out.print("자기소개 : ");
		mb.setInfo(sc.nextLine());
		
		String query = "INSERT INTO member VALUES (0, ?, ?, now(), ?, ?)";
		
		try {
			pstmt = DBConnect.getConnection().prepareStatement(query);
			pstmt.setString(1, mb.getMemName());
			pstmt.setString(2, mb.getMemPw());
			pstmt.setString(3, mb.getGender());
			pstmt.setString(4, mb.getInfo());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				
				System.out.println("회원정보 등록");
				String info = "SELECT * FROM member ORDER BY mem_id DESC";
				
				pstmt = dc.getConnection().prepareStatement(info);
				rs = pstmt.executeQuery(info);
				
				if(rs.next()) {
					do {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
					}while(rs.next()); 
				} else {
					System.out.println("등록된 회원이 없습니다.");
				}
			} else {
				System.out.println("회원정보 입력 오류. 관리자 문의");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
