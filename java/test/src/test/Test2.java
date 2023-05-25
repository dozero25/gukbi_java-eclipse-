package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 영문자를 입력한 후 입력한 영문자를 대문자로 변환하여 출력, upercase()
		String eng = null;
		
		System.out.print("입력 : ");
		eng = sc.nextLine();
		
		String upperEng = eng.toUpperCase();
		
		System.out.print("UpperCase : ");
		System.out.println(upperEng);
		
		String lowerEng = upperEng.toLowerCase();
		System.out.print("LowerCase : ");
		System.out.println(lowerEng);
		
		// 2. 사용자가 q를 누를 때까지는 계속 반속

		boolean isFlag = true;
		String stop = null;
		
		while(true) {
			System.out.print("입력 : ");
			stop = sc.nextLine();
			
			if(stop.equals("q") || stop.equals("Q")) {
				System.out.println("멈춰!");
				break;
				// break : break에서 가장 가까운 반복문을 벗어남
			}
		}
		System.out.println("시스템 종료");
	}

}
