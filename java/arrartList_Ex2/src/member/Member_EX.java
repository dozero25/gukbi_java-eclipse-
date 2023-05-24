package member;

import java.util.ArrayList;
import java.util.List;
import member.domain.Member;

public class Member_EX {

	public static void main(String[] args) {
		
		List<Member> memList = new ArrayList<>();
		Member mem = null; // 전역변수
		int num = 1;
		String id = "aaa";
		String pw = "1234";
		String name = "홍길동";

		
		for(int i = 0; i < 10; i++) {
			mem = new Member();
			
			mem.setMeNum(num++);
			mem.setMeId(id);
			mem.setMePw(pw);
			mem.setMeName(name);
			
			memList.add(mem);

		}
		
		memList.remove(4);
		mem.showMem(memList);
		
		
	}

}
