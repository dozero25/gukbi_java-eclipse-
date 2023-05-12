package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import view.objectView;


public class Board_Ex {

	public static void main(String[] args){
		// 등록 목록 삭제 수정 종료
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		objectView ov = new objectView();
		
		Subject subject = new Subject();
		conn = subject.getConnection();
		
		boolean isFlag = true;
		while (isFlag) {
			ov.listNum();
			
			System.out.print("선택 > ");
			int menu = Integer.parseInt(sc.next());
			System.out.println();
			
			switch(menu) {
			case 1:
				ov.signLine();
				System.out.println("                       게시물을 등록합니다.");
				ov.signLine();
				
				System.out.print("제목 > ");
				String title = sc.next();
				
				System.out.print("작성자 > ");
				String writer = sc.next();
				
				sc.nextLine();
				
				System.out.print("내용 > ");
				String content = sc.nextLine();
				
				// Scanner 정보를 객체로 받아서 저장하기(setter)
				
				subject.setTitle(title);
				subject.setWriter(writer);
				subject.setContent(content);
				
				String query = "INSERT INTO board(title, writer, content, regdate) VALUES(?, ?, ?, now())";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, subject.getTitle());
					pstmt.setString(2, subject.getWriter());
					pstmt.setString(3, subject.getContent());
					
					int result = pstmt.executeUpdate();
					
					if(result > 0) {
						System.out.println("게시물이 등록되었습니다.");
					} else {
						System.out.println("게시물을 등록할 수 없습니다. \n관리자에게 문의하시기 바랍니다.");
					}
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("데이터베이스를 사용할 수 없습니다.");
				}
				break;
			case 2:
				ov.signLine();
				System.out.println("                     게시물 목록을 보여줍니다.");
				ov.signLine();
				
				String query1 = "SELECT * FROM board ORDER BY b_id DESC";
				
				try {
					pstmt = conn.prepareStatement(query1);
					rs = pstmt.executeQuery(query1);
					
					while(rs.next()) {
						System.out.println("번호 : "+rs.getInt(1)
						+" / 제목 : "+rs.getString(2)
						+" / 작성자 : "+rs.getString(3)
						+" / 내용 : "+rs.getString(4)
						+" / 등록일 : "+rs.getDate(5));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				ov.signLine();
				System.out.println("                      게시물을 삭제합니다.");
				ov.signLine();
				
				System.out.print("삭제할 게시물 번호를 입력하세요 : ");
				int num = sc.nextInt();
				
				String query2 = "DELETE FROM board WHERE b_id="+num;
				
				try {
					pstmt = conn.prepareStatement(query2);
					int result1 = pstmt.executeUpdate();
					
					if(result1 > 0) {
						System.out.println("게시물이 삭제되었습니다.");
					} else {
						System.out.println("게시물을 삭제할 수 없습니다 \n관리자에게 문의하세요");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				ov.signLine();
				System.out.println("                      게시물을 수정합니다.");
				ov.signLine();
				
				System.out.print("수정할 게시물 번호를 입력하세요 : ");
				int num1 = sc.nextInt();
				
				System.out.print("제목 > ");
				String updateTitle = sc.next();
				
				System.out.print("작성자 > ");
				String updateWriter = sc.next();
				
				sc.nextLine();
			
				System.out.print("내용 > ");
				String updateContent = sc.nextLine();		
				
				String query3 = "UPDATE board SET title = '"+updateTitle
						+"', writer = '"+updateWriter
						+"', content = '"+updateContent
						+"' WHERE b_id = "+num1;
				
				subject.setTitle(updateTitle);
				subject.setWriter(updateWriter);
				subject.setContent(updateContent);
				
				try {
					pstmt = conn.prepareStatement(query3);
					
					int result1 = pstmt.executeUpdate();
					if(result1 > 0) {
						System.out.println("게시물이 수정되었습니다.");
					} else {
						System.out.println("게시물을 수정할 수 없습니다 \n관리자에게 문의하세요");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				ov.signLine();
				System.out.println("                      프로그램을 종료합니다.");
				ov.signLine();
				System.exit(0);
			}
		}
		

	}

}
