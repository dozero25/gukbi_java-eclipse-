package mem;

import mem.dao.MemberDao;
import mem.db.DBConnect;

public class Member_Ex {

	public static void main(String[] args) {
		
		DBConnect dbc = new DBConnect();
		
		MemberDao md = new MemberDao();
		
		dbc.getConnection();
		
		md.insertMem();
		
		

	}

}
