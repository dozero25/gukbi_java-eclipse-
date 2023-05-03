package model;

public class Member {

	// 객체
	// 1번 필드
	private String userId;
	private String password;
	private int age;
	private double salary;

	// 생성자 : 객체 초기화 - 처음 값으로ㅓ 어떤 걸 설정할 건지
	
	// getter, setter
	// 객체 지향언어에서 보안 문제나 데이터 보호를 위한 캡슐화 때문에
	
	public Member() {}
	
	public Member(String userId, String password, int age, double salary) {
		this.userId = userId;
		this.password = password;
		this.age = age;
		this.salary = salary;
	}
	
	public void showMember() {
		System.out.println("아이디 : " + getUserId());
		System.out.println("비밀번호 : " + getPassword());
		System.out.println("나이 : " + getAge());
		System.out.println("급여 : " + getSalary());
		System.out.println();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		if(userId.equals("")) {
			userId = "aaa";
			this.userId = userId;
		}
		else {
			this.userId = userId;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.equals("")) {
			password = "123";
			this.password = password;
		}
		else {
			this.password = password;
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age == 0 || age < 20) {
			age = 20;
			this.age = age;
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary == 0) {
			salary = 1000000;
			this.salary = salary;
		}
		this.salary = salary;
	}
	
	
}
