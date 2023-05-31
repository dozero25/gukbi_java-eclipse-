package test2;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;
		int num = 0;
		
		System.out.print("학년 : ");
		grade = sc.nextInt();
		
		System.out.print("점수 : ");
		num = sc.nextInt();
		
		if(grade < 4 && num >= 60) {
			System.out.println("합격");
		} else if(grade < 4 && num < 60) {
			System.out.println("불합격");
		} else if(grade >= 4 && num >= 70) {
			System.out.println("합격");
		} else if(grade >= 4 && num < 70) {
			System.out.println("불합격");
		}
		
	}
		
}
