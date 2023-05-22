package emp.domain;

import java.sql.SQLException;

public class Employee {
	private int empID;
	private String empPWD;
	private int empDepartmentCode;
	
	public Employee() {}
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpPWD() {
		return empPWD;
	}

	public void setEmpPWD(String empPWD) {
		if(empPWD.length() < 2) {
			System.out.println("비밀번호 길이가 너무 짧습니다.");
			System.out.println("초기 비밀번호 0000 으로 설정하였습니다. 즉시 변경해주시기 바랍니다.");
			this.empPWD = "0000";
		} else {
			this.empPWD = empPWD;
		}
		
	}

	public int getEmpDepartmentCode() {
		return empDepartmentCode;
	}

	public void setEmpDepartmentCode(int empDepartmentCode) {
		if(empDepartmentCode > 6 ) {
			System.out.println("번호를 잘못입력하셨습니다.");
			System.out.println("1로 초기화 합니다.");
			this.empDepartmentCode = 1;
		} else {
			this.empDepartmentCode = empDepartmentCode;
		}
		
	}
	
	public void showEmpInformention() {
		System.out.println("EMPID\tEMPPWD\tEMP_DEPARTMENT_CODE");
	}
	
	
}
