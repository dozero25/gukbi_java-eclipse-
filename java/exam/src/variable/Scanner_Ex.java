package variable;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 정수 x y 를 입력받아 더하는 프로그램, 무한 반복, q를 받으면 프로그램 종료
		
		int x = 0;
		int y = 0;
		
		while(true) {
			System.out.print("x > ");
			x = scanner.nextInt();
			
			System.out.print("y > ");
			y = scanner.nextInt();
			
			int sum = x + y;
			
			System.out.println(sum);
			
			System.out.println("계속 하시겠습니까? (r / q)");
			String select = scanner.next();
			
			if(select.equals("r") || select.equals("R")) {
				continue;
			} else if (select.equals("q") || select.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
		}
		
	}

}
