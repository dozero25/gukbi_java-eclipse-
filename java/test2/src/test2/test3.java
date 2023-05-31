package test2;


class Calculator {
	
	public boolean oddEven(int a) {
		if(a / 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}

public class test3 {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.oddEven(10));;
	}
		
}
