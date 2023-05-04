package emp.repository;

import emp.model.Employee;

public class EmpRepository {

	private Employee[] employees;
	
	public EmpRepository() {
		employees = new Employee[0];
	}
	
	public void addEmp(Employee employee) {
		int index = indexOfEmpty();
		
		if(index == -1) {
			index = increaseArray();
		}
		employees[index] = employee;
	}
	
	private int indexOfEmpty() {
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	private int increaseArray() {
		Employee[] tempArray = new Employee[employees.length + 1];
		for(int i = 0; i < employees.length; i++) {
			tempArray[i] = employees[i];
		}
		return 1;
	}
	
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public int findEmpyByName(String name) {
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null) {
				if(employees[i].getName().equals(name)) {
					return i;
				}
			}
		}
		return -1;
	}

	public Employee getEmp(int index) {
		return employees[index];
	}
	
	public Employee remvoeEmp(int index) {
		Employee employee = employees[index];
		employees[index] = null;
		return employee;
	}
	
	public Employee updateEmp(int index, Employee updateEmployee) {
		Employee employee = employees[index];
		employee.updateEmp(updateEmployee);
		return employee;
	}
	
}
