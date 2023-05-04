package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Register2 {
	String userId;
	String password;
	String username;

	public Register2() {
	}

	public Register2(String userId, String password, String username) {
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

public class ArrayList_Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Register2> aList = new ArrayList<>();

		boolean isFlag = true;

		while (isFlag) {
			System.out.println("================================");
			System.out.println("1. 회원가입 2. 회원 목록 3. 회원 삭제 프로그램 종료");
			System.out.println("================================");
			System.out.println();

			System.out.print("선택 > ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("회원가입을 진행합니다.");
				System.out.println("================================");
				System.out.println("");

				System.out.print("아이디 > ");
				String uId = sc.next();

				System.out.print("비밀번호 > ");
				String uPw = sc.next();

				System.out.print("이름 > ");
				String username = sc.next();

				aList.add(new Register2(uId, uPw, username));
				System.out.println("");
				break;
			case 2:
				System.out.println("회원목록");
				System.out.println("================================");
				if (aList.size() < 1) {
					System.out.println("가입된 회원이 없습니다. 회원가입을 먼저 진행해 주세요.");
				} else {
					for (Register2 r : aList) {
						System.out.println(r.showRegister());
					}
				}
				System.out.println("");
				break;
			default:
				System.out.println("프로그램 종료");
				System.exit(0);

			}

		}

	}

}
