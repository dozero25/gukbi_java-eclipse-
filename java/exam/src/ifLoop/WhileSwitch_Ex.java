package ifLoop;

import java.util.Scanner;

public class WhileSwitch_Ex {

	public static void main(String[] args) {
		// Scanner 메뉴 입력
		// 합계 저장할 변수를 하나 만들고
		// I 또는 i를 선택하면 합꼐 변수의 값을 +1
		// M 또는 m을 선택하면 변수 -1
		// Q 또는 q 프로그램 종료
		
		//if 버전
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("i(더하기) m(빼기) q(프로그램 종료)");
			String str = scanner.next();
			if(str.equals("i") || str.equals("I")) {
				sum++;
				System.out.println(sum);
				continue;
			} else if(str.equals("m") || str.equals("M")) {
				sum--;
				System.out.println(sum);
				continue;
			} else if(str.equals("q") || str.equals("Q")) {
				System.out.println(sum);
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		// switch 버전
		while(true) {
			System.out.print("i(더하기) m(빼기) q(프로그램 종료)");
			String str2 = scanner.next();
			switch(str2) {
			case "I" :
			case "i" : 
				sum++;
				System.out.println(sum);
				break;
			case "M" :
			case "m" : 
				sum--;
				System.out.println(sum);
				break;
			case "Q" :
			case "q" : 
				System.out.println(sum);
				System.out.println("프로그램 종료");
				System.exit(0);;
			}
		}

	}

}
