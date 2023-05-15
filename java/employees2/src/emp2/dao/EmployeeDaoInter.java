package emp2.dao;

import emp2.model.Employee;

public interface EmployeeDaoInter {
	//사용하는 쪽에서 강제 오버라이드
	
	// INSERT INTO 테이블 명 VALUES(칼럼1, 칼럼2...)
	public void addEmployee(Employee employee);
		
	// SELECT * FROM 테이블 명 WHERE userId = 1;
	public void viewEmployee(int id);
		
	// SELECT * FROM 테이블 명
	public void viewAllEmployee();
		
	//UPDATE 테이블 명 SET 칼럼1, 칼럼2 WHERE userId = 1;
	public void updateEmployee(Employee employee);
		
	// DELETE FROM 테이블 명 WHERE userId = 1;
	public void deleteEmployee(int id);
	

}
