package model;

public class Member { 
	
	private String userId;
	private String password;
	private int age;
	private double salary;
	
	public void printMember() {
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + password);
		System.out.println("나이 : " + age);
		System.out.println("급여 : " + salary);
		System.out.println();
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
