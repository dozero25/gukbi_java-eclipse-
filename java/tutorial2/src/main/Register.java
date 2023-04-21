package main;

import model.Member;

public class Register {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		
		member1.setUserId("dozero25");
		member1.setPassword("1234");
		member1.setAge(26);
		member1.setSalary(3000000);
		
		member1.showMember();
		
		member2.setUserId(null);
		member2.setPassword(null);
		member2.setAge(0);
		member2.setSalary(0);
		
		
		member2.showMember();
		
	}

}
