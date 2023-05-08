package emp.model;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private String department;
	
	public Employee (int empId, String empName, int empAge, String department) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.department = department;
	}
	
	public void updateEmp(Employee updateEmp) {
		this.empId = updateEmp.empId;
		this.empName = updateEmp.empName;
		this.empAge = updateEmp.empAge;
		this.department = updateEmp.department;
	}
	
	public void showEmpInfo() {
		System.out.println("[근로자 정보 출력]");
		System.out.println("사원 번호 : " + empId);
		System.out.println("이름 : " + empName);
		System.out.println("나이 : " + empAge);
		System.out.println("부서 : " + department);
	}
	
	public String getName() {
		return empName;
	}
	
	
}
