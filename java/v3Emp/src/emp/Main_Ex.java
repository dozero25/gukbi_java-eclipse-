package emp;

import java.util.Scanner;

import emp.dao.EmployeeDao;

public class Main_Ex {

	public static void main(String[] args) {
		
		EmployeeDao ed = new EmployeeDao();
		
		EmpView ev = new EmpView();
		
		Scanner sc = new Scanner(System.in);		
		while(true) {
			ev.empAround();
			int choose = sc.nextInt();
			
			if(choose == 1) {
				ed.insertEmp();
			} 
			else if(choose == 2) {
				ed.selectEmp();
			} 
			else if(choose == 3) {
				ed.selectOneEmp();
			} 
			else if(choose == 4) {
				ed.updateEmp();
				ed.selectEmp();
			} 
			else if(choose == 5) {
				ed.deleteEmp();
			} else {
				System.exit(1);
			}
		}

	}

}
