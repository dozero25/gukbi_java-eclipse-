package test;

import java.util.Scanner;


public class Test6 {
	
	public static void main(String[] args) {
		// 2 - 9 순차적으로 반복
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			int result = num * i;
			System.out.println(num+"단");
			System.out.print(result + " ");
		}
		
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
