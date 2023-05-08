package emp.service;

import java.util.Scanner;

import emp.model.Employee;
import emp.repository.EmpRepository;

public class EmpService {
	
	private Scanner scanner;
	private EmpRepository empRepository;
	
	public EmpService(Scanner scanner, EmpRepository empRepository) {
		this.scanner = scanner;
		this.empRepository = empRepository;
	}
	
	public void registerEmp() {
		int empId;
		String empName;
		int empAge;
		String department;
		
		System.out.println("[사원정보 등록]");
		System.out.print("사원번호 : ");
		empId = scanner.nextInt();
		
		System.out.print("이름 : ");
		empName = scanner.next();
		
		System.out.print("나이 : ");
		empAge = scanner.nextInt();
		
		System.out.print("부서 : ");
		department = scanner.next();
		
		Employee employee = new Employee(empId, empName, empAge, department);
		empRepository.addEmp(employee);
	}
	
	public void showEmps() {
		Employee[] employees = empRepository.getEmployees();
		
		for(int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			if(employee != null) {
				employee.showEmpInfo();
			}
		}
	}
	
	private int indexOf() {
		String name;
		
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		
		return empRepository.findEmpyByName(name);
	}
	
	public void showEmp() {
		System.out.println("[사원 정보 이름으로 조회]");
		int index = indexOf();
		
		if(compareEmp(index) == -1) {
			return;
		}
		empRepository.getEmp(index).showEmpInfo();
		System.out.println("조회완료!");
		System.out.println();
	}
		
	public void modifyEmp() {
		System.out.println("[사원 정보 이름으로 수정]");
		int index = indexOf();
		
		int empId;
		String empName;
		int empAge;
		String department;
		
		if(compareEmp(index) == -1) {
			return;
		}
		
		System.out.println("[근로자정보 등록]");
		System.out.print("사원번호 : ");
		empId = scanner.nextInt();
		
		System.out.print("이름 : ");
		empName = scanner.next();
		
		System.out.print("나이 : ");
		empAge = scanner.nextInt();
		
		System.out.print("부서 : ");
		department = scanner.next();
		
		Employee updateEmployee = new Employee(empId, empName, empAge, department);
		
		empRepository.updateEmp(index, updateEmployee);
		System.out.println("수정 완료!");
		System.out.println();
	}
	
	public void deleteEmp() {
		System.out.println("[사원 정보 이름으로 삭제]");
		int index = indexOf();
		

		if(compareEmp(index) == -1) {
			return;
		}
		
		empRepository.removeEmp(index).showEmpInfo();
		System.out.println();
	}
	
	public int compareEmp(int index) {
		
		if(index == -1) {
			System.out.println("입력한 이름의 사원은 등록되어 있지 않습니다.");
		}
		return index;
		
	}

}
