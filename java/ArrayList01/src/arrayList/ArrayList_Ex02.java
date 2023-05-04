package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Register1 {
	String userId;
	String password;
	String username;

	public Register1() {
	}

	public Register1(String userId, String password, String username) {
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

}

public class ArrayList_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Register1> aList = new ArrayList<>();

		while(aList.size() < 3) {
			System.out.print("아이디 > ");
			String uId = sc.next();
			
			System.out.print("비밀번호 > ");
			String uPw = sc.next();
			
			System.out.print("이름 > ");
			String username = sc.next();
			
			aList.add(new Register1(uId, uPw, username));
		}
		System.out.println("가입 회원 수 : " + aList.size());
		for(Register1 result : aList) {
			System.out.println(result.showRegister());
		}
		
	}

}
