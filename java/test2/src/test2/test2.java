package test2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isFlag = true;
		
		while(isFlag) {
			System.out.print("입력 : ");
			String eng = sc.nextLine();
			
			System.out.println(eng.toUpperCase()); 
			
			if(eng.equals("end") || eng.equals("END")) {
				System.out.println("시스템 종료");
				System.exit(1);
			}
			
		}
	}
		
}
