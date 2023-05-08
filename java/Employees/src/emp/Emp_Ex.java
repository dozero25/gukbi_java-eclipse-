package emp;

import java.util.Scanner;

import emp.repository.EmpRepository;
import emp.service.EmpService;
import emp.views.EmpView;

public class Emp_Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmpView ev = new EmpView();
		EmpService empService = new EmpService(scanner, new EmpRepository());

		String select = null;

		while (true) {
			ev.viewMenu();
			System.out.print("메뉴 선택 : ");
			select = scanner.next();

			if (select.equals("6")) {
				break;
			} else if (select.equals("1")) {
				empService.showEmps();
			} else if (select.equals("2")) {
				empService.registerEmp();
			} else if (select.equals("3")) {
				empService.showEmp();
			} else if (select.equals("4")) {
				empService.modifyEmp();
			} else if (select.equals("5")) {
				empService.deleteEmp();
			} 
			else {
				System.out.println("잘못된 입력!! 다시 입력하세요.");
				
			}
		}
		System.out.println("프로그램 종료");

	}

}
