package test2;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		System.out.println(num+"단");
		for(int i = 1; i < 10; i++) {
			int result = num * i;
			
			System.out.print(result + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i < 10; i++) {
			System.out.println();
			System.out.println(i+"단");
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.print(result + " ");
			}
		}
		
	}
		
}
