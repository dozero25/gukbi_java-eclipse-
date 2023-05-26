package test;

class Calculator {
	public void devNum(int num) {
		if(num % 2 == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
	
	public boolean devBoo1(int num) {
		if(num % 2 == 0) {
			System.out.println(false);
			return false;
		}
		System.out.println(true);
		return true;
	}
	
	public boolean devBoo2(int num) {
		return num % 2 == 0;
	}
}

public class Test3 {
	public static void main(String[] args) {
		// 입력한 숫자가 홀수인지 짝수인지 구분
		// 홀수면 true, 짝수면 false 출력
		// 판단은 메소드 Calculator 클래스 생성 후 작성
		
		Calculator c = new Calculator();
		
		c.devNum(3);
		
		c.devBoo1(2);
		
		System.out.println(c.devBoo2(2));
	}
	
	
}
