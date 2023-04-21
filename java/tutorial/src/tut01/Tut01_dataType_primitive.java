/*
 1. 자료형(Data Type)
 - Primitive Type
 	- 정수형 int : 실수가 아닌거
 		- byte(1) : 데이터 전송
 		- short(2) : 
 		- int(4) : 
 		- long(8) : 
 	- 실수형 double : 소수점 있는 것
 		-float : 소수점 자리수가 7자리 이상 오차 발생
 		-double : 소수점 자리수가 15자리 이상 오차 발생
 	- 문자(형) string, char
 	- 논리 boolean => true, false
 	
 - Reference Type
 
 */

package tut01;

public class Tut01_dataType_primitive {

	public static void main(String[] args) {
		
		// 정수를 저장 : 저장할 이름 num, 저장할 값은 100 정수형이니까 int
		// 데이터타입 변수명 = 값;
		
		int num = 100;
		
		// 실수를 저장 : 저장할 이름 d, 저장할 값은 10.0 정수형이니까 double
		// 데이터타입 변수명 = 값;

		double d = 10.0;
		
		char c = 'A';
		System.out.println(c);
		char c1 = 65;
		System.out.println(c1);
		
		boolean b = true;
		
		String s = "abcdef1234";
		System.out.println(s);
		
		System.out.println("--------------------------");
		
		int value = (int) 10.0;
		
		int data = 10;
		//2진수
		System.out.println(Integer.toBinaryString(value)); // binary : 2진수 , 2진수로 변환
		//8진수
		System.out.println(Integer.toOctalString(data));
		//16진수
		System.out.println();
		
		// 여기 아래는 내가 한거
		Person human1 = new Person("도영");
		
		human1.printPerson();
	}

}
class Person{
	String name;
	
	Person(String name) {
		this.name = name;
	}
	
	public void printPerson() {
		System.out.println("이름 : "+ name);
	}
}
