package operator;

public class LogicalOpt_Ex {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 'B';
		
		if( c1 >= 65 && c1 <= 90) {
			System.out.println("대문자입니다.");
		} else {
			System.out.println("소문자입니다.");
		}
		
		int x = 6;
		
		if(x % 2 == 0 || x % 3 == 0 ) {
			System.out.println("2의 배수 또는 3의 배수입니다.");
		} else {
			System.out.println("2의 배수 또는 3의 배수가 아닙니다.");
		}

	}

}
