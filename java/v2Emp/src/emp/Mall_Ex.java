package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;

public class Mall_Ex {
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		
		DBConnect dbc = new DBConnect();
		
//		dbc.getConnection()	
		
		System.out.println("=== 자동차 전문 판매 사이트===");
		System.out.println("자동차 판매 회사 카테고리를 보여줍니다.");
		
		String cate = "select\r\n"
				+ "c.car_id,\r\n"
				+ "ct.type_name,\r\n"
				+ "cp.car_price\r\n"
				+ "from\r\n"
				+ "car c\r\n"
				+ "left outer join carPrice cp on(c.type_id = cp.type_id)\r\n"
				+ "left outer join carType ct on(c.type_id = ct.type_id)\r\n"
				+ "ORDER BY c.car_id DESC LIMIT 1 ;";
		
		try {
			pstmt = dbc.getConnection().prepareCall(cate);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1)+"번 \t차종 : "+rs.getString(2)+"\t/ 가격 : "+rs.getInt(3));
				} while(rs.next()); 
			} else {
				System.out.println("카테고리가 없습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("차종 번호를 선택하세요");;
		int choice = 1;
		
		String selCar = "INSERT INTO car VALUES (0, ?);";
		
		try {
			pstmt = dbc.getConnection().prepareCall(selCar);
			pstmt.setInt(1, choice);
			int result = pstmt.executeUpdate();
			
			if(result > 0 ) {
				System.out.println("사원 등록이 완료 되었습니다.");
				
				System.out.println();
				
				String show = "select\r\n"
						+ "c.car_id,\r\n"
						+ "ct.type_name,\r\n"
						+ "cp.car_price\r\n"
						+ "from\r\n"
						+ "car c\r\n"
						+ "left outer join carPrice cp on(c.type_id = cp.type_id)\r\n"
						+ "left outer join carType ct on(c.type_id = ct.type_id)\r\n"
						+ "where ct.type_id = "+choice+";";
				
				pstmt = dbc.getConnection().prepareStatement(show);
				rs = pstmt.executeQuery(show);
				
				
			} else {
				System.out.println("에러");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
