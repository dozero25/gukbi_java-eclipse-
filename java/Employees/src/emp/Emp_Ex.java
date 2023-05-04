package emp;

import java.util.Scanner;

import emp.views.EmpView;

public class Emp_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpView ev = new EmpView();

		String select = null;

		while (true) {
			ev.viewMenu();
			System.out.print("메뉴 선택 ");
			select = sc.nextLine();

			if (select.equals("5")) {
				break;
			} else if (select.equals("1")) {

			} else if (select.equals("2")) {

			} else if (select.equals("3")) {

			} else if (select.equals("4")) {

			} else {
				System.out.println("잘못된 입력!! 다시 입력하세요.");
				
			}
		}
		System.out.println("프로그램 종료");

	}

}
