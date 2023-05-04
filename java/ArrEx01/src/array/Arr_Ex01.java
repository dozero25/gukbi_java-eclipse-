package array;

import java.util.Scanner;

class Member {
	private String userId;
	private String password;
	private String username;
	
	public Member() {}
	
	public Member(String userId, String password, String username) {
		this.userId = userId;
		this.password = password;
		this.username = username;
	}
	
	public String showMember() {
		return "아이디 : "+ userId + " | 비밀번호 : "+ password + " | 이름 : "+ username;
	}
	
	public void showInfo() {
		System.out.println("아이디 : "+ userId + " | 비밀번호 : "+ password + " | 이름 : "+ username);
	}
}


public class Arr_Ex01 {

	public static void main(String[] args) {
		/*
			회원 가입 3명 + 생성자 3 + scanner + 생성자 이용해서 저장 출력
			객체 필드 : userId, password, username
			객체 이름 : Member
		 */
		Scanner sc = new Scanner(System.in);
		
		Member[] m = new Member[3];
		for(int i = 0; i < m.length; i++) {
			System.out.print("아이디 > ");
			String uId = sc.next();
			
			System.out.print("비밀번호 > ");
			String uPw = sc.next();
			
			System.out.print("이름 > ");
			String name = sc.next();
			
			m[i] = new Member(uId, uPw, name);
		}
		System.out.println("회원가입이 완료되었습니다.");
		
		System.out.println("가입된 회원 수 : " + m.length);
		for(int i = 0; i < m.length; i++) {
			m[i].showInfo();
		}

	}

}
