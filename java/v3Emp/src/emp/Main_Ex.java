package emp;

import emp.dao.EmployeeDao;

public class Main_Ex {

	public static void main(String[] args) {
		
		EmployeeDao ed = new EmployeeDao();
		
		ed.insertEmp();
		
		ed.selectEmp();
		
		ed.updateEmp();
		
		ed.deleteEmp();
		

	}

}
