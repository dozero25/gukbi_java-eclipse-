package memter;

import model.Member;

//class Member { // 클래스이면서 타입이 다른 것들의 집합 객체 public
//				// public class는 파일 안에서 한 번만 쓸 수 있음
//	private String userId;
//	private String password;
//	private int age;
//	private double salary;
//	
//	public void printMember() {
//		System.out.println("아이디 : "+getUserId());
//		System.out.println("비밀번호 : "+getPassword());
//		System.out.println("나이 : "+getAge());
//		System.out.println("급여 : "+getSalary());
//		System.out.println();
//	}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//}

public class Register {

	public static void main(String[] args) {
		Member insa = new Member();

		insa.setUserId("dozero25");
		insa.setPassword("1234");
		insa.setAge(26);
		insa.setSalary(3000000);
		
		insa.printMember();
		
		
		Member jajae = new Member();
		jajae.setUserId("dozero26");
		jajae.setPassword("1235");
		jajae.setAge(30);
		jajae.setSalary(5000000);
		
		jajae.printMember();
	}
	
}
