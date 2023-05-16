package emp2;

import java.util.Scanner;

import emp2.dao.EmployeeDaoImpl;
import emp2.db.DBConnect;
import emp2.model.Employee;
import emp2.view.ViewRepeat;

public class Employee_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Wellcome to KoreaIt Employees System Application");
		
		EmployeeDaoImpl edi = new EmployeeDaoImpl();

		ViewRepeat vr = new ViewRepeat(); 
		
		boolean isFlag = true;
		
		while(isFlag){
			vr.mainRepeat();
			
			System.out.print("Enter Choice > ");
			int ch = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(ch) {
			case 1:
				System.out.println("1.AddEmployee");
				System.out.println();
				
				System.out.print("userId > ");
				String userId = sc.nextLine();
				
				System.out.print("username > ");
				String username = sc.nextLine();
				
				System.out.print("passwd > ");
				String passwd = sc.nextLine();
				
				System.out.print("age > ");
				int age = Integer.parseInt(sc.nextLine());
				
				System.out.print("주소 > ");
				String address = sc.nextLine();
				
				Employee emp = new Employee();
				
				emp.setUserId(userId);
				emp.setUsername(username);
				emp.setPasswd(passwd);
				emp.setAge(age);
				emp.setAddress(address);
				
				edi.addEmployee(emp);
				break;
			case 2:
				System.out.println("2.ViewEmployee");
				System.out.println();
				
				System.out.print("사원 번호 입력 > ");
				int num = Integer.parseInt(sc.nextLine());
				
				edi.viewEmployee(num);
				break;
			case 3:
				System.out.println("3.ViewAllEmployee");
				System.out.println();
				
				edi.viewAllEmployee();
				break;
			case 4:
				System.out.println("4.UpdateEmployee");
				System.out.println();
				
				System.out.print("사원 번호 입력 > ");
				int num1 = Integer.parseInt(sc.nextLine());
				
				System.out.print("userId > ");
				String updateUserId = sc.nextLine();
				
				System.out.print("username > ");
				String updateUsername = sc.nextLine();
				
				System.out.print("passwd > ");
				String updatePasswd = sc.nextLine();
				
				System.out.print("age > ");
				int updateAge = Integer.parseInt(sc.nextLine());
				
				System.out.print("address > ");
				String updateAddress = sc.nextLine();
				
				Employee emp1 = new Employee();
				
				emp1.setUserId(updateUserId);
				emp1.setUsername(updateUsername);
				emp1.setPasswd(updatePasswd);
				emp1.setAge(updateAge);
				emp1.setAddress(updateAddress);
				emp1.setId(num1);
				
				edi.updateEmployee(emp1);
				break;
			case 5:
				System.out.println("5.DeleteEmployee");
				System.out.println();
				
				System.out.print("사원 번호 입력 > ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				edi.deleteEmployee(num2);
				break;
			default :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

}
