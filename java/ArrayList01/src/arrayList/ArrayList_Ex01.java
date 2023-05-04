package arrayList;

import java.util.ArrayList;
import java.util.List;

class Company { // 강제성이 없다.
	String companyName;
	String companyURL;
}

class Mall extends Company {
	String ItemName;
	String ItemPrice;
}

class Register extends Company {
	String userId;
	String password;
	String username;

	public Register() {
	}

	public Register(String userId, String password, String username) {
		this.userId = userId;
		this.password = password;
		this.username = username;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String showRegister() {
		return "아이디 : " + userId + " | 비밀번호 : " + password + " | 이름 : " + username;
	}

	public void showInfo() {
		System.out.println(showRegister());
	}

}

public class ArrayList_Ex01 {

	public static void main(String[] args) {
		// List, 생성자로 저장, scanner, 3명만
		// 저장은 객체명.add 배열개수는 객체명.size();
		// 생성자를 이용해서 1명 저장 - new 생성자

//		List<Register> register = new ArrayList<>();
//
//		register.add(new Register("dozero", "1234", "윤도영"));
//
//		for (Register r : register) {
//			System.out.println(r.showRegister());
//		}
		
		List<Register> list = new ArrayList<>();
		
		Register r0 = new Register();
		Register r1 = new Register();
		
		r0.setUserId("dozero");
		r0.setPassword("1234");
		r0.setUsername("윤도영");
		
		list.add(r0);
		
		r1.setUserId("dozero1");
		r1.setPassword("12345");
		r1.setUsername("윤도일");
		
		list.add(r1);
		
		for(Register r_0 : list) {
			r_0.showInfo();
			System.out.println(r_0.showRegister());
		}

	}

}
